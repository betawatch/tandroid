package org.telegram.ui;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d80 b;

    public /* synthetic */ w70(d80 d80Var, int i10) {
        this.a = i10;
        this.b = d80Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d80 d80Var = this.b;
                d80Var.h.postOnAnimation(new w70(d80Var, 1));
                break;
            default:
                this.b.Y();
                break;
        }
    }
}
