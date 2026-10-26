package org.telegram.ui;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class u10 implements org.telegram.ui.Components.kp0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ug.g b;

    public /* synthetic */ u10(ug.g gVar, int i10) {
        this.a = i10;
        this.b = gVar;
    }

    @Override // org.telegram.ui.Components.kp0
    public final void U(float f7, boolean z10) {
        switch (this.a) {
            case 0:
                ug.o oVar = this.b.c;
                if (oVar != null) {
                    oVar.B = f7 * 2.0f;
                    break;
                }
                break;
            case 1:
                ug.o oVar2 = this.b.c;
                if (oVar2 != null) {
                    oVar2.C = f7 * 2.0f;
                    break;
                }
                break;
            case 2:
                ug.o oVar3 = this.b.c;
                if (oVar3 != null) {
                    oVar3.D = f7;
                    break;
                }
                break;
            default:
                ug.o oVar4 = this.b.c;
                if (oVar4 != null) {
                    oVar4.G = f7 * 2.0f;
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.kp0
    public final /* synthetic */ CharSequence getContentDescription() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Components.kp0
    public final /* synthetic */ int k0() {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.kp0
    public final void y() {
        int i10 = this.a;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void d() {
    }
}
