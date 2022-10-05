// HASH COLLISIONS: YES
// timestamp: 1.664867880596E12

package main;

import com.area9innovation.flow.*;

public class Struct_pMul extends Struct {
	public Struct f_p1;
	public Struct f_p2;

	public Struct_pMul() {}
	public Struct_pMul(Struct a_p1, Struct a_p2) {
		f_p1 = a_p1;
		f_p2 = a_p2;
	}

	public int getTypeId() { return 108; }
	public String getTypeName() { return "pMul"; }

	private static final String[] field_names = new String[] {
		"p1", "p2"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.STRUCT, RuntimeType.STRUCT
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_p1, f_p2
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 2)
			throw new IndexOutOfBoundsException("Invalid field count in pMul");
		f_p1 = (Struct)values[0];
		f_p2 = (Struct)values[1];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 108) return 108-tmp;
		Struct_pMul other = (Struct_pMul)other_gen;
		tmp = f_p1.compareTo(other.f_p1);
		if (tmp != 0) return tmp;
		tmp = f_p2.compareTo(other.f_p2);
		return tmp;
	}
}
