package tf;

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
import eg.s1;
import j$.util.List;
import j$.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import k7.b6;
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
import org.telegram.messenger.f9;
import org.telegram.messenger.pk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.b8;
import org.telegram.ui.Cells.e2;
import org.telegram.ui.Cells.h5;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.ka0;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.z8;
import org.telegram.ui.Components.zw;
import org.telegram.ui.cu;
import org.telegram.ui.ii1;
import org.telegram.ui.xn;
import ph.j5;
import uf.o1;
import uf.p1;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class u0 extends rl0 implements NotificationCenter.NotificationCenterDelegate {
    public String A0;
    public p0 B;
    public int B0;
    public String C;
    public f9 C0;
    public s0 D;
    public xn D0;
    public s0 E;
    public final f6 E0;
    public ArrayList F;
    public ArrayList G;
    public Object[] G0;
    public ArrayList H;
    public String I;
    public ArrayList J;
    public ArrayList K;
    public String[] L;
    public ArrayList M;
    public ArrayList N;
    public ArrayList O;
    public long P;
    public TLRPC.TL_inlineBotSwitchPM Q;
    public TLRPC.TL_inlineBotWebView R;
    public final ka0 S;
    public a0.h T;
    public int U;
    public int V;
    public String W;
    public boolean X;
    public boolean Y;
    public int Z;
    public ArrayList a0;
    public int d0;
    public int f0;
    public int g0;
    public final Context h;
    public boolean h0;
    public TLRPC.Chat i0;
    public zw k0;
    public boolean l0;
    public m71 m0;
    public long n;
    public String n0;
    public String o0;
    public String p0;
    public int q0;
    public final long r;
    public int r0;
    public final boolean s;
    public boolean s0;
    public TLRPC.User t0;
    public boolean u0;
    public TLRPC.ChatFull v;
    public m0 v0;
    public final k1 w;
    public Location w0;
    public ArrayList x;
    public ArrayList x0;
    public a0.h y;
    public HashMap y0;
    public boolean c = true;
    public boolean d = true;
    public boolean e = true;
    public int f = UserConfig.selectedAccount;
    public boolean b0 = true;
    public boolean c0 = true;
    public boolean e0 = true;
    public boolean j0 = false;
    public final ArrayList z0 = new ArrayList();
    public final l0 F0 = new l0(this, new k0(this));
    public boolean H0 = false;
    public int I0 = -1;

    public u0(Context context, long j10, long j11, ka0 ka0Var, f6 f6Var, boolean z4) {
        this.E0 = f6Var;
        this.h = context;
        this.S = ka0Var;
        this.n = j10;
        this.s = z4;
        this.r = j11;
        k1 k1Var = new k1(true);
        this.w = k1Var;
        k1Var.a = new j5(this, 10);
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

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        return (this.t0 == null || this.e0) && this.x0 == null;
    }

    public final void E(TLRPC.Document document, String str) {
        String str2 = document.dc_id + "_" + document.id;
        HashMap hashMap = this.y0;
        if (hashMap == null || !hashMap.containsKey(str2)) {
            if (UserConfig.getInstance(this.f).isPremium() || !MessageObject.isPremiumSticker(document)) {
                if (this.x0 == null) {
                    this.x0 = new ArrayList();
                    this.y0 = new HashMap();
                }
                this.x0.add(new t0(document, str));
                this.y0.put(str2, document);
                zw zwVar = this.k0;
                if (zwVar != null) {
                    zwVar.a();
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
            HashMap hashMap = this.y0;
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
                if (this.x0 == null) {
                    this.x0 = new ArrayList();
                    this.y0 = new HashMap();
                }
                this.x0.add(new t0(document, obj));
                this.y0.put(str2, document);
            }
            i10++;
            obj = obj;
        }
    }

    public final void G() {
        xn xnVar = this.D0;
        if (xnVar == null || xnVar.getParentActivity() == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23 && this.D0.getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            this.D0.getParentActivity().requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            return;
        }
        TLRPC.User user = this.t0;
        if (user == null || !user.bot_inline_geo) {
            return;
        }
        this.F0.start();
    }

    public final void H() {
        if (this.x0 == null) {
            return;
        }
        ArrayList arrayList = this.z0;
        arrayList.clear();
        int min = Math.min(6, this.x0.size());
        for (int i10 = 0; i10 < min; i10++) {
            t0 t0Var = (t0) this.x0.get(i10);
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(t0Var.a.thumbs, 90);
            if (((closestPhotoSizeWithSize instanceof TLRPC.TL_photoSize) || (closestPhotoSizeWithSize instanceof TLRPC.TL_photoSizeProgressive)) && !FileLoader.getInstance(this.f).getPathToAttach(closestPhotoSizeWithSize, "webp", true).exists()) {
                arrayList.add(FileLoader.getAttachFileName(closestPhotoSizeWithSize, "webp"));
                FileLoader.getInstance(this.f).loadFile(ImageLocation.getForDocument(closestPhotoSizeWithSize, t0Var.a), t0Var.b, "webp", 1, 1);
            }
        }
        arrayList.isEmpty();
    }

    public final TLRPC.TL_inlineBotSwitchPM I() {
        TLRPC.User user = this.t0;
        if (user == null || user.id == this.P) {
            return this.Q;
        }
        return null;
    }

    public final Object J(int i10) {
        String str;
        TLRPC.User user = null;
        if (this.C != null) {
            if (i10 >= 2) {
                i10 -= 2;
            }
            return null;
        }
        ArrayList arrayList = this.x0;
        if (arrayList == null) {
            ArrayList arrayList2 = this.O;
            if (arrayList2 != null) {
                TLRPC.TL_inlineBotWebView tL_inlineBotWebView = this.R;
                if (tL_inlineBotWebView == null) {
                    TLRPC.TL_inlineBotSwitchPM tL_inlineBotSwitchPM = this.Q;
                    if (tL_inlineBotSwitchPM != null) {
                        if (i10 == 0) {
                            return tL_inlineBotSwitchPM;
                        }
                    }
                    if (i10 >= 0 && i10 < arrayList2.size()) {
                        return this.O.get(i10);
                    }
                } else if (i10 == 0) {
                    return tL_inlineBotWebView;
                }
                i10--;
                if (i10 >= 0) {
                    return this.O.get(i10);
                }
            } else {
                ArrayList arrayList3 = this.x;
                if (arrayList3 == null) {
                    ArrayList arrayList4 = this.F;
                    if (arrayList4 == null) {
                        ArrayList arrayList5 = this.K;
                        if (arrayList5 == null) {
                            ArrayList arrayList6 = this.J;
                            if (arrayList6 != null || this.G != null) {
                                if (arrayList6 != null) {
                                    if (i10 >= 0 && i10 < arrayList6.size()) {
                                        return this.J.get(i10);
                                    }
                                    ArrayList arrayList7 = this.J;
                                    if (arrayList7 != null) {
                                        i10 -= arrayList7.size();
                                    }
                                }
                                ArrayList arrayList8 = this.G;
                                if (arrayList8 != null && i10 >= 0 && i10 < arrayList8.size()) {
                                    ArrayList arrayList9 = this.M;
                                    if (arrayList9 == null || (this.d0 == 1 && !(this.v instanceof TLRPC.TL_channelFull))) {
                                        str = (String) this.G.get(i10);
                                    } else if (arrayList9.get(i10) != null) {
                                        user = (TLRPC.User) this.M.get(i10);
                                        str = String.format("%s@%s", this.G.get(i10), user != null ? UserObject.getPublicUsername(user) : "");
                                    } else {
                                        str = String.format("%s", this.G.get(i10));
                                    }
                                    ArrayList arrayList10 = this.N;
                                    if (arrayList10 == null || !((Boolean) arrayList10.get(i10)).booleanValue()) {
                                        return str;
                                    }
                                    return new r0(str, user != null ? user.id : 0L);
                                }
                            }
                        } else if (i10 >= 0 && i10 < arrayList5.size()) {
                            return this.K.get(i10);
                        }
                    } else if (i10 >= 0 && i10 < arrayList4.size()) {
                        return this.F.get(i10);
                    }
                } else if (i10 >= 0 && i10 < arrayList3.size()) {
                    return this.x.get(i10);
                }
            }
        } else if (i10 >= 0 && i10 < arrayList.size()) {
            return ((t0) this.x0.get(i10)).a;
        }
        return null;
    }

    public final int K() {
        int size;
        int i10 = 1;
        if (this.t0 != null && !this.e0) {
            return 1;
        }
        int i11 = this.C != null ? 2 : 0;
        ArrayList arrayList = this.x0;
        if (arrayList != null) {
            size = arrayList.size();
        } else {
            ArrayList arrayList2 = this.O;
            if (arrayList2 != null) {
                int size2 = arrayList2.size();
                if (this.Q == null && this.R == null) {
                    i10 = 0;
                }
                return size2 + i10 + i11;
            }
            ArrayList arrayList3 = this.x;
            if (arrayList3 != null) {
                size = arrayList3.size();
            } else {
                ArrayList arrayList4 = this.F;
                if (arrayList4 != null) {
                    size = arrayList4.size();
                } else if (this.G == null && this.J == null) {
                    ArrayList arrayList5 = this.K;
                    if (arrayList5 == null) {
                        return i11;
                    }
                    size = arrayList5.size();
                } else {
                    ArrayList arrayList6 = this.J;
                    int size3 = arrayList6 == null ? 0 : arrayList6.size();
                    ArrayList arrayList7 = this.G;
                    size = size3 + (arrayList7 != null ? arrayList7.size() : 0);
                }
            }
        }
        return size + i11;
    }

    public final Object L(int i10) {
        if (this.C != null) {
            if (i10 < 2) {
                return null;
            }
            i10 -= 2;
        }
        ArrayList arrayList = this.x0;
        if (arrayList == null || i10 < 0 || i10 >= arrayList.size()) {
            return null;
        }
        return ((t0) this.x0.get(i10)).b;
    }

    public final int M(int i10) {
        if (this.C != null) {
            if (i10 < 2) {
                return 0;
            }
            i10 -= 2;
        }
        return this.O != null ? (this.Q == null && this.R == null) ? i10 : i10 - 1 : i10;
    }

    public final boolean N() {
        return this.x0 != null;
    }

    public final void P() {
        l0 l0Var = this.F0;
        if (l0Var != null) {
            l0Var.stop();
        }
        m0 m0Var = this.v0;
        if (m0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(m0Var);
            this.v0 = null;
        }
        if (this.q0 != 0) {
            ConnectionsManager.getInstance(this.f).cancelRequest(this.q0, true);
            this.q0 = 0;
        }
        if (this.r0 != 0) {
            ConnectionsManager.getInstance(this.f).cancelRequest(this.r0, true);
            this.r0 = 0;
        }
        this.t0 = null;
        this.Q = null;
        this.e0 = true;
        this.n0 = null;
        this.o0 = null;
        this.s0 = false;
        NotificationCenter.getInstance(this.f).removeObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(this.f).removeObserver(this, NotificationCenter.fileLoadFailed);
        NotificationCenter.getInstance(this.f).removeObserver(this, NotificationCenter.recentDocumentsDidLoad);
        NotificationCenter.getInstance(this.f).removeObserver(this, NotificationCenter.stickersDidLoad);
    }

    public final void Q() {
        TLRPC.User user = this.t0;
        if (user == null || !user.bot_inline_geo) {
            return;
        }
        Location location = new Location("network");
        this.w0 = location;
        location.setLatitude(-1000.0d);
        this.w0.setLongitude(-1000.0d);
        T(true, this.t0, this.o0, "");
    }

    public final void R(TLRPC.User user) {
        xn xnVar;
        TLRPC.Chat chat;
        this.q0 = 0;
        this.F0.stop();
        ka0 ka0Var = this.S;
        if (user == null || !user.bot || user.bot_inline_placeholder == null) {
            this.t0 = null;
            this.Q = null;
            this.e0 = true;
        } else {
            this.t0 = user;
            long j10 = user.id;
            if (j10 != this.P) {
                this.Q = null;
                this.P = j10;
            }
            xn xnVar2 = this.D0;
            if (xnVar2 != null && (chat = xnVar2.e) != null) {
                boolean canSendStickers = ChatObject.canSendStickers(chat);
                this.e0 = canSendStickers;
                if (!canSendStickers) {
                    l();
                    ka0Var.a(true);
                    return;
                }
            }
            if (this.t0.bot_inline_geo) {
                if (MessagesController.getNotificationsSettings(this.f).getBoolean("inlinegeo_" + this.t0.id, false) || (xnVar = this.D0) == null || xnVar.getParentActivity() == null) {
                    G();
                } else {
                    TLRPC.User user2 = this.t0;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.D0.getParentActivity());
                    alertDialog$Builder.a.O = LocaleController.getString(R.string.ShareYouLocationTitle);
                    alertDialog$Builder.a.Q = LocaleController.getString(R.string.ShareYouLocationInline);
                    boolean[] zArr = new boolean[1];
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new ph.m1(this, zArr, user2, 4));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.web.m(6, this, zArr));
                    this.D0.showDialog(alertDialog$Builder.a, new gg.g(17, this, zArr));
                }
            }
        }
        if (this.t0 == null) {
            this.s0 = true;
            this.Q = null;
        } else {
            if (ka0Var != null) {
                ka0Var.b(true);
            }
            T(true, this.t0, this.o0, "");
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
        TLRPC.User user = this.t0;
        if (user == null || (str4 = user.username) == null || !str4.equals(str) || (str5 = this.o0) == null || !str5.equals(str2)) {
            TLRPC.User user2 = this.t0;
            ka0 ka0Var = this.S;
            if (user2 != null) {
                if (!this.e0 && str != null && str2 != null) {
                    return;
                } else {
                    ka0Var.a(false);
                }
            }
            m0 m0Var = this.v0;
            if (m0Var != null) {
                AndroidUtilities.cancelRunOnUIThread(m0Var);
                this.v0 = null;
            }
            if (TextUtils.isEmpty(str) || ((str3 = this.n0) != null && !str3.equals(str))) {
                if (this.q0 != 0) {
                    ConnectionsManager.getInstance(this.f).cancelRequest(this.q0, true);
                    this.q0 = 0;
                }
                if (this.r0 != 0) {
                    ConnectionsManager.getInstance(this.f).cancelRequest(this.r0, true);
                    this.r0 = 0;
                }
                this.t0 = null;
                this.Q = null;
                this.e0 = true;
                this.n0 = null;
                this.o0 = null;
                this.F0.stop();
                this.s0 = false;
                if (ka0Var != null) {
                    ka0Var.b(false);
                }
                if (str != null) {
                }
            }
            if (str2 != null) {
                if (ka0Var != null) {
                    if (this.t0 != null) {
                        ka0Var.b(true);
                    } else if (str.equals("gif")) {
                        this.n0 = "gif";
                        ka0Var.b(false);
                    }
                }
                MessagesController messagesController = MessagesController.getInstance(this.f);
                MessagesStorage messagesStorage = MessagesStorage.getInstance(this.f);
                this.o0 = str2;
                m0 m0Var2 = new m0(this, str2, str, messagesController, messagesStorage);
                this.v0 = m0Var2;
                AndroidUtilities.runOnUIThread(m0Var2, 400L);
                return;
            }
            if (this.r0 != 0) {
                ConnectionsManager.getInstance(this.f).cancelRequest(this.r0, true);
                this.r0 = 0;
            }
            this.o0 = null;
            if (ka0Var != null) {
                ka0Var.b(false);
            }
        }
    }

    public final void T(boolean z4, TLRPC.User user, String str, String str2) {
        Location location;
        if (this.r0 != 0) {
            ConnectionsManager.getInstance(this.f).cancelRequest(this.r0, true);
            this.r0 = 0;
        }
        if (!this.e0 || !this.d) {
            ka0 ka0Var = this.S;
            if (ka0Var != null) {
                ka0Var.b(false);
                return;
            }
            return;
        }
        if (str == null || user == null) {
            this.o0 = null;
            return;
        }
        if (user.bot_inline_geo && this.w0 == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.n);
        sb.append("_");
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append("_");
        sb.append(this.n);
        sb.append("_");
        sb.append(user.id);
        sb.append("_");
        sb.append((!user.bot_inline_geo || this.w0.getLatitude() == -1000.0d) ? "" : Double.valueOf(this.w0.getLongitude() + this.w0.getLatitude()));
        String sb2 = sb.toString();
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.f);
        pk pkVar = new pk(this, str, z4, user, str2, messagesStorage, sb2);
        long j10 = user.id;
        if (j10 != this.P) {
            this.Q = null;
            this.P = j10;
        }
        if (z4) {
            messagesStorage.getBotCache(sb2, pkVar);
            return;
        }
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.bot = MessagesController.getInstance(this.f).getInputUser(user);
        tL_messages_getInlineBotResults.query = str;
        tL_messages_getInlineBotResults.offset = str2;
        if (user.bot_inline_geo && (location = this.w0) != null && location.getLatitude() != -1000.0d) {
            tL_messages_getInlineBotResults.flags |= 1;
            TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
            tL_messages_getInlineBotResults.geo_point = tL_inputGeoPoint;
            tL_inputGeoPoint.lat = AndroidUtilities.fixLocationCoord(this.w0.getLatitude());
            tL_messages_getInlineBotResults.geo_point._long = AndroidUtilities.fixLocationCoord(this.w0.getLongitude());
        }
        if (DialogObject.isEncryptedDialog(this.n)) {
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        } else {
            tL_messages_getInlineBotResults.peer = MessagesController.getInstance(this.f).getInputPeer(this.n);
        }
        this.r0 = ConnectionsManager.getInstance(this.f).sendRequest(tL_messages_getInlineBotResults, pkVar, 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:224:0x0732, code lost:
    
        if (r17.toLowerCase().startsWith(r3) == false) goto L408;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0745, code lost:
    
        if (r14.toLowerCase().startsWith(r3) != false) goto L419;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0755, code lost:
    
        if (r15.toLowerCase().startsWith(r3) != false) goto L419;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x06e6, code lost:
    
        if (r13.user_id == r11.id) goto L387;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x041a, code lost:
    
        if (r29.v != null) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x041c, code lost:
    
        if (r13 == 0) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x041e, code lost:
    
        r29.W = r7;
        r29.Z = r0;
        r29.a0 = r4;
        r2.a(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:518:0x0428, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0728  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x073d  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x074d  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0759  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x076d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0735  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x050b  */
    /* JADX WARN: Type inference failed for: r11v23, types: [org.telegram.tgnet.TLRPC$User] */
    /* JADX WARN: Type inference failed for: r11v27, types: [org.telegram.tgnet.TLRPC$User] */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v63 */
    /* JADX WARN: Type inference failed for: r29v0, types: [f2.o0, java.lang.Object, tf.u0] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [org.telegram.ui.Components.ka0] */
    /* JADX WARN: Type inference failed for: r2v72 */
    /* JADX WARN: Type inference failed for: r3v51, types: [tf.s0] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21, types: [a0.h, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r9v44, types: [java.lang.Object, org.telegram.tgnet.TLRPC$User] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U(CharSequence charSequence, int i10, ArrayList arrayList, boolean z4, boolean z10) {
        String str;
        String str2;
        int i11;
        ArrayList arrayList2;
        ?? r22;
        String str3;
        xn xnVar;
        char c3;
        int i12;
        String str4;
        String str5;
        boolean z11;
        char c10;
        int i13;
        ?? r12;
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
        ka0 ka0Var;
        ka0 ka0Var2;
        String str10;
        char c11;
        String str11 = "";
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        TLRPC.Chat chat4 = this.i0;
        xn xnVar2 = this.D0;
        if (xnVar2 != null) {
            chat4 = xnVar2.e;
            xnVar2.i();
        }
        TLRPC.Chat chat5 = chat4;
        m71 m71Var = this.m0;
        if (m71Var != null) {
            AndroidUtilities.cancelRunOnUIThread(m71Var);
            this.m0 = null;
        }
        if (this.g0 != 0) {
            ConnectionsManager.getInstance(this.f).cancelRequest(this.g0, true);
            this.g0 = 0;
        }
        p0 p0Var = this.B;
        if (p0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(p0Var);
            this.B = null;
        }
        f9 f9Var = this.C0;
        if (f9Var != null) {
            AndroidUtilities.cancelRunOnUIThread(f9Var);
            this.C0 = null;
        }
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        ka0 ka0Var3 = this.S;
        if (isEmpty || charSequence2.length() > MessagesController.getInstance(this.f).getMaxMessageLength()) {
            S(null, null);
            ka0Var3.a(false);
            this.W = null;
            this.A0 = null;
            this.x0 = null;
            this.y0 = null;
            l();
            this.l0 = false;
            if (this.B0 != 0) {
                ConnectionsManager.getInstance(this.f).cancelRequest(this.B0, true);
                this.B0 = 0;
            }
            zw zwVar = this.k0;
            if (zwVar != null) {
                zwVar.a();
                return;
            }
            return;
        }
        int i15 = charSequence2.length() > 0 ? i10 - 1 : i10;
        this.W = null;
        this.Y = z4;
        this.X = z10;
        StringBuilder sb = new StringBuilder();
        boolean z14 = !z4 && charSequence2.length() > 0 && charSequence2.length() <= 14;
        if (z14) {
            int length = charSequence2.length();
            CharSequence charSequence3 = charSequence2;
            int i16 = 0;
            while (i16 < length) {
                char charAt = charSequence3.charAt(i16);
                int i17 = length - 1;
                if (i16 < i17) {
                    str10 = str11;
                    c11 = charSequence3.charAt(i16 + 1);
                } else {
                    str10 = str11;
                    c11 = 0;
                }
                if (i16 < i17 && charAt == 55356 && c11 >= 57339 && c11 <= 57343) {
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
            this.A0 = charSequence3.toString().trim();
            str2 = charSequence2;
        } else {
            str = "";
            str2 = str;
        }
        boolean z15 = z14 && (Emoji.isValidEmoji(str2) || Emoji.isValidEmoji(this.A0));
        if (z15 && (charSequence instanceof Spanned)) {
            u5[] u5VarArr = (u5[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), u5.class);
            z15 = u5VarArr == null || u5VarArr.length == 0;
        }
        if (this.c && z15 && (chat5 == null || ChatObject.canSendStickers(chat5))) {
            ArrayList arrayList4 = this.z0;
            arrayList4.clear();
            int i18 = SharedConfig.suggestStickers;
            if (i18 == 2 || !z15) {
                if (this.l0 && i18 == 2) {
                    this.l0 = false;
                    ka0Var3.a(false);
                    l();
                    return;
                }
                return;
            }
            this.x0 = null;
            this.y0 = null;
            if (this.B0 != 0) {
                ConnectionsManager.getInstance(this.f).cancelRequest(this.B0, true);
                this.B0 = 0;
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
                this.C0 = new f9((u0) this, charSequence, i10, arrayList2, z4, z10);
                MediaDataController.getInstance(this.f).loadRecents(0, false, true, false);
                MediaDataController.getInstance(this.f).loadRecents(2, false, true, false);
                ArrayList<TLRPC.Document> recentStickersNoCopy = MediaDataController.getInstance(this.f).getRecentStickersNoCopy(0);
                ArrayList<TLRPC.Document> recentStickersNoCopy2 = MediaDataController.getInstance(this.f).getRecentStickersNoCopy(2);
                int min = Math.min(20, recentStickersNoCopy.size());
                int i19 = 0;
                for (int i20 = 0; i20 < min; i20++) {
                    TLRPC.Document document = recentStickersNoCopy.get(i20);
                    if (O(document, this.A0)) {
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
                    if (O(document2, this.A0)) {
                        E(document2, "fav");
                    }
                }
                MediaDataController.getInstance(this.f).checkStickers(0);
                HashMap<String, ArrayList<TLRPC.Document>> allStickers = MediaDataController.getInstance(this.f).getAllStickers();
                ArrayList<TLRPC.Document> arrayList5 = allStickers != null ? allStickers.get(this.A0) : null;
                if (arrayList5 != null && !arrayList5.isEmpty()) {
                    F(null, arrayList5);
                }
                ArrayList arrayList6 = this.x0;
                if (arrayList6 != null) {
                    Collections.sort(arrayList6, new n0(recentStickersNoCopy2, recentStickersNoCopy));
                }
            }
            if (SharedConfig.suggestStickers == 0 || z13) {
                String str12 = this.A0;
                TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                tL_messages_getStickers.emoticon = str2;
                tL_messages_getStickers.hash = 0L;
                this.B0 = ConnectionsManager.getInstance(this.f).sendRequest(tL_messages_getStickers, new ii1(7, this, str12));
            }
            ArrayList arrayList7 = this.x0;
            if (arrayList7 == null || arrayList7.isEmpty()) {
                ka0 ka0Var4 = ka0Var3;
                ka0Var = ka0Var4;
                if (this.l0) {
                    ka0Var4.a(false);
                    this.l0 = false;
                    ka0Var = ka0Var4;
                }
            } else {
                if (SharedConfig.suggestStickers != 0 || this.x0.size() >= 5) {
                    ka0 ka0Var5 = ka0Var3;
                    H();
                    ka0Var5.a(arrayList4.isEmpty());
                    this.l0 = true;
                    ka0Var2 = ka0Var5;
                } else {
                    ka0 ka0Var6 = ka0Var3;
                    ka0Var6.a(false);
                    this.l0 = false;
                    ka0Var2 = ka0Var6;
                }
                l();
                ka0Var = ka0Var2;
            }
            c3 = 4;
            str3 = null;
            r22 = ka0Var;
        } else {
            i11 = i10;
            arrayList2 = arrayList;
            r22 = ka0Var3;
            if (!z4 && this.c0 && charSequence2.charAt(0) == '@') {
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
                    for (int i23 = 1; i23 < str4.length(); i23++) {
                        char charAt2 = str4.charAt(i23);
                        if ((charAt2 >= '0' && charAt2 <= '9') || ((charAt2 >= 'a' && charAt2 <= 'z') || ((charAt2 >= 'A' && charAt2 <= 'Z') || charAt2 == '_'))) {
                        }
                    }
                    S(str4, str5);
                    str3 = null;
                }
                str4 = str;
                S(str4, str5);
                str3 = null;
            } else if (!this.c || (xnVar = this.D0) == null || xnVar.h != null || (!(chat5 == null || ChatObject.canSendStickers(chat5)) || charSequence2.trim().length() < 2 || charSequence2.trim().indexOf(32) >= 0)) {
                str3 = null;
                S(null, null);
            } else {
                str3 = null;
                S(null, null);
            }
            c3 = 65535;
        }
        if (this.t0 != null) {
            return;
        }
        MessagesController messagesController = MessagesController.getInstance(this.f);
        String str13 = this.C;
        this.C = str3;
        k1 k1Var = this.w;
        if (z4) {
            sb.append(charSequence2.substring(1));
            this.U = 0;
            this.V = sb.length();
            c10 = 0;
        } else {
            while (i15 >= 0) {
                if (i15 < charSequence2.length()) {
                    char charAt3 = charSequence2.charAt(i15);
                    if (i15 != 0) {
                        int i24 = i15 - 1;
                        if (charSequence2.charAt(i24) != ' ' && charSequence2.charAt(i24) != '\n' && charAt3 != ':') {
                            sb.insert(0, charAt3);
                        }
                    }
                    if (charAt3 == '@') {
                        boolean z17 = this.j0;
                        if (z17 || this.b0 || (this.c0 && i15 == 0)) {
                            this.U = i15;
                            this.V = sb.length() + 1;
                            c10 = 0;
                            r12 = 0;
                            if (str13 != null && this.C != null) {
                                s(r12, 2);
                            } else if (str13 == null && this.C == null) {
                                t(r12, 2);
                            } else {
                                r32 = this.D;
                                if (r32 != 0) {
                                    r32.a(r12, this.C, chat5);
                                }
                                s0Var = this.E;
                                if (s0Var != null) {
                                    s0Var.a(1, this.C, chat5);
                                }
                            }
                            if (c10 == 65535) {
                                this.u0 = r12;
                                this.O = null;
                                r22.a(r12);
                                return;
                            }
                            if (c10 != 0) {
                                if (c10 == 1) {
                                    ArrayList arrayList8 = new ArrayList();
                                    String lowerCase = sb.toString().toLowerCase();
                                    ArrayList arrayList9 = k1Var.q;
                                    for (int i25 = 0; i25 < arrayList9.size(); i25++) {
                                        i1 i1Var = (i1) arrayList9.get(i25);
                                        if (i1Var != null && (str7 = i1Var.a) != null && str7.startsWith(lowerCase)) {
                                            arrayList8.add(i1Var.a);
                                        }
                                    }
                                    this.F = arrayList8;
                                    this.x0 = null;
                                    this.x = null;
                                    this.y = null;
                                    this.J = null;
                                    this.G = null;
                                    this.N = null;
                                    this.H = null;
                                    this.M = null;
                                    this.K = null;
                                    this.u0 = false;
                                    this.O = null;
                                    l();
                                    r22.a((this.F.isEmpty() && this.C == null) ? false : true);
                                    return;
                                }
                                if (c10 != 2) {
                                    if (c10 == 3) {
                                        String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                                        if (!Arrays.equals(currentKeyboardLanguage, this.L)) {
                                            MediaDataController.getInstance(this.f).fetchNewEmojiKeywords(currentKeyboardLanguage);
                                        }
                                        this.L = currentKeyboardLanguage;
                                        MediaDataController.getInstance(this.f).getEmojiSuggestions(this.L, sb.toString(), false, new j0(this), SharedConfig.suggestAnimatedEmoji && UserConfig.getInstance(this.f).isPremium());
                                        return;
                                    }
                                    if (c10 == 4) {
                                        this.F = null;
                                        this.x = null;
                                        this.y = null;
                                        this.K = null;
                                        this.G = null;
                                        this.N = null;
                                        this.J = null;
                                        this.H = null;
                                        this.M = null;
                                        return;
                                    }
                                    return;
                                }
                                ArrayList arrayList10 = new ArrayList();
                                ArrayList arrayList11 = new ArrayList();
                                ArrayList arrayList12 = new ArrayList();
                                ArrayList arrayList13 = new ArrayList();
                                String lowerCase2 = sb.toString().toLowerCase();
                                for (int i26 = 0; i26 < this.T.m(); i26++) {
                                    TL_bots.BotInfo botInfo = (TL_bots.BotInfo) this.T.n(i26);
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
                                if (this.D0 != null && !DialogObject.isEncryptedDialog(this.n)) {
                                    xn xnVar3 = this.D0;
                                    if (xnVar3.O3 == 0 && xnVar3.i() != null && !this.D0.i().bot && !UserObject.isReplyUser(this.D0.i()) && !UserObject.isService(this.D0.i().id)) {
                                        p1 f10 = p1.f(this.f);
                                        ArrayList arrayList14 = f10.b;
                                        f10.h();
                                        this.I = lowerCase2;
                                        this.J = new ArrayList();
                                        for (int i28 = 0; i28 < arrayList14.size(); i28++) {
                                            o1 o1Var = (o1) arrayList14.get(i28);
                                            if (!p1.g(o1Var.b)) {
                                                String lowerCase3 = o1Var.b.toLowerCase();
                                                if (lowerCase3.startsWith(lowerCase2) || AndroidUtilities.translitSafe(lowerCase3).startsWith(lowerCase2)) {
                                                    this.J.add(o1Var);
                                                }
                                            }
                                        }
                                        r62 = 0;
                                        this.F = r62;
                                        this.x0 = r62;
                                        this.x = r62;
                                        this.y = r62;
                                        this.K = r62;
                                        this.G = arrayList10;
                                        this.H = arrayList11;
                                        this.M = arrayList12;
                                        this.N = arrayList13;
                                        this.u0 = false;
                                        this.O = r62;
                                        l();
                                        r22.a(arrayList10.isEmpty() || !((arrayList3 = this.J) == null || arrayList3.isEmpty()));
                                        return;
                                    }
                                }
                                r62 = 0;
                                this.I = null;
                                this.J = null;
                                this.F = r62;
                                this.x0 = r62;
                                this.x = r62;
                                this.y = r62;
                                this.K = r62;
                                this.G = arrayList10;
                                this.H = arrayList11;
                                this.M = arrayList12;
                                this.N = arrayList13;
                                this.u0 = false;
                                this.O = r62;
                                l();
                                r22.a(arrayList10.isEmpty() || !((arrayList3 = this.J) == null || arrayList3.isEmpty()));
                                return;
                            }
                            this.u0 = r12;
                            this.O = null;
                            ArrayList arrayList15 = new ArrayList();
                            if (arrayList2 != null) {
                                for (int i29 = 0; i29 < Math.min(100, arrayList2.size()); i29++) {
                                    long fromChatId = ((MessageObject) arrayList2.get(i29)).getFromChatId();
                                    if (fromChatId > 0 && !arrayList15.contains(Long.valueOf(fromChatId))) {
                                        arrayList15.add(Long.valueOf(fromChatId));
                                    }
                                }
                            }
                            String lowerCase4 = sb.toString().toLowerCase();
                            boolean z18 = lowerCase4.indexOf(32) >= 0;
                            ArrayList arrayList16 = new ArrayList();
                            a0.h hVar = new a0.h();
                            a0.h hVar2 = new a0.h();
                            ArrayList arrayList17 = new ArrayList();
                            arrayList17.addAll(MediaDataController.getInstance(this.f).inlineBots);
                            if (chat5 == null || (!ChatObject.isMonoForum(chat5) && !ChatObject.isChannelAndNotMegaGroup(chat5))) {
                                arrayList17.addAll(MediaDataController.getInstance(this.f).guestBots);
                            }
                            List.-EL.sort(arrayList17, new cu(20));
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
                            if (!z4 && this.c0 && i15 == 0 && !arrayList18.isEmpty()) {
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
                            xn xnVar4 = this.D0;
                            if (xnVar4 != null) {
                                chat5 = xnVar4.e;
                                j10 = xnVar4.a4;
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
                                            if (z10) {
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
                                    } else if (currentUser == null || !z4) {
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
                            if (this.j0) {
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
                            this.F = null;
                            this.x0 = null;
                            this.J = null;
                            this.G = null;
                            this.N = null;
                            this.H = null;
                            this.M = null;
                            this.K = null;
                            if (((chat5 == null || !chat5.megagroup) && !this.j0) || lowerCase4.length() <= 0) {
                                Y(hVar2, arrayList16, true);
                                return;
                            }
                            if (arrayList16.size() < 5) {
                                m71 m71Var2 = new m71(this, arrayList16, hVar2, 29);
                                this.m0 = m71Var2;
                                AndroidUtilities.runOnUIThread(m71Var2, 1000L);
                            } else {
                                Y(hVar2, arrayList16, true);
                            }
                            p0 p0Var2 = new p0(this, chat5, lowerCase4, j13, arrayList16, hVar2, messagesController);
                            this.B = p0Var2;
                            AndroidUtilities.runOnUIThread(p0Var2, 200L);
                            return;
                        }
                    } else if (charAt3 == '#') {
                        if (ChatObject.isChannelAndNotMegaGroup(chat5) && !TextUtils.isEmpty(ChatObject.getPublicUsername(chat5))) {
                            String substring2 = charSequence2.substring(i15);
                            this.C = substring2;
                            if (substring2.length() < 4 || !this.C.matches("^[#$][\\p{L}_-]+$")) {
                                this.C = null;
                            }
                        }
                        if (!k1Var.s) {
                            MessagesStorage.getInstance(k1Var.m).getStorageQueue().postRunnable(new g1(k1Var, 1));
                            this.W = charSequence2;
                            this.Z = i11;
                            this.a0 = arrayList2;
                            return;
                        }
                        this.U = i15;
                        this.V = sb.length() + 1;
                        sb.insert(0, charAt3);
                        c10 = 1;
                    } else if (i15 == 0 && this.T != null && charAt3 == '/') {
                        this.U = i15;
                        this.V = sb.length() + 1;
                        c10 = 2;
                    } else if (charAt3 == ':' && sb.length() > 0) {
                        if (" !\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~\n".indexOf(sb.charAt(0)) >= 0) {
                            i13 = 1;
                            if (sb.length() > 1) {
                            }
                        } else {
                            i13 = 1;
                        }
                        this.U = i15;
                        this.V = sb.length() + i13;
                        c10 = 3;
                    }
                    sb.insert(0, charAt3);
                }
                i15--;
            }
            z11 = false;
            c10 = c3;
            i15 = -1;
            r12 = z11;
            if (str13 != null) {
            }
            if (str13 == null) {
            }
            r32 = this.D;
            if (r32 != 0) {
            }
            s0Var = this.E;
            if (s0Var != null) {
            }
            if (c10 == 65535) {
            }
        }
        z11 = false;
        i15 = -1;
        r12 = z11;
        if (str13 != null) {
        }
        if (str13 == null) {
        }
        r32 = this.D;
        if (r32 != 0) {
        }
        s0Var = this.E;
        if (s0Var != null) {
        }
        if (c10 == 65535) {
        }
    }

    public final void V(boolean z4) {
        this.c = z4;
    }

    public final void W(TLRPC.ChatFull chatFull) {
        xn xnVar;
        TLRPC.Chat chat;
        this.f = UserConfig.selectedAccount;
        this.v = chatFull;
        if (!this.e0 && this.t0 != null && (xnVar = this.D0) != null && (chat = xnVar.e) != null) {
            boolean canSendStickers = ChatObject.canSendStickers(chat);
            this.e0 = canSendStickers;
            if (canSendStickers) {
                this.x = null;
                l();
                this.S.a(false);
                R(this.t0);
            }
        }
        String str = this.W;
        if (str != null) {
            U(str, this.Z, this.a0, this.Y, this.X);
        }
    }

    public final void X(xn xnVar) {
        this.D0 = xnVar;
    }

    public final void Y(a0.h hVar, ArrayList arrayList, boolean z4) {
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
        m71 m71Var = this.m0;
        if (m71Var != null) {
            AndroidUtilities.cancelRunOnUIThread(m71Var);
            this.m0 = null;
        }
        this.O = null;
        this.x0 = null;
        if (z4) {
            l();
            this.S.a(!this.x.isEmpty());
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        f9 f9Var;
        if (i10 == NotificationCenter.fileLoaded || i10 == NotificationCenter.fileLoadFailed) {
            ArrayList arrayList = this.x0;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            ArrayList arrayList2 = this.z0;
            if (arrayList2.isEmpty() || !this.l0) {
                return;
            }
            arrayList2.remove((String) objArr[0]);
            if (arrayList2.isEmpty()) {
                this.S.a(K() > 0);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.recentDocumentsDidLoad) {
            f9 f9Var2 = this.C0;
            if (f9Var2 != null) {
                AndroidUtilities.runOnUIThread(f9Var2);
                this.C0 = null;
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.stickersDidLoad && ((Integer) objArr[0]).intValue() == 0 && (f9Var = this.C0) != null) {
            AndroidUtilities.runOnUIThread(f9Var);
            this.C0 = null;
        }
    }

    @Override // f2.o0
    public final int h() {
        int K = K();
        this.I0 = K;
        return K;
    }

    @Override // f2.o0
    public final int j(int i10) {
        if (this.C != null) {
            if (i10 < 2) {
                return 6;
            }
            i10 -= 2;
        }
        if (this.x0 != null) {
            return 4;
        }
        if (this.t0 != null && !this.e0) {
            return 3;
        }
        if (this.O == null) {
            ArrayList arrayList = this.J;
            return (arrayList == null || i10 < 0 || i10 >= arrayList.size()) ? 0 : 5;
        }
        if (i10 == 0) {
            return (this.Q == null && this.R == null) ? 1 : 2;
        }
        return 1;
    }

    @Override // f2.o0
    public final void l() {
        MediaDataController.KeywordResult keywordResult;
        String str;
        String str2;
        int i10 = this.I0;
        ka0 ka0Var = this.S;
        int i11 = 0;
        if (i10 != -1 && this.G0 != null) {
            int K = K();
            this.I0 = K;
            boolean z4 = i10 != K;
            int min = Math.min(i10, K);
            Object[] objArr = new Object[K];
            for (int i12 = 0; i12 < K; i12++) {
                objArr[i12] = J(i12);
            }
            while (i11 < min) {
                if (i11 >= 0) {
                    Object[] objArr2 = this.G0;
                    if (i11 < objArr2.length && i11 < K) {
                        Object obj = objArr2[i11];
                        Object obj2 = objArr[i11];
                        if (!(obj instanceof o1)) {
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
                z4 = true;
                i11++;
            }
            t(min, i10 - min);
            s(min, K - min);
            if (z4 && ka0Var != null) {
                ka0Var.c();
            }
            this.G0 = objArr;
            return;
        }
        if (ka0Var != null) {
            this.I0 = K();
            ka0Var.c();
        }
        super.l();
        int K2 = K();
        this.I0 = K2;
        this.G0 = new Object[K2];
        while (true) {
            Object[] objArr3 = this.G0;
            if (i11 >= objArr3.length) {
                return;
            }
            objArr3[i11] = J(i11);
            i11++;
        }
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        xn xnVar;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        float f10;
        String str = this.C;
        int i11 = str != null ? i10 - 2 : i10;
        int i12 = l1Var.f;
        View view = l1Var.a;
        Boolean bool = null;
        if (i12 == 4) {
            b8 b8Var = (b8) view;
            if (i11 < 0 || i11 >= this.x0.size()) {
                return;
            }
            t0 t0Var = (t0) this.x0.get(i11);
            TLRPC.Document document = t0Var.a;
            Object obj = t0Var.b;
            s1 s1Var = b8Var.n;
            p9 p9Var = b8Var.a;
            b8Var.c = obj;
            boolean isPremiumSticker = MessageObject.isPremiumSticker(document);
            b8Var.s = isPremiumSticker;
            if (isPremiumSticker) {
                s1Var.setColor(j6.w0(null, j6.d6, false));
                s1Var.E = true;
                s1Var.F = false;
                s1Var.invalidate();
            }
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, j6.a7, 1.0f, 1.0f, b8Var.v);
            if (!MessageObject.canAutoplayAnimatedSticker(document)) {
                f10 = 1.0f;
                if (svgThumb == null) {
                    p9Var.i(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, "webp", null, b8Var.c);
                } else if (closestPhotoSizeWithSize != null) {
                    p9Var.i(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, "webp", svgThumb, b8Var.c);
                } else {
                    p9Var.i(ImageLocation.getForDocument(document), null, "webp", svgThumb, b8Var.c);
                }
            } else if (svgThumb != null) {
                p9Var.i(ImageLocation.getForDocument(document), "80_80", null, svgThumb, b8Var.c);
                f10 = 1.0f;
            } else if (closestPhotoSizeWithSize != null) {
                f10 = 1.0f;
                p9Var.j(ImageLocation.getForDocument(document), "80_80", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, 0, b8Var.c);
            } else {
                f10 = 1.0f;
                p9Var.i(ImageLocation.getForDocument(document), "80_80", null, null, b8Var.c);
            }
            b8Var.b = document;
            Drawable background = b8Var.getBackground();
            if (background != null) {
                background.setAlpha(230);
                background.setColorFilter(new PorterDuffColorFilter(j6.w0(null, j6.Be, false), PorterDuff.Mode.MULTIPLY));
            }
            if (b8Var.s) {
                b8Var.r = true;
            } else {
                b8Var.r = false;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) s1Var.getLayoutParams();
            if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                int dp = AndroidUtilities.dp(16.0f);
                layoutParams.width = dp;
                layoutParams.height = dp;
                layoutParams.gravity = 85;
                layoutParams.bottomMargin = AndroidUtilities.dp(8.0f);
                layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
                s1Var.setPadding(AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), AndroidUtilities.dp(f10));
            } else {
                int dp2 = AndroidUtilities.dp(24.0f);
                layoutParams.width = dp2;
                layoutParams.height = dp2;
                layoutParams.gravity = 81;
                layoutParams.rightMargin = 0;
                layoutParams.bottomMargin = 0;
                s1Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
            }
            s1Var.setLocked(!UserConfig.getInstance(UserConfig.selectedAccount).isPremium());
            AndroidUtilities.updateViewVisibilityAnimated(s1Var, b8Var.r, 0.9f, false);
            b8Var.invalidate();
            b8Var.setClearsInputField(true);
            return;
        }
        if (i12 == 3) {
            TextView textView = (TextView) view;
            TLRPC.Chat chat = this.D0.e;
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
            uf.l1 l1Var2 = (uf.l1) view;
            ArrayList arrayList = this.J;
            if (arrayList == null || i11 < 0 || i11 >= arrayList.size()) {
                return;
            }
            l1Var2.a((o1) this.J.get(i11), this.I, false);
            return;
        }
        ArrayList arrayList2 = this.O;
        if (arrayList2 != null) {
            TLRPC.TL_inlineBotSwitchPM tL_inlineBotSwitchPM = this.Q;
            boolean z4 = (tL_inlineBotSwitchPM == null && this.R == null) ? false : true;
            if (i12 == 2) {
                if (z4) {
                    ((org.telegram.ui.Cells.i0) view).setText(tL_inlineBotSwitchPM != null ? tL_inlineBotSwitchPM.text : this.R.text);
                    return;
                }
                return;
            } else {
                if (z4) {
                    i11--;
                }
                if (i11 < 0 || i11 >= arrayList2.size()) {
                    return;
                }
                ((e2) view).e((TLRPC.BotInlineResult) this.O.get(i11), this.t0, this.u0, i11 != this.O.size() - 1, z4 && i11 == 0, "gif".equals(this.n0));
                return;
            }
        }
        if (i12 == 6) {
            s0 s0Var = (s0) view;
            int i13 = i11 + 2;
            if (i13 == 0) {
                this.D = s0Var;
            } else {
                this.E = s0Var;
            }
            TLRPC.Chat chat2 = this.i0;
            if (chat2 == null && (xnVar = this.D0) != null) {
                chat2 = xnVar.e;
            }
            s0Var.a(i13, str, chat2);
            return;
        }
        if (i12 == 7) {
            return;
        }
        h5 h5Var = (h5) view;
        ArrayList arrayList3 = this.x;
        if (arrayList3 != null) {
            TLObject tLObject = (TLObject) arrayList3.get(i11);
            if (tLObject instanceof TLRPC.User) {
                h5Var.setUser((TLRPC.User) tLObject);
            } else if (tLObject instanceof TLRPC.Chat) {
                h5Var.setChat((TLRPC.Chat) tLObject);
            }
        } else {
            ArrayList arrayList4 = this.F;
            if (arrayList4 == null || i11 < 0 || i11 >= arrayList4.size()) {
                ArrayList arrayList5 = this.K;
                if (arrayList5 == null || i11 < 0 || i11 >= arrayList5.size()) {
                    ArrayList arrayList6 = this.G;
                    if (arrayList6 != null && i11 >= 0 && i11 < arrayList6.size()) {
                        ArrayList arrayList7 = this.H;
                        String str2 = (arrayList7 == null || i11 < 0 || i11 >= arrayList7.size()) ? null : (String) this.H.get(i11);
                        ArrayList arrayList8 = this.M;
                        TLRPC.User user = (arrayList8 == null || i11 < 0 || i11 >= arrayList8.size()) ? null : (TLRPC.User) this.M.get(i11);
                        ArrayList arrayList9 = this.N;
                        if (arrayList9 != null && i11 >= 0 && i11 < arrayList9.size()) {
                            bool = (Boolean) this.N.get(i11);
                        }
                        boolean booleanValue = bool.booleanValue();
                        String str3 = (String) this.G.get(i11);
                        gg.q qVar = h5Var.b;
                        TextView textView2 = h5Var.c;
                        z8 z8Var = h5Var.d;
                        p9 p9Var2 = h5Var.a;
                        h5Var.a();
                        if (user != null) {
                            p9Var2.setVisibility(0);
                            z8Var.r(user);
                            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                            if (userProfilePhoto == null || userProfilePhoto.photo_small == null) {
                                p9Var2.setImageDrawable(z8Var);
                            } else {
                                p9Var2.e(user, z8Var);
                            }
                        } else {
                            p9Var2.setVisibility(4);
                        }
                        textView2.setVisibility(0);
                        if (booleanValue) {
                            mq mqVar = new mq(R.drawable.mini_ephemeral_hidden_14, 0);
                            mqVar.setColorKey(j6.A6);
                            mqVar.setTopOffset(1);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str3);
                            spannableStringBuilder.append((CharSequence) " *");
                            spannableStringBuilder.setSpan(mqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            qVar.setText(spannableStringBuilder);
                        } else {
                            qVar.setText(str3);
                        }
                        textView2.setText(Emoji.replaceEmoji(str2, textView2.getPaint().getFontMetricsInt(), false));
                    }
                } else {
                    h5Var.setEmojiSuggestion((MediaDataController.KeywordResult) this.K.get(i11));
                }
            } else {
                h5Var.setText((String) this.F.get(i11));
            }
        }
        h5Var.setDivider(false);
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        f6 f6Var = this.E0;
        Context context = this.h;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    org.telegram.ui.Cells.i0 i0Var = new org.telegram.ui.Cells.i0(context);
                    TextView textView = new TextView(context);
                    i0Var.a = textView;
                    textView.setTextSize(1, 15.0f);
                    textView.setTextColor(j6.w0(null, j6.Ce, false));
                    textView.setTypeface(AndroidUtilities.bold());
                    textView.setSingleLine(true);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    textView.setMaxLines(1);
                    textView.setGravity(LocaleController.isRTL ? 5 : 3);
                    i0Var.addView(textView, b6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 16, 14.0f, 0.0f, 14.0f, 0.0f));
                    view = i0Var;
                } else if (i10 == 3) {
                    TextView textView2 = new TextView(context);
                    textView2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                    textView2.setTextSize(1, 14.0f);
                    textView2.setTextColor(j6.v0(j6.z6, f6Var));
                    view2 = textView2;
                } else if (i10 != 5) {
                    boolean z4 = this.s;
                    if (i10 == 6) {
                        view2 = new s0(context, f6Var, z4);
                    } else if (i10 != 7) {
                        b8 b8Var = new b8(context);
                        b8Var.v = f6Var;
                        p9 p9Var = new p9(context);
                        b8Var.a = p9Var;
                        p9Var.setAspectFit(true);
                        p9Var.setLayerNum(1);
                        b8Var.addView(p9Var, b6.d(66, 66.0f, 1, 0.0f, 5.0f, 0.0f, 0.0f));
                        b8Var.setFocusable(true);
                        s1 s1Var = new s1(context, 1, null);
                        b8Var.n = s1Var;
                        s1Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                        s1Var.setImageReceiver(p9Var.getImageReceiver());
                        b8Var.addView(s1Var, b6.d(24, 24.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
                        view2 = b8Var;
                    } else {
                        View q0Var = new q0(context, 0);
                        nq nqVar = new nq(new ColorDrawable(z4 ? j6.l1(0.15f, -1) : j6.v0(j6.a7, f6Var)), j6.U0(context, R.drawable.greydivider, j6.v0(j6.b7, f6Var)), 0, 0);
                        nqVar.w = true;
                        q0Var.setBackground(nqVar);
                        view = q0Var;
                    }
                } else {
                    view = new uf.l1(context, f6Var, false);
                }
            } else {
                e2 e2Var = new e2(context);
                e2Var.setDelegate(new j0(this));
                view2 = e2Var;
            }
            return new el0(view2);
        }
        h5 h5Var = new h5(context, f6Var);
        h5Var.setIsDarkTheme(false);
        view = h5Var;
        view2 = view;
        return new el0(view2);
    }
}
