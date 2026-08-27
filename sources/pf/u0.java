package pf;

import ag.k2;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import f2.o1;
import h7.z5;
import j$.util.List;
import j$.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.c9;
import org.telegram.messenger.ik;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.d2;
import org.telegram.ui.Cells.e5;
import org.telegram.ui.Cells.y7;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.gs0;
import org.telegram.ui.Components.iq0;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.lp0;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.ow;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.v90;
import org.telegram.ui.Components.y8;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.di1;
import org.telegram.ui.rc1;
import org.telegram.ui.rn;
import qf.m1;
import qf.p1;
import qf.q1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class u0 extends yk0 implements NotificationCenter.NotificationCenterDelegate {
    public p0 A;
    public int A0;
    public String B;
    public c9 B0;
    public s0 C;
    public rn C0;
    public s0 D;
    public final c6 D0;
    public ArrayList E;
    public ArrayList F;
    public Object[] F0;
    public ArrayList G;
    public String H;
    public ArrayList I;
    public ArrayList J;
    public String[] K;
    public ArrayList L;
    public ArrayList M;
    public ArrayList N;
    public long O;
    public TLRPC.TL_inlineBotSwitchPM P;
    public TLRPC.TL_inlineBotWebView Q;
    public final v90 R;
    public a0.h S;
    public int T;
    public int U;
    public String V;
    public boolean W;
    public boolean X;
    public int Y;
    public ArrayList Z;
    public int c0;
    public int e0;
    public int f0;
    public boolean g0;
    public final Context h;
    public TLRPC.Chat h0;
    public ow j0;
    public boolean k0;
    public gs0 l0;
    public String m0;
    public long n;
    public String n0;
    public String o0;
    public int p0;
    public int q0;
    public final long r;
    public boolean r0;
    public final boolean s;
    public TLRPC.User s0;
    public boolean t0;
    public m0 u0;
    public TLRPC.ChatFull v;
    public Location v0;
    public final j1 w;
    public ArrayList w0;
    public ArrayList x;
    public HashMap x0;
    public a0.h y;
    public String z0;
    public boolean c = true;
    public boolean d = true;
    public boolean e = true;
    public int f = UserConfig.selectedAccount;
    public boolean a0 = true;
    public boolean b0 = true;
    public boolean d0 = true;
    public boolean i0 = false;
    public final ArrayList y0 = new ArrayList();
    public final l0 E0 = new l0(this, new k0(this));
    public boolean G0 = false;
    public int H0 = -1;

    public u0(Context context, long j10, long j11, v90 v90Var, c6 c6Var, boolean z10) {
        this.D0 = c6Var;
        this.h = context;
        this.R = v90Var;
        this.n = j10;
        this.s = z10;
        this.r = j11;
        j1 j1Var = new j1(true);
        this.w = j1Var;
        j1Var.a = new n1.d(this, 15);
        NotificationCenter.getInstance(this.f).addObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(this.f).addObserver(this, NotificationCenter.fileLoadFailed);
        NotificationCenter.getInstance(this.f).addObserver(this, NotificationCenter.recentDocumentsDidLoad);
        NotificationCenter.getInstance(this.f).addObserver(this, NotificationCenter.stickersDidLoad);
    }

    public static boolean O(TLRPC.Document document, String str) {
        int size = document.attributes.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                String str2 = documentAttribute.alt;
                if (str2 == null || !str2.contains(str)) {
                    break;
                }
                return true;
            }
            i10++;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(o1 o1Var) {
        return (this.s0 == null || this.d0) && this.w0 == null;
    }

    public final void E(TLRPC.Document document, String str) {
        String str2 = document.dc_id + "_" + document.id;
        HashMap hashMap = this.x0;
        if (hashMap == null || !hashMap.containsKey(str2)) {
            if (UserConfig.getInstance(this.f).isPremium() || !MessageObject.isPremiumSticker(document)) {
                if (this.w0 == null) {
                    this.w0 = new ArrayList();
                    this.x0 = new HashMap();
                }
                this.w0.add(new t0(document, str));
                this.x0.put(str2, document);
                ow owVar = this.j0;
                if (owVar != null) {
                    owVar.a();
                }
            }
        }
    }

    public final void F(String str, ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i10 = 0;
        Object obj = str;
        while (i10 < size) {
            TLRPC.Document document = (TLRPC.Document) arrayList.get(i10);
            String str2 = document.dc_id + "_" + document.id;
            HashMap hashMap = this.x0;
            if ((hashMap == null || !hashMap.containsKey(str2)) && (UserConfig.getInstance(this.f).isPremium() || !MessageObject.isPremiumSticker(document))) {
                int size2 = document.attributes.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size2) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i11);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                        obj = documentAttribute.stickerset;
                        break;
                    }
                    i11++;
                }
                if (this.w0 == null) {
                    this.w0 = new ArrayList();
                    this.x0 = new HashMap();
                }
                this.w0.add(new t0(document, obj));
                this.x0.put(str2, document);
            }
            i10++;
            obj = obj;
        }
    }

    public final void G() {
        rn rnVar = this.C0;
        if (rnVar == null || rnVar.getParentActivity() == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23 && this.C0.getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            this.C0.getParentActivity().requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            return;
        }
        TLRPC.User user = this.s0;
        if (user == null || !user.bot_inline_geo) {
            return;
        }
        this.E0.start();
    }

    public final void H() {
        if (this.w0 == null) {
            return;
        }
        ArrayList arrayList = this.y0;
        arrayList.clear();
        int min = Math.min(6, this.w0.size());
        for (int i10 = 0; i10 < min; i10++) {
            t0 t0Var = (t0) this.w0.get(i10);
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(t0Var.a.thumbs, 90);
            if (((closestPhotoSizeWithSize instanceof TLRPC.TL_photoSize) || (closestPhotoSizeWithSize instanceof TLRPC.TL_photoSizeProgressive)) && !FileLoader.getInstance(this.f).getPathToAttach(closestPhotoSizeWithSize, "webp", true).exists()) {
                arrayList.add(FileLoader.getAttachFileName(closestPhotoSizeWithSize, "webp"));
                FileLoader.getInstance(this.f).loadFile(ImageLocation.getForDocument(closestPhotoSizeWithSize, t0Var.a), t0Var.b, "webp", 1, 1);
            }
        }
        arrayList.isEmpty();
    }

    public final TLRPC.TL_inlineBotSwitchPM I() {
        TLRPC.User user = this.s0;
        if (user == null || user.id == this.O) {
            return this.P;
        }
        return null;
    }

    public final Object J(int i10) {
        String str;
        TLRPC.User user = null;
        if (this.B != null) {
            if (i10 >= 2) {
                i10 -= 2;
            }
            return null;
        }
        ArrayList arrayList = this.w0;
        if (arrayList == null) {
            ArrayList arrayList2 = this.N;
            if (arrayList2 != null) {
                TLRPC.TL_inlineBotWebView tL_inlineBotWebView = this.Q;
                if (tL_inlineBotWebView == null) {
                    TLRPC.TL_inlineBotSwitchPM tL_inlineBotSwitchPM = this.P;
                    if (tL_inlineBotSwitchPM != null) {
                        if (i10 == 0) {
                            return tL_inlineBotSwitchPM;
                        }
                    }
                    if (i10 >= 0 && i10 < arrayList2.size()) {
                        return this.N.get(i10);
                    }
                } else if (i10 == 0) {
                    return tL_inlineBotWebView;
                }
                i10--;
                if (i10 >= 0) {
                    return this.N.get(i10);
                }
            } else {
                ArrayList arrayList3 = this.x;
                if (arrayList3 == null) {
                    ArrayList arrayList4 = this.E;
                    if (arrayList4 == null) {
                        ArrayList arrayList5 = this.J;
                        if (arrayList5 == null) {
                            ArrayList arrayList6 = this.I;
                            if (arrayList6 != null || this.F != null) {
                                if (arrayList6 != null) {
                                    if (i10 >= 0 && i10 < arrayList6.size()) {
                                        return this.I.get(i10);
                                    }
                                    ArrayList arrayList7 = this.I;
                                    if (arrayList7 != null) {
                                        i10 -= arrayList7.size();
                                    }
                                }
                                ArrayList arrayList8 = this.F;
                                if (arrayList8 != null && i10 >= 0 && i10 < arrayList8.size()) {
                                    ArrayList arrayList9 = this.L;
                                    if (arrayList9 == null || (this.c0 == 1 && !(this.v instanceof TLRPC.TL_channelFull))) {
                                        str = (String) this.F.get(i10);
                                    } else if (arrayList9.get(i10) != null) {
                                        user = (TLRPC.User) this.L.get(i10);
                                        str = String.format("%s@%s", this.F.get(i10), user != null ? UserObject.getPublicUsername(user) : "");
                                    } else {
                                        str = String.format("%s", this.F.get(i10));
                                    }
                                    ArrayList arrayList10 = this.M;
                                    if (arrayList10 == null || !((Boolean) arrayList10.get(i10)).booleanValue()) {
                                        return str;
                                    }
                                    return new r0(str, user != null ? user.id : 0L);
                                }
                            }
                        } else if (i10 >= 0 && i10 < arrayList5.size()) {
                            return this.J.get(i10);
                        }
                    } else if (i10 >= 0 && i10 < arrayList4.size()) {
                        return this.E.get(i10);
                    }
                } else if (i10 >= 0 && i10 < arrayList3.size()) {
                    return this.x.get(i10);
                }
            }
        } else if (i10 >= 0 && i10 < arrayList.size()) {
            return ((t0) this.w0.get(i10)).a;
        }
        return null;
    }

    public final int K() {
        int size;
        int i10 = 1;
        if (this.s0 != null && !this.d0) {
            return 1;
        }
        int i11 = this.B != null ? 2 : 0;
        ArrayList arrayList = this.w0;
        if (arrayList != null) {
            size = arrayList.size();
        } else {
            ArrayList arrayList2 = this.N;
            if (arrayList2 != null) {
                int size2 = arrayList2.size();
                if (this.P == null && this.Q == null) {
                    i10 = 0;
                }
                return size2 + i10 + i11;
            }
            ArrayList arrayList3 = this.x;
            if (arrayList3 != null) {
                size = arrayList3.size();
            } else {
                ArrayList arrayList4 = this.E;
                if (arrayList4 != null) {
                    size = arrayList4.size();
                } else if (this.F == null && this.I == null) {
                    ArrayList arrayList5 = this.J;
                    if (arrayList5 == null) {
                        return i11;
                    }
                    size = arrayList5.size();
                } else {
                    ArrayList arrayList6 = this.I;
                    int size3 = arrayList6 == null ? 0 : arrayList6.size();
                    ArrayList arrayList7 = this.F;
                    size = size3 + (arrayList7 != null ? arrayList7.size() : 0);
                }
            }
        }
        return size + i11;
    }

    public final Object L(int i10) {
        if (this.B != null) {
            if (i10 < 2) {
                return null;
            }
            i10 -= 2;
        }
        ArrayList arrayList = this.w0;
        if (arrayList == null || i10 < 0 || i10 >= arrayList.size()) {
            return null;
        }
        return ((t0) this.w0.get(i10)).b;
    }

    public final int M(int i10) {
        if (this.B != null) {
            if (i10 < 2) {
                return 0;
            }
            i10 -= 2;
        }
        return this.N != null ? (this.P == null && this.Q == null) ? i10 : i10 - 1 : i10;
    }

    public final boolean N() {
        return this.w0 != null;
    }

    public final void P() {
        l0 l0Var = this.E0;
        if (l0Var != null) {
            l0Var.stop();
        }
        m0 m0Var = this.u0;
        if (m0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(m0Var);
            this.u0 = null;
        }
        if (this.p0 != 0) {
            ConnectionsManager.getInstance(this.f).cancelRequest(this.p0, true);
            this.p0 = 0;
        }
        if (this.q0 != 0) {
            ConnectionsManager.getInstance(this.f).cancelRequest(this.q0, true);
            this.q0 = 0;
        }
        this.s0 = null;
        this.P = null;
        this.d0 = true;
        this.m0 = null;
        this.n0 = null;
        this.r0 = false;
        NotificationCenter.getInstance(this.f).removeObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(this.f).removeObserver(this, NotificationCenter.fileLoadFailed);
        NotificationCenter.getInstance(this.f).removeObserver(this, NotificationCenter.recentDocumentsDidLoad);
        NotificationCenter.getInstance(this.f).removeObserver(this, NotificationCenter.stickersDidLoad);
    }

    public final void Q() {
        TLRPC.User user = this.s0;
        if (user == null || !user.bot_inline_geo) {
            return;
        }
        Location location = new Location("network");
        this.v0 = location;
        location.setLatitude(-1000.0d);
        this.v0.setLongitude(-1000.0d);
        T(true, this.s0, this.n0, "");
    }

    public final void R(TLRPC.User user) {
        rn rnVar;
        TLRPC.Chat chat;
        this.p0 = 0;
        this.E0.stop();
        v90 v90Var = this.R;
        if (user == null || !user.bot || user.bot_inline_placeholder == null) {
            this.s0 = null;
            this.P = null;
            this.d0 = true;
        } else {
            this.s0 = user;
            long j10 = user.id;
            if (j10 != this.O) {
                this.P = null;
                this.O = j10;
            }
            rn rnVar2 = this.C0;
            if (rnVar2 != null && (chat = rnVar2.e) != null) {
                boolean canSendStickers = ChatObject.canSendStickers(chat);
                this.d0 = canSendStickers;
                if (!canSendStickers) {
                    l();
                    v90Var.a(true);
                    return;
                }
            }
            if (this.s0.bot_inline_geo) {
                if (MessagesController.getNotificationsSettings(this.f).getBoolean("inlinegeo_" + this.s0.id, false) || (rnVar = this.C0) == null || rnVar.getParentActivity() == null) {
                    G();
                } else {
                    TLRPC.User user2 = this.s0;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.C0.getParentActivity());
                    alertDialog$Builder.a.N = LocaleController.getString(R.string.ShareYouLocationTitle);
                    alertDialog$Builder.a.P = LocaleController.getString(R.string.ShareYouLocationInline);
                    boolean[] zArr = new boolean[1];
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new iq0(this, zArr, user2, 4));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new di1(4, this, zArr));
                    this.C0.showDialog(alertDialog$Builder.a, new cg.g(17, this, zArr));
                }
            }
        }
        if (this.s0 == null) {
            this.r0 = true;
            this.P = null;
        } else {
            if (v90Var != null) {
                v90Var.b(true);
            }
            T(true, this.s0, this.n0, "");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0087, code lost:
    
        if (r8.length() != 0) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S(String str, String str2) {
        String str3;
        String str4;
        String str5;
        TLRPC.User user = this.s0;
        if (user == null || (str4 = user.username) == null || !str4.equals(str) || (str5 = this.n0) == null || !str5.equals(str2)) {
            TLRPC.User user2 = this.s0;
            v90 v90Var = this.R;
            if (user2 != null) {
                if (!this.d0 && str != null && str2 != null) {
                    return;
                } else {
                    v90Var.a(false);
                }
            }
            m0 m0Var = this.u0;
            if (m0Var != null) {
                AndroidUtilities.cancelRunOnUIThread(m0Var);
                this.u0 = null;
            }
            if (TextUtils.isEmpty(str) || ((str3 = this.m0) != null && !str3.equals(str))) {
                if (this.p0 != 0) {
                    ConnectionsManager.getInstance(this.f).cancelRequest(this.p0, true);
                    this.p0 = 0;
                }
                if (this.q0 != 0) {
                    ConnectionsManager.getInstance(this.f).cancelRequest(this.q0, true);
                    this.q0 = 0;
                }
                this.s0 = null;
                this.P = null;
                this.d0 = true;
                this.m0 = null;
                this.n0 = null;
                this.E0.stop();
                this.r0 = false;
                if (v90Var != null) {
                    v90Var.b(false);
                }
                if (str != null) {
                }
            }
            if (str2 != null) {
                if (v90Var != null) {
                    if (this.s0 != null) {
                        v90Var.b(true);
                    } else if (str.equals("gif")) {
                        this.m0 = "gif";
                        v90Var.b(false);
                    }
                }
                MessagesController messagesController = MessagesController.getInstance(this.f);
                MessagesStorage messagesStorage = MessagesStorage.getInstance(this.f);
                this.n0 = str2;
                m0 m0Var2 = new m0(this, str2, str, messagesController, messagesStorage);
                this.u0 = m0Var2;
                AndroidUtilities.runOnUIThread(m0Var2, 400L);
                return;
            }
            if (this.q0 != 0) {
                ConnectionsManager.getInstance(this.f).cancelRequest(this.q0, true);
                this.q0 = 0;
            }
            this.n0 = null;
            if (v90Var != null) {
                v90Var.b(false);
            }
        }
    }

    public final void T(boolean z10, TLRPC.User user, String str, String str2) {
        Location location;
        if (this.q0 != 0) {
            ConnectionsManager.getInstance(this.f).cancelRequest(this.q0, true);
            this.q0 = 0;
        }
        if (!this.d0 || !this.d) {
            v90 v90Var = this.R;
            if (v90Var != null) {
                v90Var.b(false);
                return;
            }
            return;
        }
        if (str == null || user == null) {
            this.n0 = null;
            return;
        }
        if (user.bot_inline_geo && this.v0 == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.n);
        sb2.append("_");
        sb2.append(str);
        sb2.append("_");
        sb2.append(str2);
        sb2.append("_");
        sb2.append(this.n);
        sb2.append("_");
        sb2.append(user.id);
        sb2.append("_");
        sb2.append((!user.bot_inline_geo || this.v0.getLatitude() == -1000.0d) ? "" : Double.valueOf(this.v0.getLongitude() + this.v0.getLatitude()));
        String sb3 = sb2.toString();
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.f);
        ik ikVar = new ik(this, str, z10, user, str2, messagesStorage, sb3);
        long j10 = user.id;
        if (j10 != this.O) {
            this.P = null;
            this.O = j10;
        }
        if (z10) {
            messagesStorage.getBotCache(sb3, ikVar);
            return;
        }
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.bot = MessagesController.getInstance(this.f).getInputUser(user);
        tL_messages_getInlineBotResults.query = str;
        tL_messages_getInlineBotResults.offset = str2;
        if (user.bot_inline_geo && (location = this.v0) != null && location.getLatitude() != -1000.0d) {
            tL_messages_getInlineBotResults.flags |= 1;
            TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
            tL_messages_getInlineBotResults.geo_point = tL_inputGeoPoint;
            tL_inputGeoPoint.lat = AndroidUtilities.fixLocationCoord(this.v0.getLatitude());
            tL_messages_getInlineBotResults.geo_point._long = AndroidUtilities.fixLocationCoord(this.v0.getLongitude());
        }
        if (DialogObject.isEncryptedDialog(this.n)) {
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        } else {
            tL_messages_getInlineBotResults.peer = MessagesController.getInstance(this.f).getInputPeer(this.n);
        }
        this.q0 = ConnectionsManager.getInstance(this.f).sendRequest(tL_messages_getInlineBotResults, ikVar, 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:224:0x072d, code lost:
    
        if (r17.toLowerCase().startsWith(r3) == false) goto L408;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0740, code lost:
    
        if (r14.toLowerCase().startsWith(r3) != false) goto L419;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0750, code lost:
    
        if (r15.toLowerCase().startsWith(r3) != false) goto L419;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x06e1, code lost:
    
        if (r13.user_id == r11.id) goto L387;
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x03fc, code lost:
    
        if (r10 != ':') goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x0418, code lost:
    
        if (r29.v != null) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x041a, code lost:
    
        if (r13 == 0) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x041c, code lost:
    
        r29.V = r7;
        r29.Y = r0;
        r29.Z = r4;
        r2.a(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x0426, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0723  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0748  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0754  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0768 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0730  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0506  */
    /* JADX WARN: Type inference failed for: r11v24, types: [org.telegram.tgnet.TLRPC$User] */
    /* JADX WARN: Type inference failed for: r11v28, types: [org.telegram.tgnet.TLRPC$User] */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v9, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r29v0, types: [f2.q0, java.lang.Object, pf.u0] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [org.telegram.ui.Components.v90] */
    /* JADX WARN: Type inference failed for: r2v72 */
    /* JADX WARN: Type inference failed for: r3v52, types: [pf.s0] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21, types: [a0.h, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r9v44, types: [java.lang.Object, org.telegram.tgnet.TLRPC$User] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U(CharSequence charSequence, int i10, ArrayList arrayList, boolean z10, boolean z11) {
        String str;
        String str2;
        int i11;
        ArrayList arrayList2;
        ?? r22;
        String str3;
        rn rnVar;
        char c10;
        int i12;
        String str4;
        String str5;
        ?? r15;
        char c11;
        int i13;
        ?? r32;
        s0 s0Var;
        ?? r62;
        ArrayList arrayList3;
        String str6;
        String str7;
        long j10;
        TLRPC.Chat chat;
        TLRPC.ChatFull chatFull;
        int i14;
        long j11;
        String str8;
        String publicUsername;
        String str9;
        TLRPC.Chat chat2;
        long j12;
        boolean z12;
        TLRPC.Chat chat3;
        boolean z13;
        v90 v90Var;
        v90 v90Var2;
        String str10;
        char c12;
        String str11 = "";
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        TLRPC.Chat chat4 = this.h0;
        rn rnVar2 = this.C0;
        if (rnVar2 != null) {
            chat4 = rnVar2.e;
            rnVar2.i();
        }
        TLRPC.Chat chat5 = chat4;
        gs0 gs0Var = this.l0;
        if (gs0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(gs0Var);
            this.l0 = null;
        }
        if (this.f0 != 0) {
            ConnectionsManager.getInstance(this.f).cancelRequest(this.f0, true);
            this.f0 = 0;
        }
        p0 p0Var = this.A;
        if (p0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(p0Var);
            this.A = null;
        }
        c9 c9Var = this.B0;
        if (c9Var != null) {
            AndroidUtilities.cancelRunOnUIThread(c9Var);
            this.B0 = null;
        }
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        v90 v90Var3 = this.R;
        if (isEmpty || charSequence2.length() > MessagesController.getInstance(this.f).getMaxMessageLength()) {
            S(null, null);
            v90Var3.a(false);
            this.V = null;
            this.z0 = null;
            this.w0 = null;
            this.x0 = null;
            l();
            this.k0 = false;
            if (this.A0 != 0) {
                ConnectionsManager.getInstance(this.f).cancelRequest(this.A0, true);
                this.A0 = 0;
            }
            ow owVar = this.j0;
            if (owVar != null) {
                owVar.a();
                return;
            }
            return;
        }
        int i15 = charSequence2.length() > 0 ? i10 - 1 : i10;
        this.V = null;
        this.X = z10;
        this.W = z11;
        StringBuilder sb2 = new StringBuilder();
        boolean z14 = !z10 && charSequence2.length() > 0 && charSequence2.length() <= 14;
        if (z14) {
            int length = charSequence2.length();
            CharSequence charSequence3 = charSequence2;
            int i16 = 0;
            while (i16 < length) {
                char charAt = charSequence3.charAt(i16);
                int i17 = length - 1;
                if (i16 < i17) {
                    str10 = str11;
                    c12 = charSequence3.charAt(i16 + 1);
                } else {
                    str10 = str11;
                    c12 = 0;
                }
                if (i16 < i17 && charAt == 55356 && c12 >= 57339 && c12 <= 57343) {
                    charSequence3 = TextUtils.concat(charSequence3.subSequence(0, i16), charSequence3.subSequence(i16 + 2, charSequence3.length()));
                    length -= 2;
                } else if (charAt == 65039) {
                    charSequence3 = TextUtils.concat(charSequence3.subSequence(0, i16), charSequence3.subSequence(i16 + 1, charSequence3.length()));
                    length--;
                } else {
                    i16++;
                    str11 = str10;
                }
                i16--;
                i16++;
                str11 = str10;
            }
            str = str11;
            this.z0 = charSequence3.toString().trim();
            str2 = charSequence2;
        } else {
            str = "";
            str2 = str;
        }
        boolean z15 = z14 && (Emoji.isValidEmoji(str2) || Emoji.isValidEmoji(this.z0));
        if (z15 && (charSequence instanceof Spanned)) {
            t5[] t5VarArr = (t5[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), t5.class);
            z15 = t5VarArr == null || t5VarArr.length == 0;
        }
        if (this.c && z15 && (chat5 == null || ChatObject.canSendStickers(chat5))) {
            ArrayList arrayList4 = this.y0;
            arrayList4.clear();
            int i18 = SharedConfig.suggestStickers;
            if (i18 == 2 || !z15) {
                if (this.k0 && i18 == 2) {
                    this.k0 = false;
                    v90Var3.a(false);
                    l();
                    return;
                }
                return;
            }
            this.w0 = null;
            this.x0 = null;
            if (this.A0 != 0) {
                ConnectionsManager.getInstance(this.f).cancelRequest(this.A0, true);
                this.A0 = 0;
            }
            boolean z16 = MessagesController.getInstance(this.f).suggestStickersApiOnly;
            if (z16) {
                arrayList2 = arrayList;
                z13 = z16;
                i11 = i10;
            } else {
                arrayList2 = arrayList;
                z13 = z16;
                i11 = i10;
                this.B0 = new c9((u0) this, charSequence, i10, arrayList2, z10, z11);
                MediaDataController.getInstance(this.f).loadRecents(0, false, true, false);
                MediaDataController.getInstance(this.f).loadRecents(2, false, true, false);
                ArrayList<TLRPC.Document> recentStickersNoCopy = MediaDataController.getInstance(this.f).getRecentStickersNoCopy(0);
                ArrayList<TLRPC.Document> recentStickersNoCopy2 = MediaDataController.getInstance(this.f).getRecentStickersNoCopy(2);
                int min = Math.min(20, recentStickersNoCopy.size());
                int i19 = 0;
                for (int i20 = 0; i20 < min; i20++) {
                    TLRPC.Document document = recentStickersNoCopy.get(i20);
                    if (O(document, this.z0)) {
                        E(document, "recent");
                        int i21 = i19 + 1;
                        if (i21 >= 5) {
                            break;
                        } else {
                            i19 = i21;
                        }
                    }
                }
                int size = recentStickersNoCopy2.size();
                for (int i22 = 0; i22 < size; i22++) {
                    TLRPC.Document document2 = recentStickersNoCopy2.get(i22);
                    if (O(document2, this.z0)) {
                        E(document2, "fav");
                    }
                }
                MediaDataController.getInstance(this.f).checkStickers(0);
                HashMap<String, ArrayList<TLRPC.Document>> allStickers = MediaDataController.getInstance(this.f).getAllStickers();
                ArrayList<TLRPC.Document> arrayList5 = allStickers != null ? allStickers.get(this.z0) : null;
                if (arrayList5 != null && !arrayList5.isEmpty()) {
                    F(null, arrayList5);
                }
                ArrayList arrayList6 = this.w0;
                if (arrayList6 != null) {
                    Collections.sort(arrayList6, new n0(recentStickersNoCopy2, recentStickersNoCopy));
                }
            }
            if (SharedConfig.suggestStickers == 0 || z13) {
                String str12 = this.z0;
                TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                tL_messages_getStickers.emoticon = str2;
                tL_messages_getStickers.hash = 0L;
                this.A0 = ConnectionsManager.getInstance(this.f).sendRequest(tL_messages_getStickers, new rc1(6, this, str12));
            }
            ArrayList arrayList7 = this.w0;
            if (arrayList7 == null || arrayList7.isEmpty()) {
                v90 v90Var4 = v90Var3;
                v90Var = v90Var4;
                if (this.k0) {
                    v90Var4.a(false);
                    this.k0 = false;
                    v90Var = v90Var4;
                }
            } else {
                if (SharedConfig.suggestStickers != 0 || this.w0.size() >= 5) {
                    v90 v90Var5 = v90Var3;
                    H();
                    v90Var5.a(arrayList4.isEmpty());
                    this.k0 = true;
                    v90Var2 = v90Var5;
                } else {
                    v90 v90Var6 = v90Var3;
                    v90Var6.a(false);
                    this.k0 = false;
                    v90Var2 = v90Var6;
                }
                l();
                v90Var = v90Var2;
            }
            c10 = 4;
            str3 = null;
            r22 = v90Var;
        } else {
            i11 = i10;
            arrayList2 = arrayList;
            r22 = v90Var3;
            if (!z10 && this.b0 && charSequence2.charAt(0) == '@') {
                int indexOf = charSequence2.indexOf(32);
                int length2 = charSequence2.length();
                if (indexOf > 0) {
                    String substring = charSequence2.substring(1, indexOf);
                    str5 = charSequence2.substring(indexOf + 1);
                    str4 = substring;
                    i12 = 1;
                } else if (charSequence2.charAt(length2 - 1) == 't' && charSequence2.charAt(length2 - 2) == 'o' && charSequence2.charAt(length2 - 3) == 'b') {
                    i12 = 1;
                    str4 = charSequence2.substring(1);
                    str5 = str;
                } else {
                    i12 = 1;
                    S(null, null);
                    str4 = null;
                    str5 = null;
                }
                if (str4 != null && str4.length() >= i12) {
                    int i23 = 1;
                    while (true) {
                        if (i23 >= str4.length()) {
                            str = str4;
                            break;
                        }
                        char charAt2 = str4.charAt(i23);
                        if ((charAt2 < '0' || charAt2 > '9') && ((charAt2 < 'a' || charAt2 > 'z') && ((charAt2 < 'A' || charAt2 > 'Z') && charAt2 != '_'))) {
                            break;
                        } else {
                            i23++;
                        }
                    }
                }
                S(str, str5);
                str3 = null;
            } else if (!this.c || (rnVar = this.C0) == null || rnVar.h != null || (!(chat5 == null || ChatObject.canSendStickers(chat5)) || charSequence2.trim().length() < 2 || charSequence2.trim().indexOf(32) >= 0)) {
                str3 = null;
                S(null, null);
            } else {
                str3 = null;
                S(null, null);
            }
            c10 = 65535;
        }
        if (this.s0 != null) {
            return;
        }
        MessagesController messagesController = MessagesController.getInstance(this.f);
        String str13 = this.B;
        this.B = str3;
        j1 j1Var = this.w;
        if (!z10) {
            while (i15 >= 0) {
                if (i15 < charSequence2.length()) {
                    char charAt3 = charSequence2.charAt(i15);
                    if (i15 != 0) {
                        int i24 = i15 - 1;
                        if (charSequence2.charAt(i24) != ' ') {
                            if (charSequence2.charAt(i24) != '\n') {
                            }
                        }
                    }
                    if (charAt3 == '@') {
                        boolean z17 = this.i0;
                        if (z17 || this.a0 || (this.b0 && i15 == 0)) {
                            this.T = i15;
                            this.U = sb2.length() + 1;
                            c11 = 0;
                            r15 = 0;
                            break;
                        }
                    } else if (charAt3 == '#') {
                        if (ChatObject.isChannelAndNotMegaGroup(chat5) && !TextUtils.isEmpty(ChatObject.getPublicUsername(chat5))) {
                            String substring2 = charSequence2.substring(i15);
                            this.B = substring2;
                            if (substring2.length() < 4 || !this.B.matches("^[#$][\\p{L}_-]+$")) {
                                this.B = null;
                            }
                        }
                        if (!j1Var.s) {
                            MessagesStorage.getInstance(j1Var.m).getStorageQueue().postRunnable(new g1(j1Var, 1));
                            this.V = charSequence2;
                            this.Y = i11;
                            this.Z = arrayList2;
                            return;
                        }
                        this.T = i15;
                        this.U = sb2.length() + 1;
                        sb2.insert(0, charAt3);
                        c11 = 1;
                    } else if (i15 == 0 && this.S != null && charAt3 == '/') {
                        this.T = i15;
                        this.U = sb2.length() + 1;
                        c11 = 2;
                    } else if (charAt3 == ':' && sb2.length() > 0) {
                        if (" !\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~\n".indexOf(sb2.charAt(0)) >= 0) {
                            i13 = 1;
                            if (sb2.length() > 1) {
                            }
                        } else {
                            i13 = 1;
                        }
                        this.T = i15;
                        this.U = sb2.length() + i13;
                        c11 = 3;
                    }
                    sb2.insert(0, charAt3);
                }
                i15--;
            }
            r15 = 0;
            c11 = c10;
            i15 = -1;
            if (str13 != null && this.B != null) {
                s(r15, 2);
            } else if (str13 == null && this.B == null) {
                t(r15, 2);
            } else {
                r32 = this.C;
                if (r32 != 0) {
                    r32.a(r15, this.B, chat5);
                }
                s0Var = this.D;
                if (s0Var != null) {
                    s0Var.a(1, this.B, chat5);
                }
            }
            if (c11 != 65535) {
                this.t0 = r15;
                this.N = null;
                r22.a(r15);
                return;
            }
            if (c11 != 0) {
                if (c11 == 1) {
                    ArrayList arrayList8 = new ArrayList();
                    String lowerCase = sb2.toString().toLowerCase();
                    ArrayList arrayList9 = j1Var.q;
                    for (int i25 = 0; i25 < arrayList9.size(); i25++) {
                        h1 h1Var = (h1) arrayList9.get(i25);
                        if (h1Var != null && (str7 = h1Var.a) != null && str7.startsWith(lowerCase)) {
                            arrayList8.add(h1Var.a);
                        }
                    }
                    this.E = arrayList8;
                    this.w0 = null;
                    this.x = null;
                    this.y = null;
                    this.I = null;
                    this.F = null;
                    this.M = null;
                    this.G = null;
                    this.L = null;
                    this.J = null;
                    this.t0 = false;
                    this.N = null;
                    l();
                    r22.a((this.E.isEmpty() && this.B == null) ? false : true);
                    return;
                }
                if (c11 != 2) {
                    if (c11 == 3) {
                        String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                        if (!Arrays.equals(currentKeyboardLanguage, this.K)) {
                            MediaDataController.getInstance(this.f).fetchNewEmojiKeywords(currentKeyboardLanguage);
                        }
                        this.K = currentKeyboardLanguage;
                        MediaDataController.getInstance(this.f).getEmojiSuggestions(this.K, sb2.toString(), false, new j0(this), SharedConfig.suggestAnimatedEmoji && UserConfig.getInstance(this.f).isPremium());
                        return;
                    }
                    if (c11 == 4) {
                        this.E = null;
                        this.x = null;
                        this.y = null;
                        this.J = null;
                        this.F = null;
                        this.M = null;
                        this.I = null;
                        this.G = null;
                        this.L = null;
                        return;
                    }
                    return;
                }
                ArrayList arrayList10 = new ArrayList();
                ArrayList arrayList11 = new ArrayList();
                ArrayList arrayList12 = new ArrayList();
                ArrayList arrayList13 = new ArrayList();
                String lowerCase2 = sb2.toString().toLowerCase();
                for (int i26 = 0; i26 < this.S.m(); i26++) {
                    TL_bots.BotInfo botInfo = (TL_bots.BotInfo) this.S.n(i26);
                    for (int i27 = 0; i27 < botInfo.commands.size(); i27++) {
                        TLRPC.BotCommand botCommand = botInfo.commands.get(i27);
                        if (botCommand != null && (str6 = botCommand.command) != null && str6.startsWith(lowerCase2)) {
                            arrayList10.add("/" + botCommand.command);
                            arrayList11.add(botCommand.description);
                            arrayList12.add(messagesController.getUser(Long.valueOf(botInfo.user_id)));
                            arrayList13.add(Boolean.valueOf(botCommand.ephemeral));
                        }
                    }
                }
                if (this.C0 != null && !DialogObject.isEncryptedDialog(this.n)) {
                    rn rnVar3 = this.C0;
                    if (rnVar3.N3 == 0 && rnVar3.i() != null && !this.C0.i().bot && !UserObject.isReplyUser(this.C0.i()) && !UserObject.isService(this.C0.i().id)) {
                        q1 f10 = q1.f(this.f);
                        ArrayList arrayList14 = f10.b;
                        f10.h();
                        this.H = lowerCase2;
                        this.I = new ArrayList();
                        for (int i28 = 0; i28 < arrayList14.size(); i28++) {
                            p1 p1Var = (p1) arrayList14.get(i28);
                            if (!q1.g(p1Var.b)) {
                                String lowerCase3 = p1Var.b.toLowerCase();
                                if (lowerCase3.startsWith(lowerCase2) || AndroidUtilities.translitSafe(lowerCase3).startsWith(lowerCase2)) {
                                    this.I.add(p1Var);
                                }
                            }
                        }
                        r62 = 0;
                        this.E = r62;
                        this.w0 = r62;
                        this.x = r62;
                        this.y = r62;
                        this.J = r62;
                        this.F = arrayList10;
                        this.G = arrayList11;
                        this.L = arrayList12;
                        this.M = arrayList13;
                        this.t0 = false;
                        this.N = r62;
                        l();
                        r22.a(arrayList10.isEmpty() || !((arrayList3 = this.I) == null || arrayList3.isEmpty()));
                        return;
                    }
                }
                r62 = 0;
                this.H = null;
                this.I = null;
                this.E = r62;
                this.w0 = r62;
                this.x = r62;
                this.y = r62;
                this.J = r62;
                this.F = arrayList10;
                this.G = arrayList11;
                this.L = arrayList12;
                this.M = arrayList13;
                this.t0 = false;
                this.N = r62;
                l();
                r22.a(arrayList10.isEmpty() || !((arrayList3 = this.I) == null || arrayList3.isEmpty()));
                return;
            }
            this.t0 = r15;
            this.N = null;
            ArrayList arrayList15 = new ArrayList();
            if (arrayList2 != null) {
                for (int i29 = 0; i29 < Math.min(100, arrayList2.size()); i29++) {
                    long fromChatId = ((MessageObject) arrayList2.get(i29)).getFromChatId();
                    if (fromChatId > 0 && !arrayList15.contains(Long.valueOf(fromChatId))) {
                        arrayList15.add(Long.valueOf(fromChatId));
                    }
                }
            }
            String lowerCase4 = sb2.toString().toLowerCase();
            boolean z18 = lowerCase4.indexOf(32) >= 0;
            ArrayList arrayList16 = new ArrayList();
            a0.h hVar = new a0.h();
            a0.h hVar2 = new a0.h();
            ArrayList arrayList17 = new ArrayList();
            arrayList17.addAll(MediaDataController.getInstance(this.f).inlineBots);
            if (chat5 == null || (!ChatObject.isMonoForum(chat5) && !ChatObject.isChannelAndNotMegaGroup(chat5))) {
                arrayList17.addAll(MediaDataController.getInstance(this.f).guestBots);
            }
            List.-EL.sort(arrayList17, new lp0(20));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size2 = arrayList17.size();
            int i30 = 0;
            while (i30 < size2) {
                Object obj = arrayList17.get(i30);
                i30++;
                TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) obj;
                Map.-EL.putIfAbsent(linkedHashMap, Long.valueOf(DialogObject.getPeerDialogId(tL_topPeer.peer)), tL_topPeer);
            }
            ArrayList arrayList18 = new ArrayList(linkedHashMap.values());
            if (!z10 && this.b0 && i15 == 0 && !arrayList18.isEmpty()) {
                int i31 = 0;
                for (int i32 = 0; i32 < arrayList18.size(); i32++) {
                    TLRPC.User user = messagesController.getUser(Long.valueOf(((TLRPC.TL_topPeer) arrayList18.get(i32)).peer.user_id));
                    if (user != null) {
                        String publicUsername2 = UserObject.getPublicUsername(user);
                        if (!TextUtils.isEmpty(publicUsername2) && (lowerCase4.length() == 0 || publicUsername2.toLowerCase().startsWith(lowerCase4))) {
                            arrayList16.add(user);
                            hVar.k(user, user.id);
                            hVar2.k(user, user.id);
                            i31++;
                        }
                        if (i31 == 5) {
                            break;
                        }
                    }
                }
            }
            rn rnVar4 = this.C0;
            if (rnVar4 != null) {
                chat5 = rnVar4.e;
                j10 = rnVar4.Z3;
            } else {
                TLRPC.ChatFull chatFull2 = this.v;
                if (chatFull2 != null) {
                    chat5 = messagesController.getChat(Long.valueOf(chatFull2.id));
                }
                j10 = 0;
            }
            ?? currentUser = UserConfig.getInstance(this.f).getCurrentUser();
            if (chat5 != null && (chatFull = this.v) != null && chatFull.participants != null && (!ChatObject.isChannel(chat5) || chat5.megagroup)) {
                int i33 = -2;
                int i34 = -2;
                while (i34 < this.v.participants.participants.size()) {
                    if (i34 != i33) {
                        i14 = i34;
                        if (i14 == -1) {
                            if (z11) {
                                if (lowerCase4.length() == 0) {
                                    arrayList16.add(chat5);
                                } else {
                                    String str14 = chat5.title;
                                    publicUsername = ChatObject.getPublicUsername(chat5);
                                    j11 = j10;
                                    chat3 = chat5;
                                    chat2 = currentUser;
                                    j12 = -chat5.id;
                                    str8 = str14;
                                    str9 = null;
                                    if (TextUtils.isEmpty(publicUsername)) {
                                    }
                                    if (!TextUtils.isEmpty(str8)) {
                                    }
                                    if (!TextUtils.isEmpty(str9)) {
                                    }
                                    if (!z12) {
                                    }
                                }
                            }
                            z12 = z18;
                            j11 = j10;
                            chat2 = currentUser;
                        } else {
                            TLRPC.ChatParticipant chatParticipant = this.v.participants.participants.get(i14);
                            if (currentUser != null) {
                                j11 = j10;
                            } else {
                                j11 = j10;
                            }
                            ?? user2 = messagesController.getUser(Long.valueOf(chatParticipant.user_id));
                            if (user2 != 0 && !UserObject.isUserSelf(user2) && hVar.h(user2.id) < 0) {
                                if (lowerCase4.length() != 0 || user2.deleted) {
                                    str8 = user2.first_name;
                                    String str15 = user2.last_name;
                                    publicUsername = UserObject.getPublicUsername(user2);
                                    str9 = str15;
                                    chat2 = currentUser;
                                    j12 = user2.id;
                                    chat3 = user2;
                                    if (TextUtils.isEmpty(publicUsername)) {
                                    }
                                    if (!TextUtils.isEmpty(str8)) {
                                    }
                                    if (!TextUtils.isEmpty(str9)) {
                                    }
                                    if (!z12) {
                                    }
                                } else {
                                    arrayList16.add(user2);
                                }
                            }
                            z12 = z18;
                            chat2 = currentUser;
                        }
                    } else if (currentUser == null || !z10) {
                        z12 = z18;
                        j11 = j10;
                        i14 = i34;
                        chat2 = currentUser;
                    } else {
                        str8 = currentUser.first_name;
                        str9 = currentUser.last_name;
                        publicUsername = UserObject.getPublicUsername(currentUser);
                        j11 = j10;
                        TLRPC.Chat chat6 = currentUser;
                        j12 = currentUser.id;
                        i14 = i34;
                        chat2 = chat6;
                        chat3 = chat6;
                        if (TextUtils.isEmpty(publicUsername)) {
                            z12 = z18;
                        } else {
                            z12 = z18;
                        }
                        if (!TextUtils.isEmpty(str8)) {
                        }
                        if (!TextUtils.isEmpty(str9)) {
                        }
                        if (!z12) {
                            if (ContactsController.formatName(str8, str9).toLowerCase().startsWith(lowerCase4)) {
                            }
                            arrayList16.add(chat3);
                            hVar2.k(chat3, j12);
                        }
                    }
                    int i35 = i14 + 1;
                    j10 = j11;
                    currentUser = chat2;
                    i33 = -2;
                    i34 = i35;
                    z18 = z12;
                }
            }
            boolean z19 = z18;
            long j13 = j10;
            if (this.i0) {
                ArrayList<TLRPC.Dialog> allDialogs = MessagesController.getInstance(this.f).getAllDialogs();
                for (int i36 = 0; i36 < allDialogs.size(); i36++) {
                    if (allDialogs.get(i36).id > 0) {
                        TLRPC.User user3 = messagesController.getUser(Long.valueOf(allDialogs.get(i36).id));
                        if (user3 != null && !UserObject.isUserSelf(user3) && hVar.h(user3.id) < 0) {
                            if (lowerCase4.length() != 0 || user3.deleted) {
                                String str16 = user3.first_name;
                                String str17 = user3.last_name;
                                String publicUsername3 = UserObject.getPublicUsername(user3);
                                long j14 = user3.id;
                                if ((!TextUtils.isEmpty(publicUsername3) && publicUsername3.toLowerCase().startsWith(lowerCase4)) || ((!TextUtils.isEmpty(str16) && str16.toLowerCase().startsWith(lowerCase4)) || ((!TextUtils.isEmpty(str17) && str17.toLowerCase().startsWith(lowerCase4)) || (z19 && ContactsController.formatName(str16, str17).toLowerCase().startsWith(lowerCase4))))) {
                                    arrayList16.add(user3);
                                    hVar2.k(user3, j14);
                                }
                            } else {
                                arrayList16.add(user3);
                            }
                        }
                    } else if (!TextUtils.isEmpty(lowerCase4) && (chat = messagesController.getChat(Long.valueOf(-allDialogs.get(i36).id))) != null && chat.username != null && hVar.h(chat.id) < 0) {
                        if (lowerCase4.length() == 0) {
                            arrayList16.add(chat);
                        } else {
                            String str18 = chat.title;
                            String str19 = chat.username;
                            long j15 = chat.id;
                            if ((!TextUtils.isEmpty(str19) && str19.toLowerCase().startsWith(lowerCase4)) || (!TextUtils.isEmpty(str18) && str18.toLowerCase().startsWith(lowerCase4))) {
                                arrayList16.add(chat);
                                hVar2.k(chat, j15);
                            }
                        }
                    }
                }
            }
            Collections.sort(arrayList16, new o0(hVar2, arrayList15));
            this.E = null;
            this.w0 = null;
            this.I = null;
            this.F = null;
            this.M = null;
            this.G = null;
            this.L = null;
            this.J = null;
            if (((chat5 == null || !chat5.megagroup) && !this.i0) || lowerCase4.length() <= 0) {
                Y(hVar2, arrayList16, true);
                return;
            }
            if (arrayList16.size() < 5) {
                gs0 gs0Var2 = new gs0(this, arrayList16, hVar2, 27);
                this.l0 = gs0Var2;
                AndroidUtilities.runOnUIThread(gs0Var2, 1000L);
            } else {
                Y(hVar2, arrayList16, true);
            }
            p0 p0Var2 = new p0(this, chat5, lowerCase4, j13, arrayList16, hVar2, messagesController);
            this.A = p0Var2;
            AndroidUtilities.runOnUIThread(p0Var2, 200L);
            return;
        }
        sb2.append(charSequence2.substring(1));
        this.T = 0;
        this.U = sb2.length();
        c11 = 0;
        i15 = -1;
        r15 = 0;
        if (str13 != null) {
        }
        if (str13 == null) {
        }
        r32 = this.C;
        if (r32 != 0) {
        }
        s0Var = this.D;
        if (s0Var != null) {
        }
        if (c11 != 65535) {
        }
    }

    public final void V(boolean z10) {
        this.c = z10;
    }

    public final void W(TLRPC.ChatFull chatFull) {
        rn rnVar;
        TLRPC.Chat chat;
        this.f = UserConfig.selectedAccount;
        this.v = chatFull;
        if (!this.d0 && this.s0 != null && (rnVar = this.C0) != null && (chat = rnVar.e) != null) {
            boolean canSendStickers = ChatObject.canSendStickers(chat);
            this.d0 = canSendStickers;
            if (canSendStickers) {
                this.x = null;
                l();
                this.R.a(false);
                R(this.s0);
            }
        }
        String str = this.V;
        if (str != null) {
            U(str, this.Y, this.Z, this.X, this.W);
        }
    }

    public final void X(rn rnVar) {
        this.C0 = rnVar;
    }

    public final void Y(a0.h hVar, ArrayList arrayList, boolean z10) {
        this.x = arrayList;
        if (!this.d || !this.e) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                TLObject tLObject = (TLObject) it.next();
                if ((tLObject instanceof TLRPC.Chat) && !this.e) {
                    it.remove();
                } else if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    if (user.bot || UserObject.isService(user.id)) {
                        it.remove();
                    }
                }
            }
        }
        this.y = hVar;
        gs0 gs0Var = this.l0;
        if (gs0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(gs0Var);
            this.l0 = null;
        }
        this.N = null;
        this.w0 = null;
        if (z10) {
            l();
            this.R.a(!this.x.isEmpty());
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        c9 c9Var;
        if (i10 == NotificationCenter.fileLoaded || i10 == NotificationCenter.fileLoadFailed) {
            ArrayList arrayList = this.w0;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            ArrayList arrayList2 = this.y0;
            if (arrayList2.isEmpty() || !this.k0) {
                return;
            }
            arrayList2.remove((String) objArr[0]);
            if (arrayList2.isEmpty()) {
                this.R.a(K() > 0);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.recentDocumentsDidLoad) {
            c9 c9Var2 = this.B0;
            if (c9Var2 != null) {
                AndroidUtilities.runOnUIThread(c9Var2);
                this.B0 = null;
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.stickersDidLoad && ((Integer) objArr[0]).intValue() == 0 && (c9Var = this.B0) != null) {
            AndroidUtilities.runOnUIThread(c9Var);
            this.B0 = null;
        }
    }

    @Override // f2.q0
    public final int h() {
        int K = K();
        this.H0 = K;
        return K;
    }

    @Override // f2.q0
    public final int j(int i10) {
        if (this.B != null) {
            if (i10 < 2) {
                return 6;
            }
            i10 -= 2;
        }
        if (this.w0 != null) {
            return 4;
        }
        if (this.s0 != null && !this.d0) {
            return 3;
        }
        if (this.N == null) {
            ArrayList arrayList = this.I;
            return (arrayList == null || i10 < 0 || i10 >= arrayList.size()) ? 0 : 5;
        }
        if (i10 == 0) {
            return (this.P == null && this.Q == null) ? 1 : 2;
        }
        return 1;
    }

    @Override // f2.q0
    public final void l() {
        MediaDataController.KeywordResult keywordResult;
        String str;
        String str2;
        int i10 = this.H0;
        v90 v90Var = this.R;
        int i11 = 0;
        if (i10 != -1 && this.F0 != null) {
            int K = K();
            this.H0 = K;
            boolean z10 = i10 != K;
            int min = Math.min(i10, K);
            Object[] objArr = new Object[K];
            for (int i12 = 0; i12 < K; i12++) {
                objArr[i12] = J(i12);
            }
            while (i11 < min) {
                if (i11 >= 0) {
                    Object[] objArr2 = this.F0;
                    if (i11 < objArr2.length && i11 < K) {
                        Object obj = objArr2[i11];
                        Object obj2 = objArr[i11];
                        if (!(obj instanceof p1)) {
                            if (obj != obj2 && ((!(obj instanceof t0) || !(obj2 instanceof t0) || ((t0) obj).a != ((t0) obj2).a) && ((!(obj instanceof TLRPC.User) || !(obj2 instanceof TLRPC.User) || ((TLRPC.User) obj).id != ((TLRPC.User) obj2).id) && ((!(obj instanceof TLRPC.Chat) || !(obj2 instanceof TLRPC.Chat) || ((TLRPC.Chat) obj).id != ((TLRPC.Chat) obj2).id) && (!(obj instanceof String) || !(obj2 instanceof String) || !obj.equals(obj2)))))) {
                                if ((obj instanceof MediaDataController.KeywordResult) && (obj2 instanceof MediaDataController.KeywordResult) && (str = (keywordResult = (MediaDataController.KeywordResult) obj).keyword) != null) {
                                    MediaDataController.KeywordResult keywordResult2 = (MediaDataController.KeywordResult) obj2;
                                    if (str.equals(keywordResult2.keyword) && (str2 = keywordResult.emoji) != null && str2.equals(keywordResult2.emoji)) {
                                    }
                                }
                            }
                            i11++;
                        }
                    }
                }
                m(i11);
                z10 = true;
                i11++;
            }
            t(min, i10 - min);
            s(min, K - min);
            if (z10 && v90Var != null) {
                v90Var.c();
            }
            this.F0 = objArr;
            return;
        }
        if (v90Var != null) {
            this.H0 = K();
            v90Var.c();
        }
        super.l();
        int K2 = K();
        this.H0 = K2;
        this.F0 = new Object[K2];
        while (true) {
            Object[] objArr3 = this.F0;
            if (i11 >= objArr3.length) {
                return;
            }
            objArr3[i11] = J(i11);
            i11++;
        }
    }

    @Override // f2.q0
    public final void v(o1 o1Var, int i10) {
        rn rnVar;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        float f10;
        String str = this.B;
        int i11 = str != null ? i10 - 2 : i10;
        int i12 = o1Var.f;
        View view = o1Var.a;
        Boolean bool = null;
        if (i12 == 4) {
            y7 y7Var = (y7) view;
            if (i11 < 0 || i11 >= this.w0.size()) {
                return;
            }
            t0 t0Var = (t0) this.w0.get(i11);
            TLRPC.Document document = t0Var.a;
            Object obj = t0Var.b;
            k2 k2Var = y7Var.n;
            n9 n9Var = y7Var.a;
            y7Var.c = obj;
            boolean isPremiumSticker = MessageObject.isPremiumSticker(document);
            y7Var.s = isPremiumSticker;
            if (isPremiumSticker) {
                k2Var.setColor(g6.w0(null, g6.d6, false));
                k2Var.D = true;
                k2Var.E = false;
                k2Var.invalidate();
            }
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, g6.a7, 1.0f, 1.0f, y7Var.v);
            if (!MessageObject.canAutoplayAnimatedSticker(document)) {
                f10 = 1.0f;
                if (svgThumb == null) {
                    n9Var.i(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, "webp", null, y7Var.c);
                } else if (closestPhotoSizeWithSize != null) {
                    n9Var.i(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, "webp", svgThumb, y7Var.c);
                } else {
                    n9Var.i(ImageLocation.getForDocument(document), null, "webp", svgThumb, y7Var.c);
                }
            } else if (svgThumb != null) {
                n9Var.i(ImageLocation.getForDocument(document), "80_80", null, svgThumb, y7Var.c);
                f10 = 1.0f;
            } else if (closestPhotoSizeWithSize != null) {
                f10 = 1.0f;
                n9Var.j(ImageLocation.getForDocument(document), "80_80", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, 0, y7Var.c);
            } else {
                f10 = 1.0f;
                n9Var.i(ImageLocation.getForDocument(document), "80_80", null, null, y7Var.c);
            }
            y7Var.b = document;
            Drawable background = y7Var.getBackground();
            if (background != null) {
                background.setAlpha(230);
                background.setColorFilter(new PorterDuffColorFilter(g6.w0(null, g6.Be, false), PorterDuff.Mode.MULTIPLY));
            }
            if (y7Var.s) {
                y7Var.r = true;
            } else {
                y7Var.r = false;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) k2Var.getLayoutParams();
            if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                int dp = AndroidUtilities.dp(16.0f);
                layoutParams.width = dp;
                layoutParams.height = dp;
                layoutParams.gravity = 85;
                layoutParams.bottomMargin = AndroidUtilities.dp(8.0f);
                layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
                k2Var.setPadding(AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), AndroidUtilities.dp(f10));
            } else {
                int dp2 = AndroidUtilities.dp(24.0f);
                layoutParams.width = dp2;
                layoutParams.height = dp2;
                layoutParams.gravity = 81;
                layoutParams.rightMargin = 0;
                layoutParams.bottomMargin = 0;
                k2Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
            }
            k2Var.setLocked(!UserConfig.getInstance(UserConfig.selectedAccount).isPremium());
            AndroidUtilities.updateViewVisibilityAnimated(k2Var, y7Var.r, 0.9f, false);
            y7Var.invalidate();
            y7Var.setClearsInputField(true);
            return;
        }
        if (i12 == 3) {
            TextView textView = (TextView) view;
            TLRPC.Chat chat = this.C0.e;
            if (chat != null) {
                if (!ChatObject.hasAdminRights(chat) && (tL_chatBannedRights = chat.default_banned_rights) != null && tL_chatBannedRights.send_inline) {
                    textView.setText(LocaleController.getString(R.string.GlobalAttachInlineRestricted));
                    return;
                } else if (AndroidUtilities.isBannedForever(chat.banned_rights)) {
                    textView.setText(LocaleController.getString(R.string.AttachInlineRestrictedForever));
                    return;
                } else {
                    textView.setText(LocaleController.formatString("AttachInlineRestricted", R.string.AttachInlineRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                    return;
                }
            }
            return;
        }
        if (i12 == 5) {
            m1 m1Var = (m1) view;
            ArrayList arrayList = this.I;
            if (arrayList == null || i11 < 0 || i11 >= arrayList.size()) {
                return;
            }
            m1Var.a((p1) this.I.get(i11), this.H, false);
            return;
        }
        ArrayList arrayList2 = this.N;
        if (arrayList2 != null) {
            TLRPC.TL_inlineBotSwitchPM tL_inlineBotSwitchPM = this.P;
            boolean z10 = (tL_inlineBotSwitchPM == null && this.Q == null) ? false : true;
            if (i12 == 2) {
                if (z10) {
                    ((org.telegram.ui.Cells.i0) view).setText(tL_inlineBotSwitchPM != null ? tL_inlineBotSwitchPM.text : this.Q.text);
                    return;
                }
                return;
            } else {
                if (z10) {
                    i11--;
                }
                if (i11 < 0 || i11 >= arrayList2.size()) {
                    return;
                }
                ((d2) view).e((TLRPC.BotInlineResult) this.N.get(i11), this.s0, this.t0, i11 != this.N.size() - 1, z10 && i11 == 0, "gif".equals(this.m0));
                return;
            }
        }
        if (i12 == 6) {
            s0 s0Var = (s0) view;
            int i13 = i11 + 2;
            if (i13 == 0) {
                this.C = s0Var;
            } else {
                this.D = s0Var;
            }
            TLRPC.Chat chat2 = this.h0;
            if (chat2 == null && (rnVar = this.C0) != null) {
                chat2 = rnVar.e;
            }
            s0Var.a(i13, str, chat2);
            return;
        }
        if (i12 == 7) {
            return;
        }
        e5 e5Var = (e5) view;
        ArrayList arrayList3 = this.x;
        if (arrayList3 != null) {
            TLObject tLObject = (TLObject) arrayList3.get(i11);
            if (tLObject instanceof TLRPC.User) {
                e5Var.setUser((TLRPC.User) tLObject);
            } else if (tLObject instanceof TLRPC.Chat) {
                e5Var.setChat((TLRPC.Chat) tLObject);
            }
        } else {
            ArrayList arrayList4 = this.E;
            if (arrayList4 == null || i11 < 0 || i11 >= arrayList4.size()) {
                ArrayList arrayList5 = this.J;
                if (arrayList5 == null || i11 < 0 || i11 >= arrayList5.size()) {
                    ArrayList arrayList6 = this.F;
                    if (arrayList6 != null && i11 >= 0 && i11 < arrayList6.size()) {
                        ArrayList arrayList7 = this.G;
                        String str2 = (arrayList7 == null || i11 < 0 || i11 >= arrayList7.size()) ? null : (String) this.G.get(i11);
                        ArrayList arrayList8 = this.L;
                        TLRPC.User user = (arrayList8 == null || i11 < 0 || i11 >= arrayList8.size()) ? null : (TLRPC.User) this.L.get(i11);
                        ArrayList arrayList9 = this.M;
                        if (arrayList9 != null && i11 >= 0 && i11 < arrayList9.size()) {
                            bool = (Boolean) this.M.get(i11);
                        }
                        boolean booleanValue = bool.booleanValue();
                        String str3 = (String) this.F.get(i11);
                        cg.q qVar = e5Var.b;
                        TextView textView2 = e5Var.c;
                        y8 y8Var = e5Var.d;
                        n9 n9Var2 = e5Var.a;
                        e5Var.a();
                        if (user != null) {
                            n9Var2.setVisibility(0);
                            y8Var.r(user);
                            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                            if (userProfilePhoto == null || userProfilePhoto.photo_small == null) {
                                n9Var2.setImageDrawable(y8Var);
                            } else {
                                n9Var2.e(user, y8Var);
                            }
                        } else {
                            n9Var2.setVisibility(4);
                        }
                        textView2.setVisibility(0);
                        if (booleanValue) {
                            cq cqVar = new cq(R.drawable.mini_ephemeral_hidden_14, 0);
                            cqVar.setColorKey(g6.A6);
                            cqVar.setTopOffset(1);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str3);
                            spannableStringBuilder.append((CharSequence) " *");
                            spannableStringBuilder.setSpan(cqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            qVar.setText(spannableStringBuilder);
                        } else {
                            qVar.setText(str3);
                        }
                        textView2.setText(Emoji.replaceEmoji(str2, textView2.getPaint().getFontMetricsInt(), false));
                    }
                } else {
                    e5Var.setEmojiSuggestion((MediaDataController.KeywordResult) this.J.get(i11));
                }
            } else {
                e5Var.setText((String) this.E.get(i11));
            }
        }
        e5Var.setDivider(false);
    }

    @Override // f2.q0
    public final o1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        c6 c6Var = this.D0;
        Context context = this.h;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    org.telegram.ui.Cells.i0 i0Var = new org.telegram.ui.Cells.i0(context);
                    TextView textView = new TextView(context);
                    i0Var.a = textView;
                    textView.setTextSize(1, 15.0f);
                    textView.setTextColor(g6.w0(null, g6.Ce, false));
                    textView.setTypeface(AndroidUtilities.bold());
                    textView.setSingleLine(true);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    textView.setMaxLines(1);
                    textView.setGravity(LocaleController.isRTL ? 5 : 3);
                    i0Var.addView(textView, z5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 16, 14.0f, 0.0f, 14.0f, 0.0f));
                    view = i0Var;
                } else if (i10 == 3) {
                    TextView textView2 = new TextView(context);
                    textView2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                    textView2.setTextSize(1, 14.0f);
                    textView2.setTextColor(g6.v0(g6.z6, c6Var));
                    view2 = textView2;
                } else if (i10 != 5) {
                    boolean z10 = this.s;
                    if (i10 == 6) {
                        view2 = new s0(context, c6Var, z10);
                    } else if (i10 != 7) {
                        y7 y7Var = new y7(context);
                        y7Var.v = c6Var;
                        n9 n9Var = new n9(context);
                        y7Var.a = n9Var;
                        n9Var.setAspectFit(true);
                        n9Var.setLayerNum(1);
                        y7Var.addView(n9Var, z5.d(66, 66.0f, 1, 0.0f, 5.0f, 0.0f, 0.0f));
                        y7Var.setFocusable(true);
                        k2 k2Var = new k2(context, 1, null);
                        y7Var.n = k2Var;
                        k2Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                        k2Var.setImageReceiver(n9Var.getImageReceiver());
                        y7Var.addView(k2Var, z5.d(24, 24.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
                        view2 = y7Var;
                    } else {
                        View q0Var = new q0(context, 0);
                        dq dqVar = new dq(new ColorDrawable(z10 ? g6.l1(0.15f, -1) : g6.v0(g6.a7, c6Var)), g6.U0(context, R.drawable.greydivider, g6.v0(g6.b7, c6Var)), 0, 0);
                        dqVar.w = true;
                        q0Var.setBackground(dqVar);
                        view = q0Var;
                    }
                } else {
                    view = new m1(context, c6Var, false);
                }
            } else {
                d2 d2Var = new d2(context);
                d2Var.setDelegate(new j0(this));
                view2 = d2Var;
            }
            return new lk0(view2);
        }
        e5 e5Var = new e5(context, c6Var);
        e5Var.setIsDarkTheme(false);
        view = e5Var;
        view2 = view;
        return new lk0(view2);
    }
}
