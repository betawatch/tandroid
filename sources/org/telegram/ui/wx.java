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

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class wx extends lu0 {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ qy b;

    public wx(qy qyVar, boolean[] zArr) {
        this.b = qyVar;
        this.a = zArr;
    }

    @Override // org.telegram.ui.lu0, org.telegram.ui.tu0
    public final CharSequence C(int i10) {
        qy qyVar = this.b;
        if (i10 < 0 || i10 >= qyVar.D2.size() || !((MediaController.PhotoEntry) qyVar.D2.get(i10)).isVideo) {
            return qy.s2(qyVar);
        }
        return null;
    }

    @Override // org.telegram.ui.lu0, org.telegram.ui.tu0
    public final void D() {
        int i10;
        qy qyVar = this.b;
        org.telegram.ui.Components.zq0 zq0Var = qyVar.G2;
        if (zq0Var != null) {
            i10 = ((org.telegram.ui.ActionBar.m2) qyVar).currentAccount;
            zq0Var.i(i10, qyVar.D2);
        }
    }

    @Override // org.telegram.ui.lu0, org.telegram.ui.tu0
    public final vu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        qy qyVar = this.b;
        org.telegram.ui.Components.zq0 zq0Var = qyVar.G2;
        org.telegram.ui.Components.w9 f7 = zq0Var != null ? zq0Var.f(i10) : null;
        if (f7 == null) {
            return null;
        }
        int[] iArr = new int[2];
        f7.getLocationInWindow(iArr);
        vu0 vu0Var = new vu0();
        vu0Var.b = iArr[0];
        vu0Var.c = iArr[1];
        vu0Var.d = qyVar.G2;
        ImageReceiver imageReceiver = f7.getImageReceiver();
        vu0Var.a = imageReceiver;
        vu0Var.e = imageReceiver.getBitmapSafe();
        vu0Var.k = f7.getScaleX();
        vu0Var.h = new int[]{AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f)};
        return vu0Var;
    }

    @Override // org.telegram.ui.lu0, org.telegram.ui.tu0
    public final long a() {
        qy qyVar = this.b;
        if (qyVar.I2.isEmpty()) {
            return 0L;
        }
        return ((Long) qyVar.I2.get(0)).longValue();
    }

    @Override // org.telegram.ui.lu0, org.telegram.ui.tu0
    public final boolean b() {
        qy qyVar = this.b;
        if (qyVar.I2.isEmpty()) {
            return false;
        }
        ArrayList arrayList = qyVar.I2;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            long longValue = ((Long) obj).longValue();
            if (DialogObject.isEncryptedDialog(longValue) || qyVar.getMessagesController().getSendPaidMessagesStars(longValue) > 0) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.lu0, org.telegram.ui.tu0
    public final CharSequence b0(int i10) {
        qy qyVar = this.b;
        ArrayList arrayList = qyVar.D2;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        int size = qyVar.D2.size();
        if (size == 1) {
            return LocaleController.getString(((MediaController.PhotoEntry) qyVar.D2.get(0)).isVideo ? R.string.AttachVideo : R.string.AttachPhoto);
        }
        ArrayList arrayList2 = qyVar.D2;
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

    @Override // org.telegram.ui.lu0, org.telegram.ui.tu0
    public final void e(CharSequence charSequence) {
        qy qyVar = this.b;
        ax axVar = qyVar.B1;
        if (axVar != null) {
            axVar.setFieldText(charSequence);
        }
        ArrayList arrayList = qyVar.D2;
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

    @Override // org.telegram.ui.lu0, org.telegram.ui.tu0
    public final boolean h() {
        TLRPC.User user;
        qy qyVar = this.b;
        if (qyVar.I2.isEmpty()) {
            return false;
        }
        MessagesController messagesController = qyVar.getMessagesController();
        ArrayList arrayList = qyVar.I2;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Long l4 = (Long) obj;
            if (!DialogObject.isUserDialog(l4.longValue()) || (user = messagesController.getUser(l4)) == null || user.bot || UserObject.isUserSelf(user)) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.lu0, org.telegram.ui.tu0
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Components.zq0 zq0Var = this.b.G2;
        org.telegram.ui.Components.w9 f7 = zq0Var != null ? zq0Var.f(i10) : null;
        if (f7 != null) {
            return f7.getImageReceiver().getBitmapSafe();
        }
        return null;
    }

    @Override // org.telegram.ui.lu0, org.telegram.ui.tu0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        int i13;
        ArrayList arrayList;
        qy qyVar = this.b;
        ArrayList arrayList2 = qyVar.I2;
        if (qyVar.B1 != null && (arrayList = qyVar.D2) != null && !arrayList.isEmpty()) {
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) qyVar.D2.get(0);
            ax axVar = qyVar.B1;
            CharSequence charSequence = photoEntry.caption;
            if (charSequence == null) {
                charSequence = "";
            }
            axVar.setFieldText(charSequence);
        }
        org.telegram.ui.Components.zq0 zq0Var = qyVar.G2;
        if (zq0Var != null) {
            i13 = ((org.telegram.ui.ActionBar.m2) qyVar).currentAccount;
            zq0Var.i(i13, qyVar.D2);
        }
        if ((z10 && i11 == 0) || qyVar.C2 == null || arrayList2.isEmpty()) {
            PhotoViewer.t1().G0(true, false);
            return;
        }
        qyVar.J2 = z10;
        qyVar.K2 = i11;
        ArrayList arrayList3 = new ArrayList();
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            arrayList3.add(MessagesStorage.TopicKey.of(((Long) arrayList2.get(i14)).longValue(), 0L));
        }
        PhotoViewer.t1().G0(true, false);
        qyVar.C2.u(qyVar, arrayList3, qyVar.B1.getFieldText(), false, z10, i11, i12, null);
    }

    @Override // org.telegram.ui.lu0, org.telegram.ui.tu0
    public final void s() {
        ax axVar;
        org.telegram.ui.Components.md f12;
        PhotoViewer t12 = PhotoViewer.t1();
        CharSequence charSequence = null;
        if (t12.Q1() && (f12 = t12.f1()) != null) {
            charSequence = f12.getText();
        }
        qy qyVar = this.b;
        if (charSequence != null && (axVar = qyVar.B1) != null) {
            axVar.setFieldText(charSequence);
        }
        ArrayList arrayList = qyVar.D2;
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

    @Override // org.telegram.ui.lu0, org.telegram.ui.tu0
    public final boolean x(int i10) {
        return this.a[i10];
    }

    @Override // org.telegram.ui.lu0, org.telegram.ui.tu0
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        return i10;
    }
}
