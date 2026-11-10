package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SessionsActivity b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ s21(SessionsActivity sessionsActivity, boolean z9, int i7) {
        this.a = i7;
        this.b = sessionsActivity;
        this.c = z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.p0(this.c);
                break;
            default:
                this.b.p0(this.c);
                break;
        }
    }
}
