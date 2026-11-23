package s4;

import org.telegram.ui.md0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ androidx.emoji2.text.q b;
    public final /* synthetic */ int c;

    public /* synthetic */ c(androidx.emoji2.text.q qVar, int i7, int i10) {
        this.a = i10;
        this.b = qVar;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v vVar = ((e) ((md0) this.b.f).d).d;
                if (vVar != null) {
                    vVar.j(this.c);
                    break;
                }
                break;
            default:
                v vVar2 = ((e) ((md0) this.b.f).d).d;
                if (vVar2 != null) {
                    vVar2.k(this.c);
                    break;
                }
                break;
        }
    }
}
