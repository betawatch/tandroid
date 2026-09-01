package ph;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import f2.m1;
import java.util.ArrayList;
import oh.d6;
import oh.l6;
import oh.s6;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.q7;
import org.telegram.ui.Cells.r7;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.tl0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public class k extends dl0 {
    public final Context c;
    public l6 e;
    public k f;
    public q7 h;
    public boolean r;
    public final /* synthetic */ l s;
    public final ArrayList d = new ArrayList();
    public final ArrayList n = new ArrayList();

    public k(l lVar, Context context) {
        this.s = lVar;
        this.c = context;
        M();
    }

    @Override // org.telegram.ui.Components.sl0
    public final boolean D(m1 m1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.dl0
    public final String F(int i10) {
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        l6 l6Var = this.e;
        if (l6Var == null || i10 < 0 || i10 >= l6Var.i.size() || (messageObject = (MessageObject) this.e.i.get(i10)) == null || (storyItem = messageObject.storyItem) == null) {
            return null;
        }
        return LocaleController.formatYearMont(storyItem.date, true);
    }

    @Override // org.telegram.ui.Components.dl0
    public final void G(tl0 tl0Var, float f10, int[] iArr) {
        int measuredHeight = tl0Var.getChildAt(0).getMeasuredHeight();
        k kVar = this.f;
        l lVar = this.s;
        int i10 = this == kVar ? lVar.e : lVar.d;
        int ceil = (int) (Math.ceil(h() / i10) * measuredHeight);
        int measuredHeight2 = tl0Var.getMeasuredHeight() - tl0Var.getPaddingTop();
        if (measuredHeight == 0) {
            iArr[1] = 0;
            iArr[0] = 0;
        } else {
            float f11 = f10 * (ceil - measuredHeight2);
            iArr[0] = ((int) (f11 / measuredHeight)) * i10;
            iArr[1] = ((int) f11) % measuredHeight;
        }
    }

    public final boolean L(int i10) {
        or0 or0Var = this.s.T;
        l6 l6Var = this.e;
        if (l6Var == null) {
            return false;
        }
        if (l6Var instanceof d6) {
            TLRPC.User user = MessagesController.getInstance(or0Var.b).getUser(Long.valueOf(or0Var.d));
            return user != null && user.bot && user.bot_has_main_app && user.bot_can_edit;
        }
        if (i10 < 0 || i10 >= l6Var.i.size()) {
            return false;
        }
        return this.e.m(((MessageObject) this.e.i.get(i10)).getId());
    }

    public final void M() {
        if (this.e == null) {
            return;
        }
        l lVar = this.s;
        if ((!lVar.F || (lVar.E && h() > 1)) && h() > 0) {
            if (h() < 5) {
                int max = Math.max(1, h());
                lVar.d = max;
                lVar.E = max == 1;
            } else if (lVar.E || lVar.d == 1) {
                lVar.E = false;
                lVar.d = Math.max(2, SharedConfig.storiesColumnsCount);
            }
            lVar.h.y1(lVar.d);
            lVar.F = true;
        }
    }

    @Override // f2.p0
    public final int h() {
        if (this.e == null) {
            return 0;
        }
        return this.e.g() + this.d.size();
    }

    @Override // f2.p0
    public final int j(int i10) {
        return 19;
    }

    @Override // f2.p0
    public final int k() {
        return h();
    }

    @Override // f2.p0
    public void l() {
        l6 l6Var = this.e;
        boolean z4 = l6Var instanceof d6;
        l lVar = this.s;
        if (z4) {
            d6 d6Var = (d6) l6Var;
            ArrayList arrayList = this.d;
            arrayList.clear();
            ArrayList E = MessagesController.getInstance(this.e.c).getStoriesController().E(lVar.T.d);
            if (E != null) {
                for (int i10 = 0; i10 < E.size(); i10++) {
                    s6 s6Var = (s6) E.get(i10);
                    qh.s6 s6Var2 = s6Var.c;
                    if (s6Var2 != null && !s6Var2.g && TextUtils.equals(s6Var2.K0, d6Var.E)) {
                        arrayList.add(s6Var);
                    }
                }
            }
        }
        super.l();
        k kVar = this.f;
        if (kVar != null) {
            kVar.l();
        }
        if (this != lVar.w) {
            M();
            lVar.c();
        }
    }

    @Override // f2.p0
    public final void v(m1 m1Var, int i10) {
        if (this.e == null) {
            return;
        }
        View view = m1Var.a;
        if (view instanceof r7) {
            r7 r7Var = (r7) view;
            r7Var.a0 = true;
            l lVar = this.s;
            ArrayList arrayList = this.d;
            if (i10 >= 0 && i10 < arrayList.size()) {
                s6 s6Var = (s6) arrayList.get(i10);
                r7Var.c0 = false;
                if (s6Var.H == null) {
                    TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                    long j10 = s6Var.a;
                    int i11 = (int) (j10 ^ (j10 >>> 32));
                    tL_storyItem.messageId = i11;
                    tL_storyItem.id = i11;
                    tL_storyItem.attachPath = s6Var.f;
                    j jVar = new j(this.e.c, tL_storyItem);
                    s6Var.H = jVar;
                    jVar.uploadingStory = s6Var;
                }
                r7Var.k(s6Var.H, this == this.f ? lVar.e : lVar.d, false);
                r7Var.a0 = true;
                r7Var.setReorder(false);
                r7Var.i(false, false);
                return;
            }
            int size = i10 - arrayList.size();
            if (size < 0 || size >= this.e.i.size()) {
                r7Var.c0 = false;
                r7Var.k(null, this == this.f ? lVar.e : lVar.d, false);
                r7Var.a0 = true;
                return;
            }
            MessageObject messageObject = (MessageObject) this.e.i.get(size);
            r7Var.c0 = messageObject != null && this.e.m(messageObject.getId());
            r7Var.setReorder(true);
            r7Var.k(messageObject, this == this.f ? lVar.e : lVar.d, false);
            or0 or0Var = lVar.T;
            if (!or0Var.D.z1 || messageObject == null) {
                r7Var.i(false, false);
            } else {
                r7Var.i(or0Var.c(messageObject), true);
            }
        }
    }

    @Override // f2.p0
    public final m1 x(ViewGroup viewGroup, int i10) {
        or0 or0Var = this.s.T;
        if (this.h == null) {
            this.h = new q7(viewGroup.getContext(), or0Var.c);
        }
        r7 r7Var = new r7(this.c, this.h, or0Var.b);
        r7Var.t0 = true;
        r7Var.setGradientView(null);
        r7Var.a0 = true;
        return new fl0(r7Var);
    }

    @Override // org.telegram.ui.Components.dl0
    public final void I() {
    }
}
