package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class rh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sh0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ rh0(sh0 sh0Var, String str, int i7) {
        this.a = i7;
        this.b = sh0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sh0 sh0Var = this.b;
                String str = this.c;
                sh0Var.getClass();
                org.telegram.messenger.g0.g3(new rh0(sh0Var, str, 1));
                break;
            default:
                sh0 sh0Var2 = this.b;
                String str2 = this.c;
                jg.z1 z1Var = sh0Var2.h;
                int i7 = sh0Var2.n.s;
                z1Var.g(str2, true, (i7 == 1 || i7 == 3) ? false : true, true, false, 0L, false, 0, 0);
                Utilities.g.c(new mc0(sh0Var2, str2, new ArrayList(sh0Var2.n.x), 10));
                break;
        }
    }
}
