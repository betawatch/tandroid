package org.telegram.ui;

import android.R;
import android.net.Uri;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class us0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vs0 b;

    public /* synthetic */ us0(vs0 vs0Var, int i10) {
        this.a = i10;
        this.b = vs0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0057, code lost:
    
        if (r2 != 7) goto L32;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        i5.b bVar;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.b.b;
                au0 au0Var = photoViewer.B2;
                if (au0Var != null) {
                    org.telegram.ui.Components.i71 i71Var = photoViewer.C2;
                    if (au0Var.e != i71Var) {
                        au0Var.c = false;
                        au0Var.d = false;
                        if (au0Var.b) {
                            au0Var.a++;
                            au0Var.b = false;
                        }
                        au0Var.setImageResource(R.color.transparent);
                    }
                    if (i71Var != null) {
                        j3.f0 f0Var = i71Var.d;
                        if (f0Var != null) {
                            try {
                                f0Var.j0();
                                j3.n0 n0Var = f0Var.N;
                                if (n0Var != null && (bVar = n0Var.O) != null) {
                                    int i10 = bVar.c;
                                    if (i10 != 6) {
                                        break;
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                        long p10 = i71Var.p() - i71Var.n();
                        if (!au0Var.c && !au0Var.d && !au0Var.b && p10 < 5250.0f) {
                            Uri uri = i71Var.C;
                            int i11 = au0Var.a + 1;
                            au0Var.a = i11;
                            Utilities.globalQueue.postRunnable(new zt0(au0Var, uri, i11, 0));
                            au0Var.b = true;
                        }
                    }
                    au0Var.e = i71Var;
                    break;
                }
                break;
            case 1:
                au0.a(this.b.b.B2);
                break;
            default:
                au0.a(this.b.b.B2);
                break;
        }
    }
}
