package xg;

import android.view.KeyEvent;
import android.view.View;
import hg.k0;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.Components.m30;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class g implements View.OnKeyListener {
    public boolean a;
    public final /* synthetic */ HashSet b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ i d;

    public g(i iVar, HashSet hashSet, Runnable runnable) {
        this.d = iVar;
        this.b = hashSet;
        this.c = runnable;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        i iVar = this.d;
        ArrayList arrayList = iVar.e;
        if (i10 == 67) {
            if (keyEvent.getAction() == 0) {
                this.a = iVar.b.length() == 0;
                return false;
            }
            if (keyEvent.getAction() == 1 && this.a && !arrayList.isEmpty()) {
                iVar.a((m30) k0.h(1, arrayList), this.b, this.c);
                return true;
            }
        }
        return false;
    }
}
