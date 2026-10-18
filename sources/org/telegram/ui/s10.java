package org.telegram.ui;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class s10 implements org.telegram.ui.Components.bp0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tg.g b;

    public /* synthetic */ s10(tg.g gVar, int i10) {
        this.a = i10;
        this.b = gVar;
    }

    @Override // org.telegram.ui.Components.bp0
    public final void L(float f7, boolean z10) {
        switch (this.a) {
            case 0:
                tg.o oVar = this.b.c;
                if (oVar != null) {
                    oVar.B = f7 * 2.0f;
                    break;
                }
                break;
            case 1:
                tg.o oVar2 = this.b.c;
                if (oVar2 != null) {
                    oVar2.C = f7 * 2.0f;
                    break;
                }
                break;
            case 2:
                tg.o oVar3 = this.b.c;
                if (oVar3 != null) {
                    oVar3.D = f7;
                    break;
                }
                break;
            default:
                tg.o oVar4 = this.b.c;
                if (oVar4 != null) {
                    oVar4.G = f7 * 2.0f;
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.bp0
    public final /* synthetic */ int Y() {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.bp0
    public final /* synthetic */ CharSequence getContentDescription() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Components.bp0
    public final void v() {
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
