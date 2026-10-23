package org.telegram.ui;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class u71 extends org.telegram.ui.Components.j71 {
    public final /* synthetic */ c81 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u71(c81 c81Var, c81 c81Var2, f5 f5Var, s71 s71Var, s71 s71Var2) {
        super(c81Var2, f5Var, s71Var, s71Var2);
        this.g3 = c81Var;
    }

    @Override // org.telegram.ui.Components.mm0
    public final float getSectionsEdgeTop() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.o2) this.g3).actionBar;
        return kVar.getHeight();
    }
}
