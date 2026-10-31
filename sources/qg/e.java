package qg;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.Components.s20;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class e implements View.OnKeyListener {
    public boolean a;
    public final /* synthetic */ HashSet b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ h d;

    public e(h hVar, HashSet hashSet, Runnable runnable) {
        this.d = hVar;
        this.b = hashSet;
        this.c = runnable;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        h hVar = this.d;
        ArrayList arrayList = hVar.e;
        if (i10 == 67) {
            if (keyEvent.getAction() == 0) {
                this.a = hVar.b.length() == 0;
                return false;
            }
            if (keyEvent.getAction() == 1 && this.a && !arrayList.isEmpty()) {
                hVar.a((s20) i0.a.g(1, arrayList), this.b, this.c);
                return true;
            }
        }
        return false;
    }
}
