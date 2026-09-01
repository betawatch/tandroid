package org.telegram.ui;

import android.R;
import android.net.Uri;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ws0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xs0 b;

    public /* synthetic */ ws0(xs0 xs0Var, int i10) {
        this.a = i10;
        this.b = xs0Var;
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
                cu0 cu0Var = photoViewer.B2;
                if (cu0Var != null) {
                    org.telegram.ui.Components.k71 k71Var = photoViewer.C2;
                    if (cu0Var.e != k71Var) {
                        cu0Var.c = false;
                        cu0Var.d = false;
                        if (cu0Var.b) {
                            cu0Var.a++;
                            cu0Var.b = false;
                        }
                        cu0Var.setImageResource(R.color.transparent);
                    }
                    if (k71Var != null) {
                        j3.f0 f0Var = k71Var.d;
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
                        long p10 = k71Var.p() - k71Var.n();
                        if (!cu0Var.c && !cu0Var.d && !cu0Var.b && p10 < 5250.0f) {
                            Uri uri = k71Var.C;
                            int i11 = cu0Var.a + 1;
                            cu0Var.a = i11;
                            Utilities.globalQueue.postRunnable(new bu0(cu0Var, uri, i11, 0));
                            cu0Var.b = true;
                        }
                    }
                    cu0Var.e = k71Var;
                    break;
                }
                break;
            case 1:
                cu0.a(this.b.b.B2);
                break;
            default:
                cu0.a(this.b.b.B2);
                break;
        }
    }
}
