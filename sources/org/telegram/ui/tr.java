package org.telegram.ui;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class tr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ur b;

    public /* synthetic */ tr(ur urVar, int i10) {
        this.a = i10;
        this.b = urVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.m61 m61Var = this.b.a;
                if (m61Var != null) {
                    m61Var.Y2.N(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.m61 m61Var2 = this.b.a;
                if (m61Var2 != null) {
                    m61Var2.Y2.N(true);
                    break;
                }
                break;
        }
    }
}
