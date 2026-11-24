// default package

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class yle {
    public static final yle b;
    public static final yle c;
    public static final yle[] d;
    public static final /* synthetic */ yle[] e;
    public final byte a;

    /* JADX INFO: Fake field, exist only in values array */
    yle EF0;

    static {
        ppe ppeVar = ppe.f;
        yle yleVar = new yle("DOUBLE", 0, 0, 1, ppeVar);
        ppe ppeVar2 = ppe.e;
        yle yleVar2 = new yle("FLOAT", 1, 1, 1, ppeVar2);
        ppe ppeVar3 = ppe.d;
        yle yleVar3 = new yle("INT64", 2, 2, 1, ppeVar3);
        yle yleVar4 = new yle("UINT64", 3, 3, 1, ppeVar3);
        ppe ppeVar4 = ppe.c;
        yle yleVar5 = new yle("INT32", 4, 4, 1, ppeVar4);
        yle yleVar6 = new yle("FIXED64", 5, 5, 1, ppeVar3);
        yle yleVar7 = new yle("FIXED32", 6, 6, 1, ppeVar4);
        ppe ppeVar5 = ppe.h;
        yle yleVar8 = new yle("BOOL", 7, 7, 1, ppeVar5);
        ppe ppeVar6 = ppe.n;
        yle yleVar9 = new yle("STRING", 8, 8, 1, ppeVar6);
        ppe ppeVar7 = ppe.w;
        yle yleVar10 = new yle("MESSAGE", 9, 9, 1, ppeVar7);
        ppe ppeVar8 = ppe.r;
        yle yleVar11 = new yle("BYTES", 10, 10, 1, ppeVar8);
        yle yleVar12 = new yle("UINT32", 11, 11, 1, ppeVar4);
        ppe ppeVar9 = ppe.s;
        yle yleVar13 = new yle("ENUM", 12, 12, 1, ppeVar9);
        yle yleVar14 = new yle("SFIXED32", 13, 13, 1, ppeVar4);
        yle yleVar15 = new yle("SFIXED64", 14, 14, 1, ppeVar3);
        yle yleVar16 = new yle("SINT32", 15, 15, 1, ppeVar4);
        yle yleVar17 = new yle("SINT64", 16, 16, 1, ppeVar3);
        yle yleVar18 = new yle("GROUP", 17, 17, 1, ppeVar7);
        yle yleVar19 = new yle("DOUBLE_LIST", 18, 18, 2, ppeVar);
        yle yleVar20 = new yle("FLOAT_LIST", 19, 19, 2, ppeVar2);
        yle yleVar21 = new yle("INT64_LIST", 20, 20, 2, ppeVar3);
        yle yleVar22 = new yle("UINT64_LIST", 21, 21, 2, ppeVar3);
        yle yleVar23 = new yle("INT32_LIST", 22, 22, 2, ppeVar4);
        yle yleVar24 = new yle("FIXED64_LIST", 23, 23, 2, ppeVar3);
        yle yleVar25 = new yle("FIXED32_LIST", 24, 24, 2, ppeVar4);
        yle yleVar26 = new yle("BOOL_LIST", 25, 25, 2, ppeVar5);
        yle yleVar27 = new yle("STRING_LIST", 26, 26, 2, ppeVar6);
        yle yleVar28 = new yle("MESSAGE_LIST", 27, 27, 2, ppeVar7);
        yle yleVar29 = new yle("BYTES_LIST", 28, 28, 2, ppeVar8);
        yle yleVar30 = new yle("UINT32_LIST", 29, 29, 2, ppeVar4);
        yle yleVar31 = new yle("ENUM_LIST", 30, 30, 2, ppeVar9);
        yle yleVar32 = new yle("SFIXED32_LIST", 31, 31, 2, ppeVar4);
        yle yleVar33 = new yle("SFIXED64_LIST", 32, 32, 2, ppeVar3);
        yle yleVar34 = new yle("SINT32_LIST", 33, 33, 2, ppeVar4);
        yle yleVar35 = new yle("SINT64_LIST", 34, 34, 2, ppeVar3);
        yle yleVar36 = new yle("DOUBLE_LIST_PACKED", 35, 35, 3, ppeVar);
        b = yleVar36;
        yle yleVar37 = new yle("FLOAT_LIST_PACKED", 36, 36, 3, ppeVar2);
        yle yleVar38 = new yle("INT64_LIST_PACKED", 37, 37, 3, ppeVar3);
        yle yleVar39 = new yle("UINT64_LIST_PACKED", 38, 38, 3, ppeVar3);
        yle yleVar40 = new yle("INT32_LIST_PACKED", 39, 39, 3, ppeVar4);
        yle yleVar41 = new yle("FIXED64_LIST_PACKED", 40, 40, 3, ppeVar3);
        yle yleVar42 = new yle("FIXED32_LIST_PACKED", 41, 41, 3, ppeVar4);
        yle yleVar43 = new yle("BOOL_LIST_PACKED", 42, 42, 3, ppeVar5);
        yle yleVar44 = new yle("UINT32_LIST_PACKED", 43, 43, 3, ppeVar4);
        yle yleVar45 = new yle("ENUM_LIST_PACKED", 44, 44, 3, ppeVar9);
        yle yleVar46 = new yle("SFIXED32_LIST_PACKED", 45, 45, 3, ppeVar4);
        yle yleVar47 = new yle("SFIXED64_LIST_PACKED", 46, 46, 3, ppeVar3);
        yle yleVar48 = new yle("SINT32_LIST_PACKED", 47, 47, 3, ppeVar4);
        yle yleVar49 = new yle("SINT64_LIST_PACKED", 48, 48, 3, ppeVar3);
        c = yleVar49;
        e = new yle[]{yleVar, yleVar2, yleVar3, yleVar4, yleVar5, yleVar6, yleVar7, yleVar8, yleVar9, yleVar10, yleVar11, yleVar12, yleVar13, yleVar14, yleVar15, yleVar16, yleVar17, yleVar18, yleVar19, yleVar20, yleVar21, yleVar22, yleVar23, yleVar24, yleVar25, yleVar26, yleVar27, yleVar28, yleVar29, yleVar30, yleVar31, yleVar32, yleVar33, yleVar34, yleVar35, yleVar36, yleVar37, yleVar38, yleVar39, yleVar40, yleVar41, yleVar42, yleVar43, yleVar44, yleVar45, yleVar46, yleVar47, yleVar48, yleVar49, new yle("GROUP_LIST", 49, 49, 2, ppeVar7), new yle("MAP", 50, 50, 4, ppe.b)};
        yle[] values = values();
        d = new yle[values.length];
        for (yle yleVar50 : values) {
            d[yleVar50.a] = yleVar50;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public yle(String str, int i, int i2, int i3, ppe ppeVar) {
        this.a = i2;
        int i4 = ime.a[ug8.F(i3)];
        if (i4 == 1) {
            Class cls = ppeVar.a;
        } else if (i4 == 2) {
            Class cls2 = ppeVar.a;
        }
        if (i3 == 1) {
            int i5 = ime.b[ppeVar.ordinal()];
        }
    }

    public static yle[] values() {
        return (yle[]) e.clone();
    }
}
