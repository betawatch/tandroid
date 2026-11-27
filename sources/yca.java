// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class yca extends bda {
    public final /* synthetic */ byte f;
    public final /* synthetic */ cda g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yca(cda cdaVar, byte b, boolean z) {
        super(0);
        this.f = b;
        this.g = cdaVar;
    }

    @Override // bda
    public final void a() {
        byte b = this.f;
        cda cdaVar = this.g;
        switch (b) {
            case 0:
                tca tcaVar = cdaVar.h;
                double atan2 = Math.atan2(tcaVar.c - tcaVar.j, tcaVar.b - tcaVar.i) + 3.141592653589793d;
                tca tcaVar2 = cdaVar.h;
                double d = tcaVar2.k / 5.5f;
                float cos = tcaVar2.b + ((float) (Math.cos(atan2) * d));
                float sin = cdaVar.h.c + ((float) (Math.sin(atan2) * d));
                this.d = cos;
                this.e = sin;
                break;
            case 1:
                tca tcaVar3 = cdaVar.h;
                float f = tcaVar3.b + tcaVar3.d;
                float f2 = tcaVar3.c;
                this.d = f;
                this.e = f2;
                break;
            case 2:
                tca tcaVar4 = cdaVar.h;
                float min = Math.min(tcaVar4.d, tcaVar4.e);
                tca tcaVar5 = cdaVar.h;
                float f3 = (0.95105654f * min) + tcaVar5.b;
                float f4 = ((-0.309017f) * min) + tcaVar5.c;
                this.d = f3;
                this.e = f4;
                break;
            case 3:
                tca tcaVar6 = cdaVar.h;
                float f5 = tcaVar6.b;
                float abs = tcaVar6.c - Math.abs(tcaVar6.e);
                this.d = f5;
                this.e = abs;
                break;
            case 4:
                tca tcaVar7 = cdaVar.h;
                float f6 = tcaVar7.i;
                float f7 = tcaVar7.j;
                tcaVar7.i = f6;
                tcaVar7.j = f7;
                this.d = f6;
                this.e = f7;
                break;
            default:
                tca tcaVar8 = cdaVar.h;
                this.d = tcaVar8.b;
                this.e = tcaVar8.c;
                break;
        }
    }

    @Override // bda
    public final void b(float f, float f2) {
        byte b = this.f;
        int i = 0;
        cda cdaVar = this.g;
        switch (b) {
            case 0:
                tca tcaVar = cdaVar.h;
                double atan2 = Math.atan2(tcaVar.c - tcaVar.j, tcaVar.b - tcaVar.i) + 1.5707963267948966d;
                tca tcaVar2 = cdaVar.h;
                float a = (dte.a(tcaVar2.b, tcaVar2.c, tcaVar2.i, tcaVar2.j) * 5.5f) / 2.0f;
                tca tcaVar3 = cdaVar.h;
                float f3 = tcaVar3.b;
                float f4 = tcaVar3.c;
                cdaVar.getClass();
                tcaVar3.k = Math.min(a, Math.max(100.0f, (-((float) ((Math.cos(atan2) * (f4 - f2)) - (Math.sin(atan2) * (f3 - f))))) * 5.5f));
                a();
                return;
            case 1:
                this.d = f;
                this.e = f2;
                tca tcaVar4 = cdaVar.h;
                float a2 = dte.a(tcaVar4.b, tcaVar4.c, f, f2);
                tcaVar4.e = a2;
                tcaVar4.d = a2;
                return;
            case 2:
                tca tcaVar5 = cdaVar.h;
                float a3 = dte.a(tcaVar5.b, tcaVar5.c, f, f2);
                tcaVar5.e = a3;
                tcaVar5.d = a3;
                cdaVar.h.h = (float) ((((float) Math.atan2(r0.c - f2, f - r0.b)) - 0.3141592653589793d) + r0.h);
                a();
                return;
            case 3:
                cdaVar.h.h = (float) ((((float) Math.atan2(r12.c - f2, f - r12.b)) - 1.5707963267948966d) + r12.h);
                while (i < cdaVar.m.size()) {
                    bda bdaVar = (bda) cdaVar.m.get(i);
                    if (bdaVar instanceof ada) {
                        bdaVar.a();
                    }
                    i++;
                }
                return;
            case 4:
                tca tcaVar6 = cdaVar.h;
                tcaVar6.i = f;
                tcaVar6.j = f2;
                this.d = f;
                this.e = f2;
                float f5 = tcaVar6.c;
                float f6 = tcaVar6.e;
                float f7 = f5 - f6;
                if (f2 > f7 && f2 < f5 + f6) {
                    float f8 = tcaVar6.b;
                    if (f <= f8) {
                        float f9 = f8 - tcaVar6.d;
                        if (f > f9) {
                            this.d = f9;
                            f = f9;
                        }
                    }
                    if (f > f5) {
                        float f10 = f8 + tcaVar6.d;
                        if (f < f10) {
                            this.d = f10;
                            f = f10;
                        }
                    }
                }
                float f11 = tcaVar6.b;
                float f12 = tcaVar6.d;
                if (f > f11 - f12 && f < f11 + f12) {
                    if (f2 <= f5 && f2 > f7) {
                        this.e = f7;
                        f2 = f7;
                    } else if (f2 > f5) {
                        float f13 = f5 + f6;
                        if (f2 < f13) {
                            this.e = f13;
                            f2 = f13;
                        }
                    }
                }
                tcaVar6.i = f;
                tcaVar6.j = f2;
                return;
        }
        while (i < cdaVar.m.size()) {
            bda bdaVar2 = (bda) cdaVar.m.get(i);
            if (bdaVar2 != this) {
                bdaVar2.a();
            }
            i++;
        }
        tca tcaVar7 = cdaVar.h;
        tcaVar7.b = f;
        tcaVar7.c = f2;
        this.d = f;
        this.e = f2;
    }

    public /* synthetic */ yca(cda cdaVar, byte b) {
        this.f = b;
        this.g = cdaVar;
    }
}
