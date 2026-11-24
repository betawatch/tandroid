// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class zd7 extends z4a {
    public final ArrayList a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zd7(String str, ArrayList arrayList) {
        super(r3, null);
        String str2;
        str.getClass();
        if (arrayList.size() == 1) {
            str2 = "Field '" + ((String) arrayList.get(0)) + "' is required for type with serial name '" + str + "', but it was missing";
        } else {
            str2 = "Fields " + arrayList + " are required for type with serial name '" + str + "', but they were missing";
        }
        this.a = arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd7(ArrayList arrayList, String str, zd7 zd7Var) {
        super(str, zd7Var);
        arrayList.getClass();
        this.a = arrayList;
    }
}
