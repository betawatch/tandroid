// default package

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import androidx.car.app.IOnDoneCallback;
import androidx.core.content.FileProvider;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SessionsActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class vp8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ vp8(r7a r7aVar, d7a d7aVar, File file, r47 r47Var) {
        this.a = (byte) 15;
        this.b = r7aVar;
        this.c = d7aVar;
        this.e = file;
        this.d = r47Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:337:0x08d4, code lost:
    
        if (r5 == null) goto L281;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Uri fromFile;
        int indexOf;
        int a;
        byte b = 13;
        String str = null;
        r5 = null;
        SQLiteCursor sQLiteCursor = null;
        str = null;
        char c = 1;
        r7 = true;
        boolean z = true;
        switch (this.a) {
            case 0:
                id idVar = (id) this.b;
                boolean[] zArr = (boolean[]) this.c;
                Activity activity = (Activity) this.d;
                File file = (File) this.e;
                RectF rectF = ProfileActivity.Z6;
                try {
                    idVar.dismiss();
                } catch (Exception unused) {
                }
                if (!zArr[0]) {
                    if (activity != null) {
                        Toast.makeText(activity, ob6.M0(2131751070, null), 0).show();
                        return;
                    }
                    return;
                }
                int i = Build.VERSION.SDK_INT;
                if (i >= 24) {
                    a.d();
                    fromFile = FileProvider.c(activity, "org.telegram.messenger.beta.provider", file);
                } else {
                    fromFile = Uri.fromFile(file);
                }
                Intent intent = new Intent("android.intent.action.SEND");
                if (i >= 24) {
                    intent.addFlags(1);
                }
                intent.setType("message/rfc822");
                intent.putExtra("android.intent.extra.EMAIL", "");
                intent.putExtra("android.intent.extra.SUBJECT", "Logs from " + ob6.D0().y0().format(System.currentTimeMillis()));
                intent.putExtra("android.intent.extra.STREAM", fromFile);
                if (activity != null) {
                    try {
                        activity.startActivityForResult(Intent.createChooser(intent, "Select email application."), 500);
                        return;
                    } catch (Exception e) {
                        cc4.g(e, true);
                        return;
                    }
                }
                return;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TLObject tLObject = (TLObject) this.d;
                String str2 = (String) this.e;
                RectF rectF2 = ProfileActivity.Z6;
                profileActivity.B2(tL_error, tLObject, str2);
                return;
            case 2:
                cr8 cr8Var = (cr8) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                yac yacVar = (yac) this.d;
                TLRPC.Photo photo = (TLRPC.Photo) this.e;
                ProfileActivity profileActivity2 = cr8Var.b;
                profileActivity2.o0.d1--;
                if (tLObject2 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject2;
                    profileActivity2.getMessagesController().j4(tL_photos_photo.users, false);
                    TLRPC.User X1 = profileActivity2.getMessagesController().X1(Long.valueOf(yacVar.n));
                    TLRPC.Photo photo2 = tL_photos_photo.photo;
                    if (photo2 instanceof TLRPC.TL_photo) {
                        ArrayList arrayList = profileActivity2.o0.W0;
                        if (!arrayList.isEmpty() && (indexOf = arrayList.indexOf(photo)) >= 0) {
                            arrayList.set(indexOf, photo2);
                        }
                        if (X1 != null) {
                            X1.photo.photo_id = tL_photos_photo.photo.id;
                            yacVar.v(X1);
                            yacVar.u(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 3:
                or8 or8Var = (or8) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.e;
                ProfileActivity profileActivity3 = or8Var.c.e;
                profileActivity3.w3(null);
                if (!(tLObject3 instanceof TL_fragment.TL_collectibleInfo)) {
                    d31.e0(tL_error2);
                    return;
                }
                TLObject X12 = profileActivity3.e1 != 0 ? profileActivity3.getMessagesController().X1(Long.valueOf(profileActivity3.e1)) : profileActivity3.getMessagesController().M0(Long.valueOf(profileActivity3.f1));
                if (profileActivity3.getParentActivity() != null) {
                    br4.a(profileActivity3.getParentActivity(), 0, tL_username.username, X12, (TL_fragment.TL_collectibleInfo) tLObject3, profileActivity3.A0);
                    return;
                }
                return;
            case 4:
                final au8 au8Var = (au8) this.b;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.c;
                sx4 sx4Var = (sx4) this.d;
                final View view = (View) this.e;
                cga cgaVar = au8Var.a;
                if (savedStarGift.unsaved) {
                    savedStarGift.unsaved = false;
                    sx4Var.i(savedStarGift, true, false);
                    TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                    savestargift.stargift = au8Var.e.h(savedStarGift);
                    savestargift.unsave = savedStarGift.unsaved;
                    ConnectionsManager.getInstance(au8Var.b).sendRequest(savestargift, null, 64);
                }
                boolean z2 = savedStarGift.pinned_to_top;
                final boolean z3 = !z2;
                if (au8Var.e.q(savedStarGift, z3, false)) {
                    new du8(au8Var.getContext(), cgaVar.c, savedStarGift, au8Var.c, new hcc() { // from class: ut8
                        @Override // hcc
                        public final Object run() {
                            ((sx4) view).d(z3, true);
                            au8 au8Var2 = au8.this;
                            au8Var2.f.x0(0);
                            return d31.b0(au8Var2.a.a);
                        }
                    }).show();
                    return;
                }
                if (z2) {
                    bs2.v(null, 2131749826, d31.b0(cgaVar.a), R.raw.ic_unpin, 36);
                } else {
                    d31.b0(cgaVar.a).I(R.raw.ic_pin, ob6.M0(2131750034, null), ob6.M0(2131750035, null)).j();
                }
                ((sx4) view).d(z3, true);
                au8Var.f.x0(0);
                return;
            case 5:
                n9c n9cVar = (n9c) this.b;
                jz8 jz8Var = (jz8) this.c;
                qcc qccVar = (qcc) this.d;
                pcc pccVar = (pcc) this.e;
                if (jz8.d(n9cVar.getParentActivity())) {
                    jz8Var.e();
                    w78 w78Var = new w78(10, false, false, null);
                    w78Var.H = (byte) 1;
                    w78Var.I = false;
                    w78Var.y = false;
                    w78Var.W = new pm3((Object) qccVar, (Object) n9cVar, (Object) pccVar, (byte) 25);
                    n9cVar.presentFragment(w78Var);
                    return;
                }
                return;
            case 6:
                String str3 = (String) this.b;
                qcc qccVar2 = (qcc) this.c;
                e eVar = (e) this.d;
                pcc pccVar2 = (pcc) this.e;
                try {
                    Point b1 = hl.b1();
                    Bitmap G = in5.G(str3, null, b1.x, b1.y, true);
                    if (G != null) {
                        str = jz8.l(G, qccVar2);
                        G.recycle();
                    }
                } catch (Throwable th) {
                    cc4.g(th, true);
                }
                hl.c3(new hz8(eVar, str, pccVar2));
                return;
            case 7:
                b19 b19Var = (b19) this.b;
                kf7 kf7Var = (kf7) this.c;
                a19 a19Var = (a19) this.d;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = (TLRPC.TL_messages_sendQuickReplyMessages) this.e;
                ArrayList arrayList2 = new ArrayList();
                try {
                    try {
                        sQLiteCursor = kf7Var.b.queryFinalized("SELECT id FROM quick_replies_messages WHERE topic_id = ?", Integer.valueOf(a19Var.a));
                        while (sQLiteCursor.next()) {
                            arrayList2.add(Integer.valueOf(sQLiteCursor.intValue(0)));
                        }
                    } catch (Exception e2) {
                        cc4.g(e2, true);
                        break;
                    }
                    sQLiteCursor.dispose();
                    hl.c3(new vp8((Object) b19Var, (Object) arrayList2, (Object) a19Var, (Object) tL_messages_sendQuickReplyMessages, (byte) 8));
                    return;
                } catch (Throwable th2) {
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    throw th2;
                }
            case 8:
                b19 b19Var2 = (b19) this.b;
                ArrayList<Integer> arrayList3 = (ArrayList) this.c;
                a19 a19Var2 = (a19) this.d;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages2 = (TLRPC.TL_messages_sendQuickReplyMessages) this.e;
                int i2 = b19Var2.a;
                if (arrayList3.isEmpty() || arrayList3.size() < a19Var2.a()) {
                    TLRPC.TL_messages_getQuickReplyMessages tL_messages_getQuickReplyMessages = new TLRPC.TL_messages_getQuickReplyMessages();
                    tL_messages_getQuickReplyMessages.shortcut_id = a19Var2.a;
                    ConnectionsManager.getInstance(i2).sendRequest(tL_messages_getQuickReplyMessages, new qn8((Object) b19Var2, (Object) arrayList3, (Object) tL_messages_sendQuickReplyMessages2, (byte) 5));
                    return;
                } else {
                    tL_messages_sendQuickReplyMessages2.id = arrayList3;
                    for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                        tL_messages_sendQuickReplyMessages2.random_id.add(Long.valueOf(Utilities.b.nextLong()));
                    }
                    ConnectionsManager.getInstance(i2).sendRequest(tL_messages_sendQuickReplyMessages2, null);
                    return;
                }
            case 9:
                a36 a36Var = (a36) this.b;
                IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.c;
                String str4 = (String) this.d;
                da9 da9Var = (da9) this.e;
                if (a36Var != null && ((k36) a36Var).b.compareTo(z26.c) >= 0) {
                    androidx.car.app.utils.e.c(iOnDoneCallback, str4, da9Var);
                    return;
                }
                androidx.car.app.utils.e.f(iOnDoneCallback, str4, new IllegalStateException("Lifecycle is not at least created when dispatching " + da9Var));
                return;
            case 10:
                nd9 nd9Var = (nd9) this.b;
                fu5 fu5Var = (fu5) this.c;
                og2 og2Var = (og2) this.d;
                b8[] b8VarArr = (b8[]) this.e;
                fu5Var.t0 = true;
                ed9 ed9Var = nd9Var.e;
                og2Var.a(ed9Var.m(), true);
                b8 b8Var = b8VarArr[1];
                if (b8Var != null) {
                    b8Var.setChecked(ed9Var.s);
                }
                b8 b8Var2 = b8VarArr[2];
                if (b8Var2 != null) {
                    b8Var2.setChecked(ed9Var.t);
                }
                b8 b8Var3 = b8VarArr[3];
                if (b8Var3 != null) {
                    b8Var3.setChecked(ed9Var.u);
                    return;
                }
                return;
            case 11:
                xn9 xn9Var = (xn9) this.b;
                cp9 cp9Var = (cp9) this.c;
                cp9 cp9Var2 = (cp9) this.d;
                Handler handler = (Handler) this.e;
                if (xn9Var.r0 && xn9Var.W == 0 && xn9Var.T) {
                    xn9Var.N.f(xn9Var.L, xn9Var.D, false);
                    xn9Var.U = false;
                    xn9Var.V = false;
                    xn9Var.c0 = 0.0f;
                    xn9Var.W = (byte) 1;
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    xn9Var.X = elapsedRealtimeNanos;
                    xn9Var.Y = elapsedRealtimeNanos;
                    xn9Var.d0 = cp9Var;
                    xn9Var.e0 = cp9Var2;
                    String[] strArr = mp9.a;
                    synchronized (mp9.class) {
                        mp9.b();
                        if (cp9Var == cp9Var2) {
                            throw new IllegalArgumentException("Camera switch direction must change");
                        }
                        a = mp9.a(cp9Var == cp9.b ? 0 : 1);
                    }
                    xn9Var.b0 = a;
                    xn9Var.Z = ((Math.max(jn7.n3, Math.min(jn7.W4, 300 - ((Math.max(0, a - 400) * 3) / 20))) * 45) / 100) * 1000000;
                    xn9Var.a0 = (r4 - r5) * 1000000;
                    xn9Var.i.b("synthetic camera switch started: from=" + cp9Var + ", to=" + cp9Var2 + ", expectedWaitMs=" + xn9Var.b0 + ", targetBlurRadiusPx=" + (((xn9Var.N.a * 4.0f) / 48.0f) * 1.15f) + ", overdueBlurGrowth=0.35, revealMs=" + ((xn9Var.Z + xn9Var.a0) / 1000000));
                    xn9Var.Q = -1L;
                    handler.removeCallbacks(xn9Var.y0);
                    handler.post(xn9Var.y0);
                    return;
                }
                return;
            case 12:
                nt9 nt9Var = (nt9) this.b;
                lt9 lt9Var = nt9Var.n;
                TLObject tLObject4 = (TLObject) this.c;
                ArrayList arrayList4 = (ArrayList) this.d;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.e;
                ArrayList arrayList5 = nt9Var.i;
                ArrayList arrayList6 = nt9Var.c;
                int i4 = nt9Var.a;
                boolean z4 = nt9Var.b;
                if (tLObject4 instanceof TLRPC.TL_messages_savedDialogs) {
                    nt9Var.e = true;
                    TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) tLObject4;
                    uc7.s1(i4).j4(tL_messages_savedDialogs.users, false);
                    uc7.s1(i4).c4(tL_messages_savedDialogs.chats, false);
                    kf7.a0(i4).n1(tL_messages_savedDialogs.users, tL_messages_savedDialogs.chats, true, true);
                    kf7.a0(i4).k1(tL_messages_savedDialogs.messages, false, true, false, 0, false, 3, 0L);
                    for (int i5 = 0; i5 < tL_messages_savedDialogs.dialogs.size(); i5++) {
                        mt9 b2 = mt9.b(i4, tL_messages_savedDialogs.dialogs.get(i5), tL_messages_savedDialogs.messages);
                        int i6 = 0;
                        while (true) {
                            if (i6 < arrayList6.size()) {
                                if (((mt9) arrayList6.get(i6)).a == b2.a) {
                                    b2.e = ((mt9) arrayList6.get(i6)).e;
                                    ((mt9) arrayList6.get(i6)).b = b2.b;
                                } else {
                                    i6++;
                                }
                            }
                        }
                        int i7 = 0;
                        while (true) {
                            if (i7 >= arrayList5.size()) {
                                arrayList5.add(b2);
                                if (b2.d()) {
                                    nt9Var.h++;
                                }
                            } else if (((mt9) arrayList5.get(i7)).a != b2.a) {
                                i7++;
                            }
                        }
                    }
                    nt9Var.f = true;
                    nt9Var.g = tL_messages_savedDialogs.dialogs.size();
                    nt9Var.l();
                    hl.r(lt9Var);
                    hl.d3(lt9Var, 450L);
                    nt9Var.b = false;
                } else if (tLObject4 instanceof TLRPC.TL_messages_savedDialogsSlice) {
                    nt9Var.e = true;
                    TLRPC.TL_messages_savedDialogsSlice tL_messages_savedDialogsSlice = (TLRPC.TL_messages_savedDialogsSlice) tLObject4;
                    uc7.s1(i4).j4(tL_messages_savedDialogsSlice.users, false);
                    uc7.s1(i4).c4(tL_messages_savedDialogsSlice.chats, false);
                    kf7.a0(i4).n1(tL_messages_savedDialogsSlice.users, tL_messages_savedDialogsSlice.chats, true, true);
                    kf7.a0(i4).k1(tL_messages_savedDialogsSlice.messages, false, true, false, 0, false, 3, 0L);
                    for (int i8 = 0; i8 < tL_messages_savedDialogsSlice.dialogs.size(); i8++) {
                        mt9 b3 = mt9.b(i4, tL_messages_savedDialogsSlice.dialogs.get(i8), tL_messages_savedDialogsSlice.messages);
                        int i9 = 0;
                        while (true) {
                            if (i9 < arrayList6.size()) {
                                if (((mt9) arrayList6.get(i9)).a == b3.a) {
                                    b3.e = ((mt9) arrayList6.get(i9)).e;
                                    ((mt9) arrayList6.get(i9)).b = b3.b;
                                } else {
                                    i9++;
                                }
                            }
                        }
                        int i10 = 0;
                        while (true) {
                            if (i10 >= arrayList5.size()) {
                                arrayList5.add(b3);
                                if (b3.d()) {
                                    nt9Var.h++;
                                }
                            } else if (((mt9) arrayList5.get(i10)).a != b3.a) {
                                i10++;
                            }
                        }
                    }
                    nt9Var.g = tL_messages_savedDialogsSlice.count;
                    ArrayList arrayList7 = nt9Var.j;
                    int i11 = 0;
                    for (int i12 = 0; i12 < arrayList7.size(); i12++) {
                        if (((mt9) arrayList7.get(i12)).b) {
                            i11++;
                        }
                    }
                    if (arrayList5.size() + i11 < nt9Var.g && tL_messages_savedDialogsSlice.dialogs.size() != 0) {
                        z = false;
                    }
                    nt9Var.f = z;
                    nt9Var.l();
                    hl.r(lt9Var);
                    hl.d3(lt9Var, 450L);
                    nt9Var.b = false;
                } else if (tLObject4 instanceof TLRPC.TL_messages_savedDialogsNotModified) {
                    nt9Var.e = true;
                    arrayList5.addAll(arrayList4);
                    nt9Var.g = ((TLRPC.TL_messages_savedDialogsNotModified) tLObject4).count;
                    nt9Var.h = 0;
                    for (int i13 = 0; i13 < arrayList4.size(); i13++) {
                        if (((mt9) arrayList4.get(i13)).d()) {
                            nt9Var.h++;
                        }
                    }
                    boolean z5 = nt9Var.f;
                    boolean z6 = arrayList5.size() >= nt9Var.g;
                    nt9Var.f = z6;
                    nt9Var.b = false;
                    if (z6 && !z5) {
                        nt9Var.l();
                    }
                } else if (tL_error3 != null) {
                    nt9Var.e = true;
                    if ("SAVED_DIALOGS_UNSUPPORTED".equals(tL_error3.text)) {
                        nt9Var.b = true;
                    }
                }
                if (nt9Var.b != z4) {
                    uc7.s1(i4).Y3.edit().putBoolean("savedMessagesUnsupported", nt9Var.b).apply();
                }
                nt9Var.d = false;
                return;
            case 13:
                gx9 gx9Var = (gx9) this.b;
                uj3 uj3Var = (uj3) this.c;
                Activity activity2 = (Activity) this.d;
                fu5 fu5Var2 = (fu5) this.e;
                uj3Var.showDialog(new xd5(activity2, uj3Var.getResourceProvider(), new dn9(gx9Var, uj3Var, (byte) 14)));
                fu5Var2.u();
                return;
            case 14:
                gx9 gx9Var2 = (gx9) this.b;
                uj3 uj3Var2 = (uj3) this.c;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.d;
                fu5 fu5Var3 = (fu5) this.e;
                byte[] bArr = tL_sponsoredPeer.random_id;
                vnb resourceProvider = uj3Var2.getResourceProvider();
                dn9 dn9Var = new dn9(gx9Var2, tL_sponsoredPeer, b);
                int i14 = nb9.v1;
                int currentAccount = uj3Var2.getCurrentAccount();
                Activity parentActivity = uj3Var2.getParentActivity();
                if (parentActivity != null) {
                    TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
                    tL_messages_reportSponsoredMessage.random_id = bArr;
                    tL_messages_reportSponsoredMessage.option = new byte[0];
                    ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new rt(parentActivity, resourceProvider, bArr, uj3Var2, dn9Var, currentAccount));
                }
                fu5Var3.u();
                return;
            case 15:
                r7a r7aVar = (r7a) this.b;
                d7a d7aVar = (d7a) this.c;
                File file2 = (File) this.e;
                r47 r47Var = (r47) this.d;
                TLRPC.Document F0 = d7aVar.m.F0();
                if (F0.thumbs.isEmpty() || (F0.thumbs.get(0).location instanceof TLRPC.TL_fileLocationUnavailable)) {
                    try {
                        Bitmap G2 = in5.G(file2.getAbsolutePath(), null, 90.0f, 90.0f, true);
                        if (G2 != null) {
                            F0.thumbs.clear();
                            F0.thumbs.add(in5.U(G2, 90.0f, 90.0f, 55, d7aVar.d != null));
                            G2.recycle();
                        }
                    } catch (Exception e3) {
                        F0.thumbs.clear();
                        cc4.g(e3, true);
                    }
                }
                hl.c3(new cp7((Object) r7aVar, (Object) d7aVar, (Object) file2, (Object) F0, (Object) r47Var, (byte) 23));
                return;
            case 16:
                r7a r7aVar2 = (r7a) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                d7a d7aVar2 = (d7a) this.d;
                String str5 = (String) this.e;
                if (tLObject5 != null) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject5;
                    ls6 mediaDataController = r7aVar2.getMediaDataController();
                    mediaDataController.getClass();
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    if (stickerSet != null) {
                        mediaDataController.J.k(stickerSet.id, tL_messages_stickerSet);
                        String str6 = tL_messages_stickerSet.set.short_name;
                        if (str6 != null) {
                            mediaDataController.O.put(str6.toLowerCase(), tL_messages_stickerSet);
                        }
                    }
                    TLRPC.TL_documentAttributeSticker_layer55 tL_documentAttributeSticker_layer55 = (TLRPC.TL_documentAttributeSticker_layer55) d7aVar2.h;
                    TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                    tL_documentAttributeSticker_layer55.stickerset = tL_inputStickerSetShortName;
                    tL_inputStickerSetShortName.short_name = tL_messages_stickerSet.set.short_name;
                } else {
                    c = 0;
                }
                ArrayList arrayList8 = (ArrayList) r7aVar2.a.remove(str5);
                if (arrayList8 == null || arrayList8.isEmpty()) {
                    return;
                }
                if (c != 0) {
                    r7aVar2.getMessagesStorage().s1(((d7a) arrayList8.get(0)).m.k, null, null, false);
                }
                wx9 secretChatHelper = r7aVar2.getSecretChatHelper();
                TLRPC.DecryptedMessage decryptedMessage = (TLRPC.DecryptedMessage) d7aVar2.d;
                r47 r47Var2 = d7aVar2.m;
                secretChatHelper.j(decryptedMessage, r47Var2.k, d7aVar2.n, null, null, r47Var2);
                return;
            case 17:
                f7a f7aVar = (f7a) this.b;
                TLObject tLObject6 = (TLObject) this.c;
                TLRPC.TL_messages_initHistoryImport tL_messages_initHistoryImport = (TLRPC.TL_messages_initHistoryImport) this.d;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.e;
                boolean z7 = tLObject6 instanceof TLRPC.TL_messages_historyImport;
                i7a i7aVar = f7aVar.b;
                r7a r7aVar3 = i7aVar.q;
                if (!z7) {
                    r7aVar3.E.l(i7aVar.j);
                    r7aVar3.getNotificationCenter().k(jn7.v1, Long.valueOf(i7aVar.j), tL_messages_initHistoryImport, tL_error4);
                    return;
                }
                i7aVar.k = ((TLRPC.TL_messages_historyImport) tLObject6).id;
                ArrayList arrayList9 = i7aVar.f;
                HashSet hashSet = i7aVar.c;
                hashSet.remove(i7aVar.a);
                r7aVar3.getNotificationCenter().k(jn7.v1, Long.valueOf(i7aVar.j));
                if (hashSet.isEmpty()) {
                    TLRPC.TL_messages_startHistoryImport tL_messages_startHistoryImport = new TLRPC.TL_messages_startHistoryImport();
                    tL_messages_startHistoryImport.peer = i7aVar.g;
                    tL_messages_startHistoryImport.import_id = i7aVar.k;
                    r7aVar3.getConnectionsManager().sendRequest(tL_messages_startHistoryImport, new h7a(i7aVar, tL_messages_startHistoryImport));
                }
                i7aVar.n = SystemClock.elapsedRealtime();
                int size = arrayList9.size();
                for (int i15 = 0; i15 < size; i15++) {
                    r7aVar3.getFileLoader().h0(false, 67108864, (String) arrayList9.get(i15), true);
                }
                return;
            case 18:
                l7a l7aVar = (l7a) this.b;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.c;
                TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet = (TLRPC.TL_stickers_createStickerSet) this.d;
                TLObject tLObject7 = (TLObject) this.e;
                m7a m7aVar = l7aVar.b;
                r7a r7aVar4 = m7aVar.o;
                r7aVar4.G.remove(m7aVar.e);
                if (tL_error5 == null) {
                    r7aVar4.getNotificationCenter().k(jn7.w1, m7aVar.e);
                } else {
                    r7aVar4.getNotificationCenter().k(jn7.w1, m7aVar.e, tL_stickers_createStickerSet, tL_error5);
                }
                if (tLObject7 instanceof TLRPC.TL_messages_stickerSet) {
                    if (r7aVar4.getNotificationCenter().a.indexOfKey(jn7.x1) >= 0) {
                        r7aVar4.getNotificationCenter().k(jn7.x1, tLObject7);
                        return;
                    } else {
                        r7aVar4.getMediaDataController().h2(null, tLObject7, 2, null, false, false);
                        return;
                    }
                }
                return;
            case 19:
                SessionsActivity sessionsActivity = (SessionsActivity) this.c;
                id idVar2 = (id) this.b;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.d;
                TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) this.e;
                sessionsActivity.getClass();
                try {
                    idVar2.dismiss();
                } catch (Exception e4) {
                    cc4.g(e4, true);
                }
                if (tL_error6 == null) {
                    sessionsActivity.d.remove(tL_webAuthorization);
                    sessionsActivity.q0();
                    xaa xaaVar = sessionsActivity.a;
                    if (xaaVar != null) {
                        xaaVar.f();
                        return;
                    }
                    return;
                }
                return;
            case 20:
                SessionsActivity sessionsActivity2 = (SessionsActivity) this.c;
                id idVar3 = (id) this.b;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.d;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) this.e;
                sessionsActivity2.getClass();
                try {
                    idVar3.dismiss();
                } catch (Exception e5) {
                    cc4.g(e5, true);
                }
                if (tL_error7 == null) {
                    sessionsActivity2.d.remove(tL_authorization);
                    sessionsActivity2.e.remove(tL_authorization);
                    sessionsActivity2.q0();
                    xaa xaaVar2 = sessionsActivity2.a;
                    if (xaaVar2 != null) {
                        xaaVar2.f();
                        return;
                    }
                    return;
                }
                return;
            case 21:
                waa waaVar = (waa) this.b;
                TLObject tLObject8 = (TLObject) this.c;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) this.d;
                da1 da1Var = (da1) this.e;
                waaVar.a = tLObject8;
                waaVar.b = tL_error8;
                da1Var.run();
                return;
            case 22:
                ((uba) this.b).d0((TLRPC.TL_error) this.c, (TLObject) this.d, (String) this.e);
                return;
            case 23:
                TLObject tLObject9 = (TLObject) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                yt0 yt0Var = (yt0) this.d;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.e;
                if (!(tLObject9 instanceof TLRPC.TL_boolTrue)) {
                    if (zArr2[0]) {
                        return;
                    }
                    zArr2[0] = true;
                    yt0Var.a(Boolean.TRUE, "cancelled");
                    return;
                }
                userFull.bot_can_manage_emoji_status = true;
                if (zArr2[0]) {
                    return;
                }
                zArr2[0] = true;
                yt0Var.a(Boolean.TRUE, "allowed");
                return;
            case 24:
                kea keaVar = (kea) this.b;
                AtomicReference atomicReference = (AtomicReference) this.c;
                tda tdaVar = (tda) this.d;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.e;
                atomicReference.set(null);
                tdaVar.didReceivedNotification(jn7.t5, keaVar.a, Long.valueOf(-dialog.id));
                return;
            case 25:
                wua wuaVar = (wua) this.b;
                boolean[] zArr3 = (boolean[]) this.c;
                TL_stars.StarGiftAttribute starGiftAttribute = (TL_stars.StarGiftAttribute) this.d;
                y41[] y41VarArr = (y41[]) this.e;
                if (zArr3[0]) {
                    return;
                }
                zArr3[0] = true;
                TL_stars.StarGift s1 = wuaVar.s1();
                ov4.c(wuaVar.a).j(s1.gift_id, new hu0(wuaVar, s1, starGiftAttribute, y41VarArr, zArr3, (byte) 8));
                return;
            case 26:
                wua wuaVar2 = (wua) this.b;
                TLObject tLObject10 = (TLObject) this.c;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) this.d;
                String str7 = (String) this.e;
                if (tLObject10 instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject10;
                    if ((tL_payments_uniqueStarGift.gift instanceof TL_stars.TL_starGiftUnique) && !wuaVar2.J && wuaVar2.a3 == nftitem && TextUtils.equals(wuaVar2.D2, str7)) {
                        uc7.s1(wuaVar2.a).j4(tL_payments_uniqueStarGift.users, false);
                        uc7.s1(wuaVar2.a).c4(tL_payments_uniqueStarGift.chats, false);
                        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) tL_payments_uniqueStarGift.gift;
                        nftitem.gift = tL_starGiftUnique;
                        wuaVar2.n2(str7, tL_starGiftUnique, wuaVar2.B2);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                wua wuaVar3 = (wua) this.b;
                TLObject tLObject11 = (TLObject) this.c;
                jr9 jr9Var = (jr9) this.d;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) this.e;
                if (!(tLObject11 instanceof TLRPC.TL_messages_chatFull)) {
                    v21 Z = wuaVar3.j().Z(tL_error9);
                    Z.u = true;
                    Z.j();
                    return;
                }
                TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject11;
                uc7.s1(wuaVar3.a).j4(tL_messages_chatFull.users, false);
                uc7.s1(wuaVar3.a).c4(tL_messages_chatFull.chats, false);
                uc7.s1(wuaVar3.a).b4(tL_messages_chatFull.full_chat);
                if (tL_messages_chatFull.full_chat.stargifts_available) {
                    jr9Var.run();
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wuaVar3.J0, wuaVar3.getContext());
                alertDialog$Builder.a.S = ob6.M0(2131750221, null);
                alertDialog$Builder.a.U = ob6.M0(2131750222, null);
                c00.u(null, 2131747558, alertDialog$Builder, null);
                return;
            case 28:
                wua wuaVar4 = (wua) this.b;
                r47 r47Var3 = (r47) this.c;
                ArrayList arrayList10 = (ArrayList) this.d;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.e;
                wuaVar4.j3 = true;
                wuaVar4.m2(r47Var3, null);
                wuaVar4.A2(0, true, null);
                tj4 tj4Var = wuaVar4.V1;
                if (tj4Var != null) {
                    tj4Var.c(true);
                }
                jxa.v(wuaVar4.a, false).L();
                axa D = jxa.v(wuaVar4.a, false).D(yac.h(wuaVar4.a).e(), false);
                if (D != null) {
                    D.l(arrayList10, starGift);
                    return;
                }
                return;
            default:
                wua wuaVar5 = (wua) this.b;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) this.c;
                TLObject tLObject12 = (TLObject) this.d;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.e;
                if (tL_error10 != null || !(tLObject12 instanceof TLRPC.Updates)) {
                    wuaVar5.j().g0(tL_error10, false);
                    return;
                }
                wuaVar5.m2 = true;
                wuaVar5.q3 = null;
                wuaVar5.d1(inputSavedStarGift, (TLRPC.Updates) tLObject12, new jra(wuaVar5, b));
                Utilities.d.c(new kba((Object) wuaVar5, (Object) tLObject12, (byte) 15));
                return;
        }
    }

    public /* synthetic */ vp8(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public /* synthetic */ vp8(SessionsActivity sessionsActivity, id idVar, TLRPC.TL_error tL_error, TLObject tLObject, byte b) {
        this.a = b;
        this.c = sessionsActivity;
        this.b = idVar;
        this.d = tL_error;
        this.e = tLObject;
    }
}
