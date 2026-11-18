package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class to implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ uo b;
    public final /* synthetic */ String c;

    public /* synthetic */ to(uo uoVar, String str, int i7) {
        this.a = i7;
        this.b = uoVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                uo uoVar = this.b;
                String str = this.c;
                uoVar.getClass();
                org.telegram.messenger.g0.g3(new to(uoVar, str, 1));
                break;
            default:
                uo uoVar2 = this.b;
                String str2 = this.c;
                uoVar2.f = null;
                Utilities.g.c(new o1(uoVar2, str2, new ArrayList(uoVar2.h.w), 28));
                break;
        }
    }
}
