// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class zca extends cda {
    public final /* synthetic */ byte f;
    public final /* synthetic */ dda g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zca(dda ddaVar, byte b, boolean z) {
        super(0);
        this.f = b;
        this.g = ddaVar;
    }

    @Override // cda
    public final void a() {
        byte b = this.f;
        dda ddaVar = this.g;
        switch (b) {
            case 0:
                uca ucaVar = ddaVar.h;
                double atan2 = Math.atan2(ucaVar.c - ucaVar.j, ucaVar.b - ucaVar.i) + 3.141592653589793d;
                uca ucaVar2 = ddaVar.h;
                double d = ucaVar2.k / 5.5f;
                float cos = ucaVar2.b + ((float) (Math.cos(atan2) * d));
                float sin = ddaVar.h.c + ((float) (Math.sin(atan2) * d));
                this.d = cos;
                this.e = sin;
                break;
            case 1:
                uca ucaVar3 = ddaVar.h;
                float f = ucaVar3.b + ucaVar3.d;
                float f2 = ucaVar3.c;
                this.d = f;
                this.e = f2;
                break;
            case 2:
                uca ucaVar4 = ddaVar.h;
                float min = Math.min(ucaVar4.d, ucaVar4.e);
                uca ucaVar5 = ddaVar.h;
                float f3 = (0.95105654f * min) + ucaVar5.b;
                float f4 = ((-0.309017f) * min) + ucaVar5.c;
                this.d = f3;
                this.e = f4;
                break;
            case 3:
                uca ucaVar6 = ddaVar.h;
                float f5 = ucaVar6.b;
                float abs = ucaVar6.c - Math.abs(ucaVar6.e);
                this.d = f5;
                this.e = abs;
                break;
            case 4:
                uca ucaVar7 = ddaVar.h;
                float f6 = ucaVar7.i;
                float f7 = ucaVar7.j;
                ucaVar7.i = f6;
                ucaVar7.j = f7;
                this.d = f6;
                this.e = f7;
                break;
            default:
                uca ucaVar8 = ddaVar.h;
                this.d = ucaVar8.b;
                this.e = ucaVar8.c;
                break;
        }
    }

    @Override // cda
    public final void b(float f, float f2) {
        byte b = this.f;
        int i = 0;
        dda ddaVar = this.g;
        switch (b) {
            case 0:
                uca ucaVar = ddaVar.h;
                double atan2 = Math.atan2(ucaVar.c - ucaVar.j, ucaVar.b - ucaVar.i) + 1.5707963267948966d;
                uca ucaVar2 = ddaVar.h;
                float a = (dte.a(ucaVar2.b, ucaVar2.c, ucaVar2.i, ucaVar2.j) * 5.5f) / 2.0f;
                uca ucaVar3 = ddaVar.h;
                float f3 = ucaVar3.b;
                float f4 = ucaVar3.c;
                ddaVar.getClass();
                ucaVar3.k = Math.min(a, Math.max(100.0f, (-((float) ((Math.cos(atan2) * (f4 - f2)) - (Math.sin(atan2) * (f3 - f))))) * 5.5f));
                a();
                return;
            case 1:
                this.d = f;
                this.e = f2;
                uca ucaVar4 = ddaVar.h;
                float a2 = dte.a(ucaVar4.b, ucaVar4.c, f, f2);
                ucaVar4.e = a2;
                ucaVar4.d = a2;
                return;
            case 2:
                uca ucaVar5 = ddaVar.h;
                float a3 = dte.a(ucaVar5.b, ucaVar5.c, f, f2);
                ucaVar5.e = a3;
                ucaVar5.d = a3;
                ddaVar.h.h = (float) ((((float) Math.atan2(r0.c - f2, f - r0.b)) - 0.3141592653589793d) + r0.h);
                a();
                return;
            case 3:
                ddaVar.h.h = (float) ((((float) Math.atan2(r12.c - f2, f - r12.b)) - 1.5707963267948966d) + r12.h);
                while (i < ddaVar.m.size()) {
                    cda cdaVar = (cda) ddaVar.m.get(i);
                    if (cdaVar instanceof bda) {
                        cdaVar.a();
                    }
                    i++;
                }
                return;
            case 4:
                uca ucaVar6 = ddaVar.h;
                ucaVar6.i = f;
                ucaVar6.j = f2;
                this.d = f;
                this.e = f2;
                float f5 = ucaVar6.c;
                float f6 = ucaVar6.e;
                float f7 = f5 - f6;
                if (f2 > f7 && f2 < f5 + f6) {
                    float f8 = ucaVar6.b;
                    if (f <= f8) {
                        float f9 = f8 - ucaVar6.d;
                        if (f > f9) {
                            this.d = f9;
                            f = f9;
                        }
                    }
                    if (f > f5) {
                        float f10 = f8 + ucaVar6.d;
                        if (f < f10) {
                            this.d = f10;
                            f = f10;
                        }
                    }
                }
                float f11 = ucaVar6.b;
                float f12 = ucaVar6.d;
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
                ucaVar6.i = f;
                ucaVar6.j = f2;
                return;
        }
        while (i < ddaVar.m.size()) {
            cda cdaVar2 = (cda) ddaVar.m.get(i);
            if (cdaVar2 != this) {
                cdaVar2.a();
            }
            i++;
        }
        uca ucaVar7 = ddaVar.h;
        ucaVar7.b = f;
        ucaVar7.c = f2;
        this.d = f;
        this.e = f2;
    }

    public /* synthetic */ zca(dda ddaVar, byte b) {
        this.f = b;
        this.g = ddaVar;
    }
}
