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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class zx extends uu0 {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ ty b;

    public zx(ty tyVar, boolean[] zArr) {
        this.b = tyVar;
        this.a = zArr;
    }

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final CharSequence C(int i10) {
        ty tyVar = this.b;
        if (i10 < 0 || i10 >= tyVar.D2.size() || !((MediaController.PhotoEntry) tyVar.D2.get(i10)).isVideo) {
            return ty.p2(tyVar);
        }
        return null;
    }

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final void D() {
        int i10;
        ty tyVar = this.b;
        org.telegram.ui.Components.rr0 rr0Var = tyVar.G2;
        if (rr0Var != null) {
            i10 = ((org.telegram.ui.ActionBar.n2) tyVar).currentAccount;
            rr0Var.i(i10, tyVar.D2);
        }
    }

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final ev0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ty tyVar = this.b;
        org.telegram.ui.Components.rr0 rr0Var = tyVar.G2;
        org.telegram.ui.Components.y9 f7 = rr0Var != null ? rr0Var.f(i10) : null;
        if (f7 == null) {
            return null;
        }
        int[] iArr = new int[2];
        f7.getLocationInWindow(iArr);
        ev0 ev0Var = new ev0();
        ev0Var.b = iArr[0];
        ev0Var.c = iArr[1];
        ev0Var.d = tyVar.G2;
        ImageReceiver imageReceiver = f7.getImageReceiver();
        ev0Var.a = imageReceiver;
        ev0Var.e = imageReceiver.getBitmapSafe();
        ev0Var.k = f7.getScaleX();
        ev0Var.h = new int[]{AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f)};
        return ev0Var;
    }

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final long a() {
        ty tyVar = this.b;
        if (tyVar.I2.isEmpty()) {
            return 0L;
        }
        return ((Long) tyVar.I2.get(0)).longValue();
    }

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final boolean b() {
        ty tyVar = this.b;
        if (tyVar.I2.isEmpty()) {
            return false;
        }
        ArrayList arrayList = tyVar.I2;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            long longValue = ((Long) obj).longValue();
            if (DialogObject.isEncryptedDialog(longValue) || tyVar.getMessagesController().getSendPaidMessagesStars(longValue) > 0) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final CharSequence b0(int i10) {
        ty tyVar = this.b;
        ArrayList arrayList = tyVar.D2;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        int size = tyVar.D2.size();
        if (size == 1) {
            return LocaleController.getString(((MediaController.PhotoEntry) tyVar.D2.get(0)).isVideo ? R.string.AttachVideo : R.string.AttachPhoto);
        }
        ArrayList arrayList2 = tyVar.D2;
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

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final void e(CharSequence charSequence) {
        ty tyVar = this.b;
        dx dxVar = tyVar.B1;
        if (dxVar != null) {
            dxVar.setFieldText(charSequence);
        }
        ArrayList arrayList = tyVar.D2;
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

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final boolean h() {
        TLRPC.User user;
        ty tyVar = this.b;
        if (tyVar.I2.isEmpty()) {
            return false;
        }
        MessagesController messagesController = tyVar.getMessagesController();
        ArrayList arrayList = tyVar.I2;
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

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Components.rr0 rr0Var = this.b.G2;
        org.telegram.ui.Components.y9 f7 = rr0Var != null ? rr0Var.f(i10) : null;
        if (f7 != null) {
            return f7.getImageReceiver().getBitmapSafe();
        }
        return null;
    }

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        int i13;
        ArrayList arrayList;
        ty tyVar = this.b;
        ArrayList arrayList2 = tyVar.I2;
        if (tyVar.B1 != null && (arrayList = tyVar.D2) != null && !arrayList.isEmpty()) {
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) tyVar.D2.get(0);
            dx dxVar = tyVar.B1;
            CharSequence charSequence = photoEntry.caption;
            if (charSequence == null) {
                charSequence = "";
            }
            dxVar.setFieldText(charSequence);
        }
        org.telegram.ui.Components.rr0 rr0Var = tyVar.G2;
        if (rr0Var != null) {
            i13 = ((org.telegram.ui.ActionBar.n2) tyVar).currentAccount;
            rr0Var.i(i13, tyVar.D2);
        }
        if ((z10 && i11 == 0) || tyVar.C2 == null || arrayList2.isEmpty()) {
            PhotoViewer.t1().G0(true, false);
            return;
        }
        tyVar.J2 = z10;
        tyVar.K2 = i11;
        ArrayList arrayList3 = new ArrayList();
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            arrayList3.add(MessagesStorage.TopicKey.of(((Long) arrayList2.get(i14)).longValue(), 0L));
        }
        PhotoViewer.t1().G0(true, false);
        tyVar.C2.w(tyVar, arrayList3, tyVar.B1.getFieldText(), false, z10, i11, i12, null);
    }

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final void s() {
        dx dxVar;
        org.telegram.ui.Components.od f12;
        PhotoViewer t12 = PhotoViewer.t1();
        CharSequence charSequence = null;
        if (t12.R1() && (f12 = t12.f1()) != null) {
            charSequence = f12.getText();
        }
        ty tyVar = this.b;
        if (charSequence != null && (dxVar = tyVar.B1) != null) {
            dxVar.setFieldText(charSequence);
        }
        ArrayList arrayList = tyVar.D2;
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

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final boolean x(int i10) {
        return this.a[i10];
    }

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        return i10;
    }
}
