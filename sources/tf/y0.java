package tf;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.t00;
import org.telegram.ui.xn;
import org.telegram.ui.yh;
import ph.ga;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class y0 extends rl0 implements NotificationCenter.NotificationCenterDelegate {
    public final Context c;
    public final xn f;
    public int h;
    public int n;
    public final f6 s;
    public final int v;
    public final boolean w;
    public String x;
    public nh.f6 y;
    public final HashSet d = new HashSet();
    public final ArrayList e = new ArrayList();
    public final int r = UserConfig.selectedAccount;
    public final ga B = new ga(this, 15);

    public y0(Context context, xn xnVar, f6 f6Var, int i10, boolean z4) {
        this.s = f6Var;
        this.c = context;
        this.f = xnVar;
        this.v = i10;
        this.w = z4;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f;
        return i10 == 0 || i10 == 2;
    }

    public final Object E(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = this.e;
        if (i10 >= arrayList.size()) {
            return null;
        }
        return arrayList.get(i10);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storiesListUpdated && objArr[0] == this.y) {
            l();
        }
    }

    @Override // f2.o0
    public final int h() {
        return this.e.size() + this.n;
    }

    @Override // f2.o0
    public final int j(int i10) {
        return i10 < this.e.size() ? 0 : 1;
    }

    @Override // f2.o0
    public final void l() {
        int h = h();
        ArrayList arrayList = this.e;
        arrayList.clear();
        HashSet hashSet = this.d;
        hashSet.clear();
        int i10 = this.r;
        int i11 = this.v;
        ArrayList<MessageObject> foundMessageObjects = i11 == 0 ? MediaDataController.getInstance(i10).getFoundMessageObjects() : HashtagSearchController.getInstance(i10).getMessages(i11);
        int i12 = 0;
        for (int i13 = 0; i13 < foundMessageObjects.size(); i13++) {
            MessageObject messageObject = foundMessageObjects.get(i13);
            if ((!messageObject.hasValidGroupId() || messageObject.isPrimaryGroupMessage) && !hashSet.contains(Integer.valueOf(messageObject.getId()))) {
                arrayList.add(messageObject);
                hashSet.add(Integer.valueOf(messageObject.getId()));
            }
        }
        int i14 = this.n;
        this.h = arrayList.size();
        if (i11 != 0) {
            if (!HashtagSearchController.getInstance(i10).isEndReached(i11) && this.h != 0) {
                i12 = Utilities.clamp(HashtagSearchController.getInstance(i10).getCount(i11) - this.h, 3, 0);
            }
            this.n = i12;
        } else {
            if (!MediaDataController.getInstance(i10).searchEndReached() && this.h != 0) {
                i12 = Utilities.clamp(MediaDataController.getInstance(i10).getSearchCount() - this.h, 3, 0);
            }
            this.n = i12;
        }
        int h9 = h();
        if (h >= h9) {
            super.l();
            return;
        }
        if (i14 > 0) {
            q(h - i14, i14);
        }
        s(h, h9 - h);
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        int i11;
        boolean z4;
        int i12;
        int i13 = l1Var.f;
        View view = l1Var.a;
        if (i13 != 0) {
            if (i13 == 2) {
                ((x0) view).a(this.y);
                return;
            }
            return;
        }
        r2 r2Var = (r2) view;
        r2Var.p2 = true;
        MessageObject messageObject = (MessageObject) E(i10);
        long dialogId = messageObject.getDialogId();
        int i14 = messageObject.messageOwner.date;
        if (this.w) {
            r2Var.o0 = true;
            long savedDialogId = messageObject.getSavedDialogId();
            TLRPC.Message message = messageObject.messageOwner;
            TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
            if (messageFwdHeader == null || ((i11 = messageFwdHeader.date) == 0 && messageFwdHeader.saved_date == 0)) {
                i12 = message.date;
            } else if (i11 == 0) {
                i12 = messageFwdHeader.saved_date;
            } else {
                dialogId = savedDialogId;
                z4 = false;
            }
            dialogId = savedDialogId;
            i11 = i12;
            z4 = false;
        } else {
            if (messageObject.isOutOwner() || ChatObject.isMonoForum(this.r, dialogId)) {
                dialogId = messageObject.getFromChatId();
            }
            i11 = i14;
            z4 = true;
        }
        r2Var.W(dialogId, messageObject, i11, z4, false);
        r2Var.setDialogCellDelegate(new v0(this));
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View r2Var;
        View view;
        if (i10 != 0) {
            f6 f6Var = this.s;
            Context context = this.c;
            if (i10 == 1) {
                t00 t00Var = new t00(context, f6Var);
                t00Var.setIsSingleCell(true);
                t00Var.setViewType(7);
                view = t00Var;
            } else if (i10 != 2) {
                r2Var = null;
            } else {
                view = new x0(context, f6Var);
            }
            r2Var = view;
        } else {
            r2Var = new r2(null, this.c, true, this.r, this.s);
        }
        return yh.o(r2Var, r2Var, -1, -2);
    }
}
