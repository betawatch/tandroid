// default package

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class rs8 implements kf3 {
    public final /* synthetic */ e a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ mr8 c;

    public rs8(mr8 mr8Var, e eVar, Context context) {
        this.c = mr8Var;
        this.a = eVar;
        this.b = context;
    }

    @Override // kf3
    public final void k(of3 of3Var) {
        e eVar = this.a;
        if (eVar.getMessagesController().O1().J(of3Var.getDialogId())) {
            eVar.getOrCreateStoryViewer().getClass();
            eVar.getOrCreateStoryViewer().H(eVar.getContext(), of3Var.getDialogId(), new l6b(this.c));
        }
    }

    @Override // kf3
    public final boolean m() {
        return true;
    }

    @Override // kf3
    public final void r() {
        e eVar = this.a;
        c6b O1 = eVar.getMessagesController().O1();
        ArrayList arrayList = O1.h;
        if (arrayList.isEmpty()) {
            return;
        }
        boolean z = O1.D(0, wf3.n(((TL_stories.PeerStories) arrayList.get(0)).peer)) != 0;
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            long n = wf3.n(((TL_stories.PeerStories) arrayList.get(i)).peer);
            if (!z || O1.D(0, n) != 0) {
                arrayList2.add(Long.valueOf(n));
            }
        }
        eVar.getOrCreateStoryViewer().K(this.b, null, arrayList2, 0, null, null, new l6b(this.c), false);
    }

    @Override // kf3
    public final void o(of3 of3Var) {
    }

    @Override // kf3
    public final void v(of3 of3Var) {
    }

    @Override // kf3
    public final void w(of3 of3Var) {
    }
}
