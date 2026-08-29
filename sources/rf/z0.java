package rf;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import f2.n1;
import java.util.ArrayList;
import java.util.HashSet;
import lh.e6;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.p00;
import org.telegram.ui.th;
import org.telegram.ui.tn;
import org.telegram.ui.web.t1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class z0 extends il0 implements NotificationCenter.NotificationCenterDelegate {
    public final Context c;
    public final tn f;
    public int h;
    public int n;
    public final c6 s;
    public final int v;
    public final boolean w;
    public String x;
    public e6 y;
    public final HashSet d = new HashSet();
    public final ArrayList e = new ArrayList();
    public final int r = UserConfig.selectedAccount;
    public final t1 A = new t1(this, 13);

    public z0(Context context, tn tnVar, c6 c6Var, int i10, boolean z10) {
        this.s = c6Var;
        this.c = context;
        this.f = tnVar;
        this.v = i10;
        this.w = z10;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(n1 n1Var) {
        int i10 = n1Var.f;
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

    @Override // f2.p0
    public final int h() {
        return this.e.size() + this.n;
    }

    @Override // f2.p0
    public final int j(int i10) {
        return i10 < this.e.size() ? 0 : 1;
    }

    @Override // f2.p0
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
        int h10 = h();
        if (h >= h10) {
            super.l();
            return;
        }
        if (i14 > 0) {
            q(h - i14, i14);
        }
        s(h, h10 - h);
    }

    @Override // f2.p0
    public final void v(n1 n1Var, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13 = n1Var.f;
        View view = n1Var.a;
        if (i13 != 0) {
            if (i13 == 2) {
                ((y0) view).a(this.y);
                return;
            }
            return;
        }
        p2 p2Var = (p2) view;
        p2Var.o2 = true;
        MessageObject messageObject = (MessageObject) E(i10);
        long dialogId = messageObject.getDialogId();
        int i14 = messageObject.messageOwner.date;
        if (this.w) {
            p2Var.n0 = true;
            long savedDialogId = messageObject.getSavedDialogId();
            TLRPC.Message message = messageObject.messageOwner;
            TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
            if (messageFwdHeader == null || ((i11 = messageFwdHeader.date) == 0 && messageFwdHeader.saved_date == 0)) {
                i12 = message.date;
            } else if (i11 == 0) {
                i12 = messageFwdHeader.saved_date;
            } else {
                dialogId = savedDialogId;
                z10 = false;
            }
            dialogId = savedDialogId;
            i11 = i12;
            z10 = false;
        } else {
            if (messageObject.isOutOwner() || ChatObject.isMonoForum(this.r, dialogId)) {
                dialogId = messageObject.getFromChatId();
            }
            i11 = i14;
            z10 = true;
        }
        p2Var.W(dialogId, messageObject, i11, z10, false);
        p2Var.setDialogCellDelegate(new w0(this));
    }

    @Override // f2.p0
    public final n1 x(ViewGroup viewGroup, int i10) {
        View p2Var;
        View view;
        if (i10 != 0) {
            c6 c6Var = this.s;
            Context context = this.c;
            if (i10 == 1) {
                p00 p00Var = new p00(context, c6Var);
                p00Var.setIsSingleCell(true);
                p00Var.setViewType(7);
                view = p00Var;
            } else if (i10 != 2) {
                p2Var = null;
            } else {
                view = new y0(context, c6Var);
            }
            p2Var = view;
        } else {
            p2Var = new p2(null, this.c, true, this.r, this.s);
        }
        return th.m(p2Var, p2Var, -1, -2);
    }
}
