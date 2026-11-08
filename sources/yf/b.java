package yf;

import android.graphics.Point;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.TextView;
import bi.eb;
import bi.i5;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.g0;
import org.telegram.messenger.hc;
import org.telegram.messenger.id;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.Cells.e5;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.sf0;
import org.telegram.ui.Components.up0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Wallet.t;
import yh.l;
import yh.m;
import zh.y0;
import zh.z1;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.Document document;
        int i7 = this.a;
        int i10 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i7) {
            case 0:
                d dVar = (d) obj2;
                ArrayList arrayList = (ArrayList) obj;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    c cVar = (c) arrayList.get(i11);
                    if (cVar != null && ((TextUtils.isEmpty(cVar.b) || !new File(cVar.b).exists()) && (document = cVar.a) != null)) {
                        w7.G(dVar.c);
                        File I = w7.I(document);
                        if (I == null || !I.exists()) {
                            g0.h3(new b(i10, dVar, document));
                        }
                    }
                }
                break;
            case 1:
                TLRPC.Document document2 = (TLRPC.Document) obj;
                w7.G(((d) obj2).c).W(document2, document2, 0, 0);
                break;
            case 2:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                int i12 = ((e) obj2).a;
                if (tL_error.text.equals("RINGTONE_DURATION_TOO_LONG")) {
                    qs.e().k(qs.P4, 4, id.a0("TooLongError", null, 2131744044, new Object[0]), id.a0("ErrorRingtoneDurationTooLong", null, 2131751105, Integer.valueOf(qp.s1(i12).k4)));
                    break;
                } else if (tL_error.text.equals("RINGTONE_SIZE_TOO_BIG")) {
                    qs.e().k(qs.P4, 4, id.a0("TooLargeError", null, 2131744045, new Object[0]), id.a0("ErrorRingtoneSizeTooBig", null, 2131751103, Integer.valueOf(qp.s1(i12).l4 / 1024)));
                    break;
                } else {
                    qs.e().k(qs.P4, 4, id.a0("InvalidFormatError", null, 2131749182, new Object[0]), id.M0(2131751104, null));
                    break;
                }
            case 3:
                ((xg.a) obj2).a((TLRPC.Chat) obj);
                break;
            case 4:
                m mVar = (m) obj2;
                e5 e5Var = (e5) obj;
                int i13 = mVar.k;
                f2 f2Var = mVar.g;
                TLRPC.TL_chatInviteImporter importer = e5Var.getImporter();
                mVar.r = importer;
                LongSparseArray longSparseArray = mVar.d;
                TLRPC.User user = (TLRPC.User) longSparseArray.get(importer.user_id);
                if (user != null) {
                    f2Var.getMessagesController().X3(user, false, false);
                    Point point = g0.q;
                    boolean z9 = point.x > point.y;
                    if (user.photo != null && !z9) {
                        if (mVar.s == null) {
                            l lVar = new l(mVar, f2Var.getParentActivity(), (pj0) e5Var.getParent(), f2Var.getResourceProvider(), mVar.a);
                            mVar.s = lVar;
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = mVar.r;
                            l9 avatarImageView = e5Var.getAvatarImageView();
                            lVar.r = tL_chatInviteImporter;
                            lVar.w = avatarImageView;
                            TLRPC.User a22 = qp.s1(i13).a2(Long.valueOf(tL_chatInviteImporter.user_id));
                            hc m10 = hc.m(i13, 0, a22);
                            hc m11 = hc.m(i13, 1, a22);
                            if (qp.s1(i13).b2(tL_chatInviteImporter.user_id) == null) {
                                qp.s1(i13).g3(a22, false, 0);
                            }
                            sf0 sf0Var = lVar.h;
                            sf0Var.setParentAvatarImage(avatarImageView);
                            sf0Var.M(tL_chatInviteImporter.user_id, true);
                            sf0Var.H(null, m10, m11, true);
                            lVar.d.setText(t10.p((TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id)));
                            String str = tL_chatInviteImporter.about;
                            TextView textView = lVar.e;
                            textView.setText(str);
                            textView.setVisibility(TextUtils.isEmpty(tL_chatInviteImporter.about) ? 8 : 0);
                            lVar.D.requestLayout();
                            mVar.s.setOnDismissListener(new eb(mVar, 15));
                            mVar.s.show();
                            break;
                        }
                    } else {
                        mVar.b = true;
                        f2Var.dismissCurrentDialog();
                        Bundle bundle = new Bundle();
                        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                        bundle.putLong("user_id", user.id);
                        bundle.putBoolean("removeFragmentOnChatOpen", false);
                        f2Var.presentFragment(profileActivity);
                        break;
                    }
                }
                break;
            case 5:
                zh.c cVar2 = (zh.c) obj2;
                cVar2.getClass();
                ((View.OnClickListener) obj).onClick(cVar2);
                break;
            case 6:
                ((i5) obj2).k().f0((TLRPC.TL_error) obj, false);
                break;
            case 7:
                y0 y0Var = (y0) obj2;
                y0Var.getClass();
                if (!((TL_stars.SavedStarGift) obj).unsaved) {
                    y0Var.F.setVisibility(8);
                    break;
                }
                break;
            case 8:
                up0 up0Var = (up0) obj2;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                up0Var.h(tL_starGiftCollection.title, new t(17, up0Var, tL_starGiftCollection));
                break;
            default:
                g0.g((String) obj);
                org.telegram.ui.Components.hc.a0(((z1) obj2).a.a).k(false).j();
                break;
        }
    }
}
