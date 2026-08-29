package org.telegram.ui;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class s10 implements org.telegram.ui.Components.zn0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dg.a b;

    public /* synthetic */ s10(dg.a aVar, int i10) {
        this.a = i10;
        this.b = aVar;
    }

    @Override // org.telegram.ui.Components.zn0
    public final void W(float f9, boolean z10) {
        switch (this.a) {
            case 0:
                dg.j jVar = this.b.c;
                if (jVar != null) {
                    jVar.v = f9 * 2.0f;
                    break;
                }
                break;
            case 1:
                dg.j jVar2 = this.b.c;
                if (jVar2 != null) {
                    jVar2.w = f9 * 2.0f;
                    break;
                }
                break;
            case 2:
                dg.j jVar3 = this.b.c;
                if (jVar3 != null) {
                    jVar3.x = f9;
                    break;
                }
                break;
            default:
                dg.j jVar4 = this.b.c;
                if (jVar4 != null) {
                    jVar4.A = f9 * 2.0f;
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.zn0
    public final /* synthetic */ CharSequence getContentDescription() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Components.zn0
    public final /* synthetic */ int k0() {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.zn0
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
