// default package

import java.io.File;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class zc4 extends az5 implements ur4 {
    public static final zc4 c;
    public static final zc4 d;
    public static final zc4 e;
    public final /* synthetic */ byte b;

    static {
        int i = 1;
        c = new zc4(i, (byte) 0);
        d = new zc4(i, (byte) 1);
        e = new zc4(i, (byte) 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zc4(int i, byte b) {
        super(i);
        this.b = b;
    }

    @Override // ur4
    public final Object invoke(Object obj) {
        String valueOf;
        int i;
        switch (this.b) {
            case 0:
                File file = (File) obj;
                file.getClass();
                String absolutePath = file.getCanonicalFile().getAbsolutePath();
                absolutePath.getClass();
                return new kma(absolutePath);
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                Object value = entry.getValue();
                if (value instanceof byte[]) {
                    StringBuilder sb = new StringBuilder();
                    sb.append((CharSequence) "[");
                    int i2 = 0;
                    for (byte b : (byte[]) value) {
                        i2++;
                        if (i2 > 1) {
                            sb.append((CharSequence) ", ");
                        }
                        sb.append((CharSequence) String.valueOf((int) b));
                    }
                    sb.append((CharSequence) "]");
                    valueOf = sb.toString();
                } else {
                    valueOf = String.valueOf(entry.getValue());
                }
                return qu6.o(((zj8) entry.getKey()).a, " = ", valueOf, new StringBuilder("  "));
            default:
                ArrayList arrayList = ((w4d) obj).a;
                ArrayList arrayList2 = new ArrayList(ul2.c(arrayList, 10));
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj2 = arrayList.get(i3);
                    i3++;
                    s4d s4dVar = (s4d) obj2;
                    int i4 = s4dVar.c;
                    if (i4 == 0) {
                        i = 0;
                    } else if (i4 != 1) {
                        i = 2;
                        if (i4 != 2) {
                            i = 3;
                            if (i4 != 3) {
                                i = 4;
                                if (i4 != 4) {
                                    p3d.e(s4dVar.c, "Unknown capability status: ");
                                    return null;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        i = 1;
                    }
                    arrayList2.add(new vdc(s4dVar.a, i, s4dVar.b));
                }
                return arrayList2;
        }
    }
}
