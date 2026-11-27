// default package

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class y2a implements View.OnKeyListener {
    public boolean a;
    public final /* synthetic */ HashSet b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ b3a d;

    public y2a(b3a b3aVar, HashSet hashSet, Runnable runnable) {
        this.d = b3aVar;
        this.b = hashSet;
        this.c = runnable;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        b3a b3aVar = this.d;
        ArrayList arrayList = b3aVar.e;
        if (i == 67) {
            if (keyEvent.getAction() == 0) {
                this.a = b3aVar.b.length() == 0;
                return false;
            }
            if (keyEvent.getAction() == 1 && this.a && !arrayList.isEmpty()) {
                b3aVar.a((zc5) c00.g(1, arrayList), this.b, this.c);
                return true;
            }
        }
        return false;
    }
}
