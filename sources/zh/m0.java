package zh;

import ai.jc;
import ai.x9;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.google.android.gms.internal.cast.a6;
import ei.i6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import ki.m3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.kv;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.q10;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.x90;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ut0;
import org.telegram.ui.xk0;
import org.telegram.ui.y9;
import w7.z5;
import yh.p1;
import yh.t1;
import yh.u3;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public class m0 extends n2 {
    public d0 E;
    public final h0 F;
    public int G;
    public final Paint H;
    public float I;
    public final int[] J;
    public final int[] K;
    public LinearGradient L;
    public final Paint M;
    public final Matrix N;
    public final Paint O;
    public final RectF P;
    public final float[] Q;
    public LinearGradient R;
    public s S;
    public int T;
    public int U;
    public int V;
    public float W;
    public boolean X;
    public LinearGradient Y;
    public final Paint Z;
    public long a;
    public final RectF a0;
    public long b;
    public final int[] b0;
    public org.telegram.ui.g c;
    public final int[] c0;
    public b1 d;
    public final int[] d0;
    public p0 e;
    public final Path e0;
    public FrameLayout f;
    public final RectF f0;
    public Paint g0;
    public k0 h;
    public final q10 h0;
    public final RectF i0;
    public boolean j0;
    public Boolean k0;
    public float n;
    public float r;
    public float s;
    public float v;
    public float w;
    public c x;
    public boolean y;

    public m0(Bundle bundle) {
        super(bundle);
        this.F = new h0(this, 0);
        this.H = new Paint();
        this.I = Float.NaN;
        this.J = new int[2];
        this.K = new int[2];
        this.M = new Paint();
        this.N = new Matrix();
        this.O = new Paint(1);
        this.P = new RectF();
        this.Q = new float[2];
        this.Z = new Paint();
        this.a0 = new RectF();
        this.b0 = new int[2];
        this.c0 = new int[2];
        this.d0 = new int[2];
        this.e0 = new Path();
        this.f0 = new RectF();
        this.h0 = new q10(2);
        this.i0 = new RectF();
        this.hasOwnBackground = true;
    }

    public static void U(m0 m0Var) {
        if (m0Var.getParentActivity() == null) {
            return;
        }
        p1 p1Var = new p1(m0Var.getParentActivity(), m0Var.currentAccount, m0Var.getUserConfig().getClientUserId(), null, null);
        if (!p1Var.u0) {
            p1Var.u0 = true;
            jc jcVar = p1Var.w0;
            if (jcVar != null && (jcVar.getParent() instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) p1Var.w0.getParent();
                int indexOfChild = viewGroup.indexOfChild(p1Var.w0);
                viewGroup.removeView(p1Var.w0);
                jc jcVar2 = new jc(p1Var.getContext(), MediaDataController.MAX_LINKS_COUNT, 2);
                p1Var.w0 = jcVar2;
                viewGroup.addView(jcVar2, indexOfChild, z5.d(-1.0f, -1));
            }
            x90 x90Var = p1Var.x0;
            if (x90Var != null) {
                String string = LocaleController.getString(R.string.Gift2BrowseCollectiblesInfo);
                yh.v0 v0Var = p1Var.l0;
                v0Var.setText(string);
                v0Var.setBreakStrategy(2);
                x90Var.setVisibility(8);
            }
            p1Var.Y.N(false);
        }
        p1Var.show();
    }

    public static void W(View view) {
        view.setVerticalScrollBarEnabled(false);
        view.setHorizontalScrollBarEnabled(false);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                W(viewGroup.getChildAt(i10));
            }
        }
    }

    public static void Y(n2 n2Var) {
        y9.e0(n2Var.getParentActivity(), false, 1, new i0(n2Var.getCurrentAccount(), n2Var));
    }

    public static LinearGradient d0(boolean z10) {
        int[] iArr = new int[9];
        float[] fArr = new float[9];
        for (int i10 = 0; i10 < 9; i10++) {
            float f7 = i10 / 8.0f;
            float B = a6.B(f7, 2.0f, 3.0f, f7 * f7);
            if (!z10) {
                B = 1.0f - B;
            }
            iArr[i10] = ((int) ((B * 255.0f) + 0.5f)) << 24;
            fArr[i10] = f7;
        }
        return new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, iArr, fArr, Shader.TileMode.CLAMP);
    }

    public final void V() {
        Activity parentActivity = getParentActivity();
        if (parentActivity == null) {
            return;
        }
        Window window = parentActivity.getWindow();
        AndroidUtilities.setLightNavigationBar(parentActivity, false);
        AndroidUtilities.setLightStatusBar(window, false);
        if (Build.VERSION.SDK_INT >= 29) {
            if (this.k0 == null) {
                this.k0 = Boolean.valueOf(window.isNavigationBarContrastEnforced());
            }
            window.setNavigationBarContrastEnforced(false);
        }
    }

    public final void X() {
        b1 b1Var;
        if (this.h == null || (b1Var = this.d) == null || b1Var.getWidth() == 0) {
            return;
        }
        int max = Math.max(1, (int) (this.d.T0() - ((int) this.d.D0())));
        this.d.getClass();
        int width = (int) (this.f.getWidth() - (this.d.getWidth() - AndroidUtilities.dp(10.0f)));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
        if (layoutParams.height == max && layoutParams.leftMargin == r2 && layoutParams.rightMargin == width) {
            return;
        }
        layoutParams.height = max;
        layoutParams.leftMargin = r2;
        layoutParams.rightMargin = width;
        this.h.setLayoutParams(layoutParams);
    }

    public final void Z() {
        if (this.E != null || this.d == null || this.f == null || getParentActivity() == null) {
            return;
        }
        RectF rectF = new RectF();
        RectF rectF2 = new RectF();
        rectF.set(this.d.T6);
        rectF2.set(this.d.Q6);
        if (rectF.isEmpty()) {
            rectF.set((this.f.getWidth() / 2.0f) - AndroidUtilities.dp(20.0f), (this.f.getHeight() / 2.0f) - AndroidUtilities.dp(20.0f), (this.f.getWidth() / 2.0f) + AndroidUtilities.dp(20.0f), (this.f.getHeight() / 2.0f) + AndroidUtilities.dp(20.0f));
        }
        this.d.setScanHidden(true);
        d0 d0Var = new d0(getParentActivity(), rectF, rectF2, new le.b(this, 29));
        this.E = d0Var;
        d0Var.L = LocaleController.getString(R.string.QrScanQr);
        Typeface bold = AndroidUtilities.bold();
        TextPaint textPaint = d0Var.M;
        textPaint.setTypeface(bold);
        textPaint.setColor(-1);
        d0Var.invalidate();
        this.f.addView(this.E, z5.d(-1.0f, -1));
    }

    public final void a0(float f7, float f10, boolean z10) {
        if (!z10) {
            k0 k0Var = this.h;
            if (k0Var != null && k0Var.getVisibility() == 0) {
                this.h.setVisibility(4);
            }
            c cVar = this.x;
            if (cVar == null || cVar.getVisibility() != 0) {
                return;
            }
            this.x.setVisibility(4);
            return;
        }
        if (this.h == null) {
            if (getParentActivity() == null) {
                return;
            }
            k0 k0Var2 = new k0(this, getParentActivity(), this.currentAccount, new j0(this));
            this.h = k0Var2;
            k0Var2.setOutlineProvider(new l0(this, 0));
            this.h.setClipToOutline(true);
            c cVar2 = new c(getParentActivity(), new uc.b(this));
            this.x = cVar2;
            cVar2.b = this.h;
            this.d.setOnPicksChanged(new h0(this, 1));
            this.x.setOutlineProvider(this.h.getOutlineProvider());
            this.x.setClipToOutline(true);
            this.f.addView(this.h, z5.e(-1, -1, 48));
            X();
            this.f.post(new h0(this, 2));
        }
        X();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
        int i10 = layoutParams.height;
        int i11 = layoutParams.leftMargin;
        int i12 = layoutParams.rightMargin;
        if (this.x.getParent() == null) {
            this.f.addView(this.x, z5.e(-1, -1, 48));
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.x.getLayoutParams();
        if (layoutParams2.height != i10 || layoutParams2.leftMargin != i11 || layoutParams2.rightMargin != i12) {
            layoutParams2.height = i10;
            layoutParams2.leftMargin = i11;
            layoutParams2.rightMargin = i12;
            this.x.setLayoutParams(layoutParams2);
        }
        this.x.setTranslationY(f7);
        this.x.setAlpha(f10);
        this.x.invalidateOutline();
        this.x.invalidate();
        if (this.x.getVisibility() != 0) {
            this.x.setVisibility(0);
        }
        int p02 = this.d.p0();
        z0 z0Var = this.d.n;
        int i13 = p02 ^ (z0Var != null ? z0Var.i : 872415231);
        if (this.h.getTranslationY() != f7 || i13 != this.G) {
            this.h.setTranslationY(f7);
            this.G = i13;
            this.h.getTabs().invalidate();
        }
        this.h.invalidateOutline();
        this.h.setAlpha(f10);
        k0 k0Var3 = this.h;
        b1 b1Var = this.d;
        z0 z0Var2 = b1Var.n;
        int i14 = z0Var2 != null ? z0Var2.b : -16777216;
        if (i14 != b1Var.b2) {
            b1Var.b2 = i14;
            b1Var.c2 = (i0.b.f(0.13f, -1, b1.z0(0.75f, 1.3f, 0.16f, i14)) & 16777215) | (-1728053248);
        }
        k0Var3.setHeaderColor(b1Var.c2);
        if (this.h.getVisibility() != 0) {
            k0 k0Var4 = this.h;
            if (k0Var4.J) {
                k0Var4.J = false;
                k0Var4.e();
            }
            this.h.setVisibility(0);
        }
        if (this.j0) {
            return;
        }
        e0();
    }

    public final void b0() {
        b1 b1Var;
        Activity parentActivity = getParentActivity();
        if (parentActivity == null || (b1Var = this.d) == null || b1Var.getCurrentLink() == null) {
            return;
        }
        if ((Build.VERSION.SDK_INT <= 28 || BuildVars.NO_SCOPED_STORAGE) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            this.y = true;
            parentActivity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
        } else {
            Bitmap M0 = this.d.M0();
            if (M0 == null) {
                return;
            }
            Utilities.globalQueue.postRunnable(new uf.c(27, this, M0));
        }
    }

    public final void c0(String str) {
        b1 b1Var;
        if (getParentActivity() == null || (b1Var = this.d) == null || b1Var.getCurrentLink() == null) {
            return;
        }
        Bitmap M0 = this.d.M0();
        Uri bitmapShareUri = M0 != null ? AndroidUtilities.getBitmapShareUri(M0, "qr_tmp.jpg", Bitmap.CompressFormat.JPEG) : null;
        Intent intent = new Intent("android.intent.action.SEND");
        if (bitmapShareUri != null) {
            intent.setType("image/*");
            intent.putExtra("android.intent.extra.STREAM", bitmapShareUri);
            intent.addFlags(1);
        } else {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", str);
        }
        try {
            getParentActivity().startActivity(Intent.createChooser(intent, LocaleController.getString(R.string.InviteByQRCode)));
        } catch (ActivityNotFoundException e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean canBeginSlide() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x01a5, code lost:
    
        if (r5 != 1) goto L103;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01b5  */
    @Override // org.telegram.ui.ActionBar.n2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        String str;
        boolean z10;
        o0 o0Var;
        ArrayList<TLRPC.PrivacyRule> privacyRules;
        char c10;
        String str2;
        o0 o0Var2;
        int i10 = this.currentAccount;
        f[] fVarArr = f.f;
        if (fVarArr[i10] == null) {
            fVarArr[i10] = new f(i10);
        }
        f fVar = fVarArr[i10];
        TLRPC.TL_shareThemeBackdrops tL_shareThemeBackdrops = fVar.b;
        TLRPC.ShareTheme shareTheme = null;
        a.a(tL_shareThemeBackdrops != null ? tL_shareThemeBackdrops.backdrops : null);
        TLRPC.TL_shareThemeBackdrops tL_shareThemeBackdrops2 = fVar.b;
        t1 t1Var = new t1(this, fVar, tL_shareThemeBackdrops2 != null ? tL_shareThemeBackdrops2.backdrops : null, 4);
        if (fVar.d) {
            t1Var.run();
        } else {
            fVar.e.add(t1Var);
            if (!fVar.c) {
                fVar.c = true;
                TLRPC.TL_messages_getShareThemeBackdrops tL_messages_getShareThemeBackdrops = new TLRPC.TL_messages_getShareThemeBackdrops();
                TLRPC.TL_shareThemeBackdrops tL_shareThemeBackdrops3 = fVar.b;
                tL_messages_getShareThemeBackdrops.hash = tL_shareThemeBackdrops3 != null ? tL_shareThemeBackdrops3.hash : 0;
                ConnectionsManager.getInstance(fVar.a).sendRequestTyped(tL_messages_getShareThemeBackdrops, new org.telegram.messenger.a(), new u3(fVar, 2));
            }
        }
        Activity parentActivity = getParentActivity();
        xk0 xk0Var = parentActivity instanceof LaunchActivity ? ((LaunchActivity) parentActivity).t1 : null;
        if (xk0Var != null && this.c == null) {
            org.telegram.ui.g gVar = new org.telegram.ui.g(xk0Var, 29);
            xk0Var.b.add(gVar);
            xk0Var.a();
            this.c = gVar;
        }
        int i11 = this.currentAccount;
        long j10 = this.a;
        long j11 = this.b;
        MessagesController messagesController = MessagesController.getInstance(i11);
        String s10 = a1.g.s(new StringBuilder("https://"), messagesController.linkPrefix, "/");
        if (j10 != 0 || j11 == 0) {
            if (j10 == UserConfig.getInstance(i11).getClientUserId()) {
                str = "";
                z10 = true;
            } else {
                str = "";
                z10 = false;
            }
            TLRPC.User user = messagesController.getUser(Long.valueOf(j10));
            String publicUsername = user != null ? UserObject.getPublicUsername(user) : null;
            if (publicUsername != null) {
                o0Var = new o0(r.c.u(s10, publicUsername), publicUsername, true, false, z10, j10, z10);
            } else if (z10) {
                if (user != null && user.phone != null && (privacyRules = ContactsController.getInstance(i11).getPrivacyRules(6)) != null) {
                    int size = privacyRules.size();
                    int i12 = 0;
                    while (i12 < size) {
                        TLRPC.PrivacyRule privacyRule = privacyRules.get(i12);
                        i12++;
                        TLRPC.PrivacyRule privacyRule2 = privacyRule;
                        if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowAll) {
                            c10 = 0;
                            break;
                        }
                        if (privacyRule2 instanceof TLRPC.TL_privacyValueDisallowAll) {
                            break;
                        }
                        if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowContacts) {
                            c10 = 1;
                            break;
                        }
                    }
                    c10 = 2;
                    if (c10 == 2) {
                        ArrayList<TLRPC.PrivacyRule> privacyRules2 = ContactsController.getInstance(i11).getPrivacyRules(7);
                        if (privacyRules2 != null && !privacyRules2.isEmpty()) {
                            int size2 = privacyRules2.size();
                            int i13 = 0;
                            while (i13 < size2) {
                                TLRPC.PrivacyRule privacyRule3 = privacyRules2.get(i13);
                                i13++;
                                TLRPC.PrivacyRule privacyRule4 = privacyRule3;
                                if (!(privacyRule4 instanceof TLRPC.TL_privacyValueAllowAll)) {
                                    if ((privacyRule4 instanceof TLRPC.TL_privacyValueDisallowAll) || (privacyRule4 instanceof TLRPC.TL_privacyValueAllowContacts)) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                        if (user.phone.startsWith("+")) {
                            str2 = "+" + user.phone;
                        } else {
                            str2 = user.phone;
                        }
                        String str3 = str2;
                        o0Var = new o0(r.c.u(s10, str3), str3, false, false, true, j10, true);
                    }
                    if (c10 != 0) {
                    }
                    if (user.phone.startsWith("+")) {
                    }
                    String str32 = str2;
                    o0Var = new o0(r.c.u(s10, str32), str32, false, false, true, j10, true);
                }
                TLRPC.TL_exportedContactToken cachedContactToken = messagesController.getCachedContactToken();
                o0Var = new o0(cachedContactToken != null ? cachedContactToken.url : null, user != null ? UserObject.getUserName(user) : str, false, true, true, j10, true);
            } else {
                o0Var = new o0(s10, user != null ? UserObject.getUserName(user) : str, false, false, false, j10, false);
            }
            o0Var2 = o0Var;
        } else {
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j11));
            String publicUsername2 = ChatObject.getPublicUsername(chat);
            if (publicUsername2 != null) {
                o0Var2 = new o0(r.c.u(s10, publicUsername2), publicUsername2, true, false, false, -j11, ChatObject.canChangeChatInfo(chat));
            } else {
                o0Var2 = new o0(s10, chat != null ? chat.title : "", false, false, false, -j11, false);
            }
        }
        this.f = new FrameLayout(context);
        b1 b1Var = new b1(context, this.currentAccount, o0Var2.a, o0Var2.b, o0Var2.c, new u3.c(this));
        this.d = b1Var;
        this.f.addView(b1Var, z5.d(-1.0f, -1));
        this.fragmentView = this.f;
        p0 p0Var = this.e;
        if (p0Var != null) {
            p0Var.g();
        }
        int i14 = this.currentAccount;
        b1 b1Var2 = this.d;
        p0 p0Var2 = new p0(i14, b1Var2, o0Var2);
        this.e = p0Var2;
        boolean z11 = o0Var2.d;
        b1Var2.setTimerOnly(z11);
        b1Var2.setTemporaryLink(z11);
        c1[] c1VarArr = c1.d;
        if (c1VarArr[i14] == null) {
            c1VarArr[i14] = new c1(i14);
        }
        c1 c1Var = c1VarArr[i14];
        LongSparseArray longSparseArray = c1Var.b;
        int i15 = c1Var.a;
        long clientUserId = UserConfig.getInstance(i15).getClientUserId();
        long j12 = o0Var2.f;
        if (j12 == clientUserId && !c1Var.c) {
            c1Var.c = true;
            String string = MessagesController.getMainSettings(i15).getString("qrShareTheme", null);
            if (!TextUtils.isEmpty(string)) {
                try {
                    SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
                    TLRPC.ShareTheme TLdeserialize = TLRPC.ShareTheme.TLdeserialize(serializedData, serializedData.readInt32(false), false);
                    serializedData.cleanup();
                    shareTheme = TLdeserialize;
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            if (shareTheme != null) {
                longSparseArray.put(j12, shareTheme);
            }
        }
        TLRPC.ShareTheme shareTheme2 = (TLRPC.ShareTheme) longSparseArray.get(j12);
        if (shareTheme2 != null) {
            b1Var2.setInstantTheme(true);
            p0Var2.a(shareTheme2);
            b1Var2.setInstantTheme(false);
        }
        boolean z12 = o0Var2.g;
        b1Var2.setThemeEditable(z12);
        if (z12) {
            b1Var2.setGiftsOwner(j12);
        }
        if (o0Var2.e) {
            NotificationCenter.getInstance(i14).addObserver(p0Var2, NotificationCenter.privacyRulesUpdated);
            if (z11) {
                TLRPC.TL_exportedContactToken cachedContactToken2 = MessagesController.getInstance(i14).getCachedContactToken();
                p0Var2.r = cachedContactToken2;
                if (cachedContactToken2 == null) {
                    p0Var2.s = SystemClock.elapsedRealtime();
                    MessagesController.getInstance(p0Var2.a).requestContactToken(new m(p0Var2, 3));
                } else {
                    b1Var2.setLinkExpires(cachedContactToken2.expires);
                }
            }
            p0Var2.k();
            p0Var2.e();
            p0Var2.j();
        } else {
            b1Var2.setFeeStars(0L);
            p0Var2.e();
        }
        this.f.postDelayed(this.F, Math.max(500, Math.round(e1.b[51]) + 1100));
        return this.f;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void e0() {
        k0 k0Var;
        if (this.j0 || (k0Var = this.h) == null) {
            return;
        }
        w tabs = k0Var.getTabs();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(872415231);
        gradientDrawable.setCornerRadius(AndroidUtilities.dp(20.0f));
        float[] fArr = e1.a[0];
        int ceil = (int) Math.ceil(AndroidUtilities.dpf2(Math.max(0.0f, -fArr[8]) + fArr[4]));
        int i10 = ceil - 3;
        this.T = Math.max(0, i10);
        this.U = Math.max(0, i10);
        this.V = Math.max(0, ceil - 4);
        tabs.a = new org.telegram.ui.web.c0(25, this, tabs);
        tabs.b = new e0(this);
        int paddingLeft = tabs.getPaddingLeft();
        int paddingTop = tabs.getPaddingTop();
        int paddingRight = tabs.getPaddingRight();
        int paddingBottom = tabs.getPaddingBottom();
        int i11 = this.T;
        tabs.setBackground(new InsetDrawable((Drawable) gradientDrawable, i11, this.U, i11, this.V));
        tabs.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        tabs.setOutlineProvider(new l0(this, 1));
        tabs.setClipToOutline(true);
        if (tabs.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) tabs.getLayoutParams();
            int dp = AndroidUtilities.dp(10.0f);
            int dp2 = AndroidUtilities.dp(2.0f);
            if (marginLayoutParams.leftMargin != dp || marginLayoutParams.rightMargin != dp || marginLayoutParams.topMargin != dp2) {
                marginLayoutParams.leftMargin = dp;
                marginLayoutParams.rightMargin = dp;
                marginLayoutParams.topMargin = dp2;
                tabs.setLayoutParams(marginLayoutParams);
            }
        }
        s grid = this.h.getGrid();
        this.j0 = true;
        grid.W2 = new f0(this, grid, tabs);
        grid.V2 = new g0(this, grid);
        c cVar = this.x;
        if (cVar.T != grid) {
            cVar.T = grid;
            grid.setVerticalScrollBarEnabled(false);
            grid.j(new kv(cVar, 25));
        }
        int dp3 = AndroidUtilities.dp(44.0f);
        this.S = grid;
        grid.setPadding(grid.getPaddingLeft(), dp3, AndroidUtilities.dp(5.0f) + grid.getPaddingRight(), grid.getPaddingBottom());
        f0();
        grid.setClipToPadding(false);
        grid.j(new m3(10, this, tabs));
        tabs.bringToFront();
    }

    public final void f0() {
        b1 b1Var;
        s sVar = this.S;
        if (sVar == null || (b1Var = this.d) == null) {
            return;
        }
        int dp = AndroidUtilities.dp(b1Var.I.isEmpty() ? 12.0f : 73.0f);
        if (sVar.getPaddingBottom() != dp) {
            sVar.setPadding(sVar.getPaddingLeft(), sVar.getPaddingTop(), sVar.getPaddingRight(), dp);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final int getNavigationBarColor() {
        return -16777216;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isLightStatusBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onBackPressed(boolean z10) {
        d0 d0Var = this.E;
        if (d0Var != null) {
            if (z10) {
                d0Var.d();
            }
            return false;
        }
        b1 b1Var = this.d;
        if (b1Var != null) {
            float f7 = b1Var.k1;
            if (f7 > 0.5f || b1Var.f1 > 0.5f) {
                if (z10) {
                    if (f7 > 0.5f) {
                        b1Var.l1 = 0.0f;
                    } else if (b1Var.f1 > 0.5f) {
                        b1Var.g1 = 0.0f;
                    }
                }
                return false;
            }
        }
        return super.onBackPressed(z10);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        b1 b1Var = this.d;
        if (b1Var == null) {
            return null;
        }
        b1Var.setRevealOpening(z10);
        this.d.setReveal(z10 ? 0.0f : 1.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
        ofFloat.addUpdateListener(new i6(this, 29));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat);
        animatorSet.setDuration(z10 ? 860L : 200L);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.addListener(new ah.q0(this, z10, runnable, 15));
        AndroidUtilities.runOnUIThread(new ut0(animatorSet, 4));
        return animatorSet;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        Bundle bundle = this.arguments;
        this.a = bundle != null ? bundle.getLong("user_id") : 0L;
        Bundle bundle2 = this.arguments;
        long j10 = bundle2 != null ? bundle2.getLong("chat_id") : 0L;
        this.b = j10;
        if (this.a == 0 && j10 == 0) {
            this.a = getUserConfig().getClientUserId();
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.g gVar = this.c;
        if (gVar != null) {
            xk0 xk0Var = (xk0) gVar.b;
            if (xk0Var.b.remove(gVar)) {
                xk0Var.a();
            }
            this.c = null;
        }
        FrameLayout frameLayout = this.f;
        if (frameLayout != null) {
            frameLayout.removeCallbacks(this.F);
        }
        d0 d0Var = this.E;
        if (d0Var != null) {
            d0Var.e();
            this.E = null;
        }
        p0 p0Var = this.e;
        if (p0Var != null) {
            p0Var.g();
            this.e = null;
        }
        b1 b1Var = this.d;
        if (b1Var != null) {
            HashMap hashMap = b1Var.u7;
            HashMap hashMap2 = b1Var.t7;
            b1Var.Z1.C(false);
            Bitmap bitmap = b1Var.R2;
            if (bitmap != null) {
                bitmap.recycle();
                b1Var.R2 = null;
            }
            uj0 uj0Var = b1Var.K8;
            if (uj0Var != null) {
                uj0Var.C(false);
                b1Var.K8 = null;
            }
            uj0 uj0Var2 = b1Var.V7;
            if (uj0Var2 != null) {
                uj0Var2.C(false);
                b1Var.V7 = null;
            }
            r5 r5Var = b1Var.U7;
            if (r5Var != null) {
                r5Var.o(b1Var);
                b1Var.U7 = null;
                b1Var.W7 = 0L;
            }
            b1Var.I0(b1Var.F);
            b1Var.I0(b1Var.G);
            b1Var.removeCallbacks(b1Var.Z8);
            x9 x9Var = b1Var.i2;
            if (x9Var != null) {
                x9Var.f();
            }
            VelocityTracker velocityTracker = b1Var.k0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                b1Var.k0 = null;
            }
            VelocityTracker velocityTracker2 = b1Var.W8;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                b1Var.W8 = null;
            }
            Iterator it = hashMap2.values().iterator();
            while (it.hasNext()) {
                ((r5) it.next()).o(b1Var);
            }
            for (Drawable drawable : b1Var.J.values()) {
                if (drawable instanceof r5) {
                    ((r5) drawable).o(b1Var);
                }
            }
            hashMap2.clear();
            Iterator it2 = hashMap.values().iterator();
            while (it2.hasNext()) {
                p5 p5Var = ((a1) it2.next()).a;
                if (p5Var != null) {
                    p5Var.b();
                }
            }
            hashMap.clear();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onPause() {
        super.onPause();
        d0 d0Var = this.E;
        if (d0Var != null) {
            d0Var.e();
            d0 d0Var2 = this.E;
            FrameLayout frameLayout = this.f;
            if (frameLayout != null) {
                frameLayout.removeView(d0Var2);
            }
            if (this.E == d0Var2) {
                this.E = null;
            }
            b1 b1Var = this.d;
            if (b1Var != null) {
                b1Var.setScanHidden(false);
            }
        }
        Activity parentActivity = getParentActivity();
        if (parentActivity == null || Build.VERSION.SDK_INT < 29 || this.k0 == null) {
            return;
        }
        parentActivity.getWindow().setNavigationBarContrastEnforced(this.k0.booleanValue());
        this.k0 = null;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        if (i10 == 4) {
            boolean z10 = iArr.length > 0 && iArr[0] == 0;
            if (this.y && z10) {
                this.y = false;
                b0();
            }
            this.y = false;
            return;
        }
        if (getParentActivity() == null || i10 != 34) {
            return;
        }
        if (iArr.length > 0 && iArr[0] == 0) {
            Z();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new e0(this));
        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
        alertDialog$Builder.m(R.raw.permission_request_camera, 72, h6.x0(null, h6.L5, false), null);
        alertDialog$Builder.o();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        V();
        if (getParentActivity() != null) {
            AndroidUtilities.setLightNavigationBar(getParentActivity(), false);
        }
    }
}
