package xh;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.je;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class m5 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ m5(n5 n5Var, int[] iArr, TLObject tLObject, boolean z10) {
        this.c = n5Var;
        this.d = iArr;
        this.e = tLObject;
        this.b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        boolean z10 = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i10) {
            case 0:
                n5 n5Var = (n5) obj3;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList = n5Var.l;
                int i11 = n5Var.a;
                if (((int[]) obj2)[0] == n5Var.m) {
                    n5Var.i = false;
                    n5Var.m = -1;
                    if (tLObject instanceof TL_stars.TL_payments_savedStarGifts) {
                        TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject;
                        MessagesController.getInstance(i11).putUsers(tL_payments_savedStarGifts.users, false);
                        MessagesController.getInstance(i11).putChats(tL_payments_savedStarGifts.chats, false);
                        if (z10) {
                            arrayList.clear();
                        }
                        arrayList.addAll(tL_payments_savedStarGifts.gifts);
                        n5Var.k = tL_payments_savedStarGifts.next_offset;
                        n5Var.n = tL_payments_savedStarGifts.count;
                        n5Var.h = (tL_payments_savedStarGifts.flags & 2) != 0 ? Boolean.valueOf(tL_payments_savedStarGifts.chat_notifications_enabled) : null;
                        n5Var.j = arrayList.size() > n5Var.n || n5Var.k == null;
                    } else {
                        n5Var.j = true;
                    }
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(n5Var.b), n5Var);
                    break;
                }
                break;
            default:
                zh.e2 e2Var = (zh.e2) obj3;
                zh.a3 a3Var = e2Var.a;
                org.telegram.ui.Components.d5.a0(a3Var.C2, 1, a3Var.B1, new je(e2Var, z10, (yg.p0) obj, (View) obj2));
                break;
        }
    }

    public /* synthetic */ m5(zh.e2 e2Var, View view, yg.p0 p0Var, boolean z10, boolean z11) {
        this.c = e2Var;
        this.d = view;
        this.e = p0Var;
        this.b = z10;
    }
}
