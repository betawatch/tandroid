package pa;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class s0 extends ma.u {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0044, code lost:
    
        if (r1.equals("month") == false) goto L11;
     */
    @Override // ma.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object read(ua.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        aVar.b();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            char c10 = 4;
            if (aVar.x() == 4) {
                aVar.f();
                return new GregorianCalendar(i10, i11, i12, i13, i14, i15);
            }
            String r10 = aVar.r();
            int p6 = aVar.p();
            r10.getClass();
            switch (r10.hashCode()) {
                case -1181204563:
                    if (r10.equals("dayOfMonth")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1074026988:
                    if (r10.equals("minute")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -906279820:
                    if (r10.equals("second")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3704893:
                    if (r10.equals("year")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 104080000:
                    break;
                case 985252545:
                    if (r10.equals("hourOfDay")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            switch (c10) {
                case 0:
                    i12 = p6;
                    break;
                case 1:
                    i14 = p6;
                    break;
                case 2:
                    i15 = p6;
                    break;
                case 3:
                    i10 = p6;
                    break;
                case 4:
                    i11 = p6;
                    break;
                case 5:
                    i13 = p6;
                    break;
            }
        }
    }

    @Override // ma.u
    public final void write(ua.b bVar, Object obj) {
        if (((Calendar) obj) == null) {
            bVar.i();
            return;
        }
        bVar.c();
        bVar.g("year");
        bVar.o(r4.get(1));
        bVar.g("month");
        bVar.o(r4.get(2));
        bVar.g("dayOfMonth");
        bVar.o(r4.get(5));
        bVar.g("hourOfDay");
        bVar.o(r4.get(11));
        bVar.g("minute");
        bVar.o(r4.get(12));
        bVar.g("second");
        bVar.o(r4.get(13));
        bVar.f();
    }
}
