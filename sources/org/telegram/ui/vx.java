package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class vx extends fu0 {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ py b;

    public vx(py pyVar, boolean[] zArr) {
        this.b = pyVar;
        this.a = zArr;
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final CharSequence C(int i10) {
        py pyVar = this.b;
        if (i10 < 0 || i10 >= pyVar.A2.size() || !((MediaController.PhotoEntry) pyVar.A2.get(i10)).isVideo) {
            return py.s2(pyVar);
        }
        return null;
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final void D() {
        int i10;
        py pyVar = this.b;
        org.telegram.ui.Components.qq0 qq0Var = pyVar.D2;
        if (qq0Var != null) {
            i10 = ((org.telegram.ui.ActionBar.p2) pyVar).currentAccount;
            qq0Var.i(i10, pyVar.A2);
        }
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        py pyVar = this.b;
        org.telegram.ui.Components.qq0 qq0Var = pyVar.D2;
        org.telegram.ui.Components.p9 f10 = qq0Var != null ? qq0Var.f(i10) : null;
        if (f10 == null) {
            return null;
        }
        int[] iArr = new int[2];
        f10.getLocationInWindow(iArr);
        qu0 qu0Var = new qu0();
        qu0Var.b = iArr[0];
        qu0Var.c = iArr[1];
        qu0Var.d = pyVar.D2;
        ImageReceiver imageReceiver = f10.getImageReceiver();
        qu0Var.a = imageReceiver;
        qu0Var.e = imageReceiver.getBitmapSafe();
        qu0Var.k = f10.getScaleX();
        qu0Var.h = new int[]{AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f)};
        return qu0Var;
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final long a() {
        py pyVar = this.b;
        if (pyVar.F2.isEmpty()) {
            return 0L;
        }
        return ((Long) pyVar.F2.get(0)).longValue();
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final boolean b() {
        py pyVar = this.b;
        if (pyVar.F2.isEmpty()) {
            return false;
        }
        ArrayList arrayList = pyVar.F2;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            long longValue = ((Long) obj).longValue();
            if (DialogObject.isEncryptedDialog(longValue) || pyVar.getMessagesController().getSendPaidMessagesStars(longValue) > 0) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final CharSequence b0(int i10) {
        py pyVar = this.b;
        ArrayList arrayList = pyVar.A2;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        int size = pyVar.A2.size();
        if (size == 1) {
            return LocaleController.getString(((MediaController.PhotoEntry) pyVar.A2.get(0)).isVideo ? R.string.AttachVideo : R.string.AttachPhoto);
        }
        ArrayList arrayList2 = pyVar.A2;
        int size2 = arrayList2.size();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i13 < size2) {
            Object obj = arrayList2.get(i13);
            i13++;
            if (((MediaController.PhotoEntry) obj).isVideo) {
                i11++;
            } else {
                i12++;
            }
        }
        return i11 == 0 ? LocaleController.formatPluralString("ShareSendPhotos", size, new Object[0]) : i12 == 0 ? LocaleController.formatPluralString("ShareSendVideos", size, new Object[0]) : LocaleController.formatPluralString("ShareSendItems", size, new Object[0]);
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final void e(CharSequence charSequence) {
        py pyVar = this.b;
        ax axVar = pyVar.y1;
        if (axVar != null) {
            axVar.setFieldText(charSequence);
        }
        ArrayList arrayList = pyVar.A2;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((MediaController.PhotoEntry) obj).caption = charSequence;
            }
        }
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final boolean h() {
        TLRPC.User user;
        py pyVar = this.b;
        if (pyVar.F2.isEmpty()) {
            return false;
        }
        MessagesController messagesController = pyVar.getMessagesController();
        ArrayList arrayList = pyVar.F2;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Long l10 = (Long) obj;
            if (!DialogObject.isUserDialog(l10.longValue()) || (user = messagesController.getUser(l10)) == null || user.bot || UserObject.isUserSelf(user)) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Components.qq0 qq0Var = this.b.D2;
        org.telegram.ui.Components.p9 f10 = qq0Var != null ? qq0Var.f(i10) : null;
        if (f10 != null) {
            return f10.getImageReceiver().getBitmapSafe();
        }
        return null;
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z4, int i11, int i12, boolean z10) {
        int i13;
        ArrayList arrayList;
        py pyVar = this.b;
        ArrayList arrayList2 = pyVar.F2;
        if (pyVar.y1 != null && (arrayList = pyVar.A2) != null && !arrayList.isEmpty()) {
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) pyVar.A2.get(0);
            ax axVar = pyVar.y1;
            CharSequence charSequence = photoEntry.caption;
            if (charSequence == null) {
                charSequence = "";
            }
            axVar.setFieldText(charSequence);
        }
        org.telegram.ui.Components.qq0 qq0Var = pyVar.D2;
        if (qq0Var != null) {
            i13 = ((org.telegram.ui.ActionBar.p2) pyVar).currentAccount;
            qq0Var.i(i13, pyVar.A2);
        }
        if ((z4 && i11 == 0) || pyVar.z2 == null || arrayList2.isEmpty()) {
            PhotoViewer.t1().G0(true, false);
            return;
        }
        pyVar.G2 = z4;
        pyVar.H2 = i11;
        ArrayList arrayList3 = new ArrayList();
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            arrayList3.add(MessagesStorage.TopicKey.of(((Long) arrayList2.get(i14)).longValue(), 0L));
        }
        PhotoViewer.t1().G0(true, false);
        pyVar.z2.v(pyVar, arrayList3, pyVar.y1.getFieldText(), false, z4, i11, i12, null);
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final void s() {
        ax axVar;
        org.telegram.ui.Components.bd f12;
        PhotoViewer t12 = PhotoViewer.t1();
        CharSequence charSequence = null;
        if (t12.Q1() && (f12 = t12.f1()) != null) {
            charSequence = f12.getText();
        }
        py pyVar = this.b;
        if (charSequence != null && (axVar = pyVar.y1) != null) {
            axVar.setFieldText(charSequence);
        }
        ArrayList arrayList = pyVar.A2;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((MediaController.PhotoEntry) obj).caption = charSequence;
            }
        }
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final boolean x(int i10) {
        return this.a[i10];
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        return i10;
    }
}
