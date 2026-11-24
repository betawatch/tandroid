// default package

import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.View;
import java.util.ArrayList;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class zq1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ zq1(nm7 nm7Var, int i, Object[] objArr, int i2) {
        this.a = (byte) 11;
        this.d = nm7Var;
        this.b = i;
        this.e = objArr;
        this.c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        byte b = this.a;
        final byte b2 = 1;
        int i2 = this.b;
        int i3 = this.c;
        Object obj = this.e;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                ((yv1) obj2).didReceivedNotification(i2, i3, (Object[]) obj);
                break;
            case 1:
                k47 messageObject = ((cm1) obj).getMessageObject();
                yv1 yv1Var = ((cu1) obj2).a.R;
                yv1Var.sb(this.b, messageObject.e1(), true, k47.B0(messageObject.k) == yv1Var.d7 ? 1 : 0, true, 0, Integer.valueOf(i3), null, null);
                break;
            case 2:
                rc2 rc2Var = (rc2) obj;
                yv1 yv1Var2 = ((iv1) obj2).a;
                if (yv1Var2.P1 != null) {
                    rc2Var.getLocationInWindow(new int[2]);
                    yv1Var2.P1.setTranslationY(b10.z(520.0f, r1[1] - r3.getTop(), i2));
                    yv1Var2.P1.o(0.0f, (-gm.L(16.0f)) + r1[0] + i3);
                    yv1Var2.P1.v();
                    break;
                }
                break;
            case 3:
                ConnectionsManager.lambda$onIntegrityCheckClassic$27(i2, (String) obj2, (String) obj, i3);
                break;
            case 4:
                final lk3 lk3Var = (lk3) obj2;
                TLRPC.Dialog dialog = (TLRPC.Dialog) obj;
                mk3 mk3Var = lk3Var.h;
                nk3 nk3Var = lk3Var.i;
                ArrayList arrayList = nk3Var.T1;
                if (arrayList != null) {
                    arrayList.remove(dialog);
                    int i4 = dialog.pinnedNum;
                    nk3Var.Y0 = null;
                    mk3Var.a.invalidate();
                    int M0 = mk3Var.c.M0();
                    if (M0 == i2 - 1) {
                        mk3Var.c.m(M0).requestLayout();
                    }
                    if (nk3Var.getMessagesController().D2(dialog.id, false)) {
                        nk3Var.getMessagesController().f2();
                        mk3Var.y.D();
                        mk3Var.b(true);
                        break;
                    } else {
                        int b3 = nk3Var.getMessagesController().b(nk3Var.Y2 == 0 ? 1 : 0, -1, dialog.id);
                        if (b3 != 2 || i3 != 0) {
                            mk3Var.y.D();
                            mk3Var.b(true);
                        }
                        if (nk3Var.Y2 == 0) {
                            if (b3 == 2) {
                                boolean z = gda.m1;
                                if (z) {
                                    gda.m1 = !z;
                                    SharedPreferences.Editor edit = oc7.d1().edit();
                                    edit.putBoolean("archiveHidden", gda.m1);
                                    edit.apply();
                                }
                                mk3Var.y.D();
                                if (i3 == 0) {
                                    nk3Var.U4(true, true);
                                    mk3Var.b(true);
                                    nk3Var.I2();
                                } else {
                                    mk3Var.b(true);
                                    if (!gda.m1 && mk3Var.c.K0() == 0) {
                                        nk3Var.g2 = true;
                                        mk3Var.a.x0(0, -gm.L(gda.l1 ? 76.0f : 70.0f), null);
                                    }
                                }
                                i = ((d) nk3Var).currentAccount;
                                nk3Var.T1.add(0, (TLRPC.Dialog) nk3Var.o3(i, mk3Var.s, nk3Var.Y2, false).get(0));
                                mk3Var.b(true);
                                gm.d3(new Runnable() { // from class: kk3
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b4 = r2;
                                        lk3 lk3Var2 = lk3Var;
                                        switch (b4) {
                                            case 0:
                                                lk3Var2.i.U4(false, true);
                                                break;
                                            default:
                                                lk3Var2.i.U4(false, true);
                                                break;
                                        }
                                    }
                                }, 300L);
                            } else if (b3 == 1) {
                                u69 K = mk3Var.a.K(0);
                                if (K != null) {
                                    View view = K.a;
                                    if (view instanceof hg3) {
                                        hg3 hg3Var = (hg3) view;
                                        if (hg3Var.b2.n == 2) {
                                            hg3Var.c2 = true;
                                            hg3Var.d2 = 0.0f;
                                            cmb.t1.O(true, 0.0f);
                                            cmb.t1.start();
                                            hg3Var.invalidate();
                                        }
                                    }
                                }
                                gm.d3(new Runnable() { // from class: kk3
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b4 = b2;
                                        lk3 lk3Var2 = lk3Var;
                                        switch (b4) {
                                            case 0:
                                                lk3Var2.i.U4(false, true);
                                                break;
                                            default:
                                                lk3Var2.i.U4(false, true);
                                                break;
                                        }
                                    }
                                }, 300L);
                            }
                            SharedPreferences d1 = oc7.d1();
                            r5 = (d1.getBoolean("archivehint_l", false) || gda.m1) ? (byte) 1 : (byte) 0;
                            if (r5 == 0) {
                                d1.edit().putBoolean("archivehint_l", true).commit();
                            }
                            UndoView w3 = nk3Var.w3();
                            if (w3 != null) {
                                w3.l(dialog.id, r5 != 0 ? 2 : 3, null, new wc7((Object) lk3Var, (Object) dialog, i4, (byte) 19));
                            }
                        }
                        if (nk3Var.Y2 != 0 && nk3Var.T1.isEmpty()) {
                            mk3Var.a.setEmptyView(null);
                            mk3Var.x.setVisibility(4);
                            break;
                        }
                    }
                }
                break;
            case 5:
                h74 h74Var = ((c74) obj2).a;
                Surface surface = new Surface((SurfaceTexture) obj);
                h74Var.q1(surface);
                h74Var.U = surface;
                h74Var.f1(i2, i3);
                break;
            case 6:
                String str = (String) obj;
                fn5 fn5Var = ((pm5) obj2).b;
                if (i2 != 1) {
                    fn5Var.s.c(new jm5(fn5Var, str, b2));
                }
                nm7.f(i3).k(nm7.Z1, str, Integer.valueOf(i2));
                break;
            case 7:
                oc7 oc7Var = (oc7) obj2;
                oc7Var.i1.clear();
                oc7Var.p1.clear();
                cf7 messagesStorage = oc7Var.getMessagesStorage();
                messagesStorage.G();
                oc7Var.u4(true, messagesStorage.w, ((TLRPC.updates_Difference) obj).pts, this.b, this.c);
                oc7Var.N1().p();
                break;
            case 8:
                xb7 xb7Var = (xb7) obj2;
                TLRPC.photos_Photos photos_photos = (TLRPC.photos_Photos) obj;
                xb7Var.h.d4(photos_photos.users, false);
                xb7Var.d(i2, i3, photos_photos);
                break;
            case 9:
                xb7 xb7Var2 = (xb7) obj2;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                oc7 oc7Var2 = xb7Var2.h;
                oc7Var2.d4(messages_messages.users, false);
                oc7Var2.X3(messages_messages.chats, false);
                TLRPC.TL_photos_photos tL_photos_photos = new TLRPC.TL_photos_photos();
                tL_photos_photos.count = messages_messages.count;
                int i5 = 0;
                for (int i6 = 0; i6 < messages_messages.messages.size(); i6++) {
                    TLRPC.MessageAction messageAction = messages_messages.messages.get(i6).action;
                    if (messageAction != null) {
                        TLRPC.Photo photo = messageAction.photo;
                        if (photo instanceof TLRPC.TL_photo) {
                            tL_photos_photos.photos.add(photo);
                        }
                    }
                    i5++;
                }
                if (i2 == 0 && messages_messages.messages.size() >= messages_messages.count) {
                    tL_photos_photos.count -= i5;
                }
                xb7Var2.d(i2, i3, tL_photos_photos);
                break;
            case 10:
                cf7 cf7Var = (cf7) obj2;
                byte[] bArr = (byte[]) obj;
                try {
                    SQLitePreparedStatement executeFast = cf7Var.b.executeFast("UPDATE params SET lsv = ?, sg = ?, pbytes = ? WHERE id = 1");
                    executeFast.bindInteger(1, i2);
                    executeFast.bindInteger(2, i3);
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(bArr != null ? bArr.length : 1);
                    if (bArr != null) {
                        nativeByteBuffer.writeBytes(bArr);
                    }
                    executeFast.bindByteBuffer(3, nativeByteBuffer);
                    executeFast.step();
                    executeFast.dispose();
                    nativeByteBuffer.reuse();
                    break;
                } catch (Exception e) {
                    cf7Var.n(e, true);
                    return;
                }
            default:
                nm7 nm7Var = (nm7) obj2;
                nm7Var.l((Object[]) obj, i2, false);
                nm7Var.q.remove(i3);
                break;
        }
    }

    public /* synthetic */ zq1(int i, int i2, String str, String str2) {
        this.a = (byte) 3;
        this.b = i;
        this.d = str;
        this.e = str2;
        this.c = i2;
    }

    public /* synthetic */ zq1(Object obj, int i, int i2, Object obj2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = i;
        this.c = i2;
        this.e = obj2;
    }

    public /* synthetic */ zq1(Object obj, Object obj2, int i, int i2, byte b) {
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.b = i;
        this.c = i2;
    }
}
