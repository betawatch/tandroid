package org.telegram.ui;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class t10 implements org.telegram.ui.Components.pn0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bg.a b;

    public /* synthetic */ t10(bg.a aVar, int i10) {
        this.a = i10;
        this.b = aVar;
    }

    @Override // org.telegram.ui.Components.pn0
    public final void P(float f10, boolean z10) {
        switch (this.a) {
            case 0:
                bg.j jVar = this.b.c;
                if (jVar != null) {
                    jVar.v = f10 * 2.0f;
                    break;
                }
                break;
            case 1:
                bg.j jVar2 = this.b.c;
                if (jVar2 != null) {
                    jVar2.w = f10 * 2.0f;
                    break;
                }
                break;
            case 2:
                bg.j jVar3 = this.b.c;
                if (jVar3 != null) {
                    jVar3.x = f10;
                    break;
                }
                break;
            default:
                bg.j jVar4 = this.b.c;
                if (jVar4 != null) {
                    jVar4.A = f10 * 2.0f;
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.pn0
    public final /* synthetic */ int a0() {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.pn0
    public final /* synthetic */ CharSequence getContentDescription() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Components.pn0
    public final void r() {
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
