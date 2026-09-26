package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public class w21 extends org.telegram.ui.ActionBar.m2 {
    public static final a0.f R;
    public static List S;
    public static boolean T;
    public q21 E;
    public org.telegram.ui.Components.lj0 F;
    public ImageView G;
    public Bitmap H;
    public Bitmap I;
    public org.telegram.ui.ActionBar.b4 J;
    public boolean K;
    public long L;
    public long M;
    public int N;
    public int O;
    public boolean P;
    public i0.b Q;
    public final o0.a a;
    public final org.telegram.ui.ActionBar.b4 b;
    public final Rect c;
    public final a0.f d;
    public int[] e;
    public v21 f;
    public org.telegram.ui.Components.mc0 h;
    public org.telegram.ui.Components.mc0 n;
    public org.telegram.ui.Components.mc0 r;
    public ValueAnimator s;
    public ValueAnimator v;
    public n50 w;
    public ci.m6 x;
    public org.telegram.ui.Components.w9 y;

    static {
        a0.f fVar = new a0.f(0);
        R = fVar;
        fVar.put("🏠d", new int[]{-9324972, -13856649, -6636738, -9915042});
        fVar.put("🐥d", new int[]{-12344463, -7684788, -6442695, -8013488});
        fVar.put("⛄d", new int[]{-10051073, -10897938, -12469550, -7694337});
        fVar.put("💎d", new int[]{-11429643, -11814958, -5408261, -2128185});
        fVar.put("👨\u200d🏫d", new int[]{-6637227, -12015466, -13198627, -10631557});
        fVar.put("🌷d", new int[]{-1146812, -1991901, -1745517, -3443241});
        fVar.put("💜d", new int[]{-1156738, -1876046, -5412366, -28073});
        fVar.put("🎄d", new int[]{-1281978, -551386, -1870308, -742870});
        fVar.put("🎮d", new int[]{-15092782, -2333964, -1684365, -1269214});
        fVar.put("🏠n", new int[]{-15368239, -11899662, -15173939, -13850930});
        fVar.put("🐥n", new int[]{-11033320, -14780848, -9594089, -12604587});
        fVar.put("⛄n", new int[]{-13930790, -13665098, -14833975, -9732865});
        fVar.put("💎n", new int[]{-5089608, -9481473, -14378302, -13337899});
        fVar.put("👨\u200d🏫n", new int[]{-14447768, -9199261, -15356801, -15823723});
        fVar.put("🌷n", new int[]{-2534316, -2984177, -3258783, -5480504});
        fVar.put("💜n", new int[]{-3123030, -2067394, -2599576, -6067757});
        fVar.put("🎄n", new int[]{-2725857, -3242459, -3248848, -3569123});
        fVar.put("🎮n", new int[]{-3718333, -1278154, -16338695, -6076417});
        T = true;
    }

    public w21(Bundle bundle) {
        super(bundle);
        this.a = new o0.a(this);
        org.telegram.ui.ActionBar.b4 b4Var = new org.telegram.ui.ActionBar.b4(this.currentAccount);
        b4Var.e = "🏠";
        b4Var.c = fg.b.d("🏠");
        b4Var.d = TLRPC.ChatTheme.ofEmoticon(b4Var.e);
        org.telegram.ui.ActionBar.a4 a4Var = new org.telegram.ui.ActionBar.a4();
        a4Var.a = org.telegram.ui.ActionBar.h6.N0("Blue");
        a4Var.e = 99;
        b4Var.f.add(a4Var);
        org.telegram.ui.ActionBar.a4 a4Var2 = new org.telegram.ui.ActionBar.a4();
        a4Var2.a = org.telegram.ui.ActionBar.h6.N0("Dark Blue");
        a4Var2.e = 0;
        b4Var.f.add(a4Var2);
        this.b = b4Var;
        this.c = new Rect();
        this.d = new a0.f(0);
        this.e = null;
        this.h = new org.telegram.ui.Components.mc0();
        this.J = b4Var;
        this.O = -1;
        this.Q = i0.b.e;
    }

    public static /* synthetic */ void U(w21 w21Var) {
        if (w21Var.getParentActivity() == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 23 || w21Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
            f0(w21Var);
        } else {
            w21Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
        }
    }

    public static /* synthetic */ void V(w21 w21Var) {
        T = false;
        List list = S;
        if (list == null || list.isEmpty()) {
            ChatThemeController.getInstance(w21Var.currentAccount).requestAllChatThemes(new k21(w21Var), true);
        } else {
            w21Var.c0(S);
        }
    }

    public static void W(w21 w21Var, boolean z10, org.telegram.ui.ActionBar.b4 b4Var, org.telegram.ui.ActionBar.a5 a5Var) {
        o0.a aVar = w21Var.a;
        if (z10) {
            aVar.b = b4Var.b(((w21) aVar.c).currentAccount, w21Var.K ? 1 : 0);
        } else {
            aVar.b = w21Var.J.b(((w21) aVar.c).currentAccount, w21Var.K ? 1 : 0);
        }
        a5Var.h = new h21(w21Var, 3);
        ((ActionBarLayout) w21Var.parentLayout).f(a5Var, null);
        LinearLayout linearLayout = w21Var.f.v;
        if (linearLayout != null) {
            linearLayout.setBackground(org.telegram.ui.ActionBar.w5.d(new float[]{6.0f}, 0, i0.a.k(org.telegram.ui.ActionBar.w5.b(w21Var.getThemedColor(org.telegram.ui.ActionBar.h6.Oh)), 25)));
        }
    }

    public static /* synthetic */ void X(w21 w21Var) {
        w21Var.b.n(w21Var.currentAccount);
        View view = w21Var.fragmentView;
        if (view == null) {
            return;
        }
        view.postDelayed(new h21(w21Var, 1), 17L);
    }

    public static void f0(org.telegram.ui.ActionBar.m2 m2Var) {
        u9.e0(m2Var.getParentActivity(), 1, new m21(m2Var.getCurrentAccount(), m2Var));
    }

    public final Bitmap b0(org.telegram.ui.ActionBar.b4 b4Var, boolean z10) {
        if (!z10) {
            return this.H;
        }
        String str = b4Var.e;
        a0.f fVar = this.d;
        Bitmap bitmap = (Bitmap) fVar.get(str);
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(this.H.getWidth(), this.H.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap);
            int[] iArr = (int[]) R.get(b4Var.e + "n");
            if (iArr != null) {
                if (this.r == null) {
                    this.r = new org.telegram.ui.Components.mc0(true, 0, 0, 0, 0);
                }
                this.r.n(iArr[0], iArr[1], iArr[2], iArr[3]);
                this.r.setBounds(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), canvas.getWidth() - AndroidUtilities.dp(6.0f), canvas.getHeight() - AndroidUtilities.dp(6.0f));
                this.r.draw(canvas);
            }
            canvas.drawBitmap(this.H, 0.0f, 0.0f, (Paint) null);
            canvas.setBitmap(null);
            fVar.put(b4Var.e, bitmap);
        }
        return bitmap;
    }

    public final void c0(List list) {
        if (list == null || list.isEmpty() || this.f == null) {
            return;
        }
        list.set(0, this.b);
        ArrayList arrayList = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            org.telegram.ui.ActionBar.b4 b4Var = (org.telegram.ui.ActionBar.b4) list.get(i10);
            b4Var.n(this.currentAccount);
            org.telegram.ui.Components.mp mpVar = new org.telegram.ui.Components.mp(b4Var);
            boolean z10 = this.K;
            mpVar.c = z10 ? 1 : 0;
            mpVar.e = b0(b4Var, z10);
            arrayList.add(mpVar);
        }
        org.telegram.ui.Components.lp lpVar = this.f.b;
        lpVar.d = arrayList;
        lpVar.l();
        int i11 = 0;
        while (true) {
            if (i11 == arrayList.size()) {
                i11 = -1;
                break;
            } else {
                if (fg.b.a(((org.telegram.ui.Components.mp) arrayList.get(i11)).a.c, this.J.c)) {
                    this.f.K = (org.telegram.ui.Components.mp) arrayList.get(i11);
                    break;
                }
                i11++;
            }
        }
        if (i11 != -1) {
            this.f.b(i11);
        }
        v21 v21Var = this.f;
        t21 t21Var = v21Var.F;
        t21Var.setAlpha(0.0f);
        t21Var.animate().alpha(1.0f).setDuration(150L).start();
        t21Var.setVisibility(0);
        org.telegram.ui.Components.u00 u00Var = v21Var.r;
        u00Var.animate().alpha(0.0f).setListener(new org.telegram.ui.Components.ca(u00Var)).setDuration(150L).start();
        org.telegram.ui.Components.wl0 wl0Var = v21Var.y;
        wl0Var.setAlpha(0.0f);
        wl0Var.animate().alpha(1.0f).setDuration(150L).start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x00c0, code lost:
    
        if (r12 != 1) goto L46;
     */
    @Override // org.telegram.ui.ActionBar.m2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        long j3;
        String str;
        String str2;
        ImageLocation imageLocation;
        ImageLocation imageLocation2;
        org.telegram.ui.Components.h9 h9Var;
        boolean z10;
        boolean z11;
        TLRPC.Chat chat;
        ImageLocation imageLocation3;
        org.telegram.ui.Components.h9 h9Var2;
        ImageLocation imageLocation4;
        char c10;
        String str3;
        final int i10 = 1;
        setHasOwnBackground(true);
        this.K = org.telegram.ui.ActionBar.h6.I.q();
        final int i11 = 0;
        this.actionBar.setAddToContainer(false);
        this.actionBar.setBackground(null);
        this.actionBar.B(-1, false);
        org.telegram.ui.ActionBar.p0 p0Var = new org.telegram.ui.ActionBar.p0(this, context, 2);
        n50 n50Var = new n50(this, context, 7);
        this.w = n50Var;
        p0Var.addView(n50Var);
        if (this.L != 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.L));
            if (user != null) {
                str = UserObject.getPublicUsername(user);
                if (str == null) {
                    str2 = UserObject.getUserName(user);
                    ArrayList<TLRPC.PrivacyRule> privacyRules = ContactsController.getInstance(this.currentAccount).getPrivacyRules(6);
                    if (privacyRules == null) {
                        j3 = 0;
                    } else {
                        j3 = 0;
                        for (int i12 = 0; i12 < privacyRules.size(); i12++) {
                            TLRPC.PrivacyRule privacyRule = privacyRules.get(i12);
                            if (privacyRule instanceof TLRPC.TL_privacyValueAllowAll) {
                                c10 = 0;
                                break;
                            }
                            if (privacyRule instanceof TLRPC.TL_privacyValueDisallowAll) {
                                break;
                            }
                            if (privacyRule instanceof TLRPC.TL_privacyValueAllowContacts) {
                                c10 = 1;
                                break;
                            }
                        }
                        c10 = 2;
                        if (c10 == 2) {
                            ArrayList<TLRPC.PrivacyRule> privacyRules2 = ContactsController.getInstance(this.currentAccount).getPrivacyRules(7);
                            if (privacyRules2 != null && privacyRules2.size() != 0) {
                                for (int i13 = 0; i13 < privacyRules2.size(); i13++) {
                                    TLRPC.PrivacyRule privacyRule2 = privacyRules2.get(i13);
                                    if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowAll) {
                                        break;
                                    }
                                    if ((privacyRule2 instanceof TLRPC.TL_privacyValueDisallowAll) || (privacyRule2 instanceof TLRPC.TL_privacyValueAllowContacts)) {
                                        break;
                                    }
                                }
                            }
                            str3 = user.phone;
                            if (str3 != null && !str3.startsWith("+")) {
                                str3 = "+".concat(str3);
                            }
                            str = str3;
                            z10 = true;
                        }
                        if (c10 != 0) {
                        }
                        str3 = user.phone;
                        if (str3 != null) {
                            str3 = "+".concat(str3);
                        }
                        str = str3;
                        z10 = true;
                    }
                    z10 = false;
                    z11 = true;
                    h9Var2 = new org.telegram.ui.Components.h9(0, user);
                    imageLocation4 = ImageLocation.getForUser(this.currentAccount, user, 1);
                    imageLocation3 = ImageLocation.getForUser(this.currentAccount, user, 0);
                } else {
                    j3 = 0;
                    str2 = null;
                    z10 = false;
                }
                z11 = false;
                h9Var2 = new org.telegram.ui.Components.h9(0, user);
                imageLocation4 = ImageLocation.getForUser(this.currentAccount, user, 1);
                imageLocation3 = ImageLocation.getForUser(this.currentAccount, user, 0);
            } else {
                j3 = 0;
                imageLocation3 = null;
                str = null;
                str2 = null;
                h9Var2 = null;
                imageLocation4 = null;
                z10 = false;
                z11 = false;
            }
            imageLocation = imageLocation3;
            h9Var = h9Var2;
            imageLocation2 = imageLocation4;
        } else {
            j3 = 0;
            if (this.M == 0 || (chat = getMessagesController().getChat(Long.valueOf(this.M))) == null) {
                str = null;
                str2 = null;
                imageLocation = null;
                imageLocation2 = null;
                h9Var = null;
            } else {
                str = ChatObject.getPublicUsername(chat);
                org.telegram.ui.Components.h9 h9Var3 = new org.telegram.ui.Components.h9(chat);
                ImageLocation forChat = ImageLocation.getForChat(this.currentAccount, chat, 1);
                str2 = null;
                imageLocation = ImageLocation.getForChat(this.currentAccount, chat, 0);
                h9Var = h9Var3;
                imageLocation2 = forChat;
            }
            z10 = false;
            z11 = false;
        }
        q21 q21Var = new q21(context);
        this.E = q21Var;
        q21Var.a.n(-9324972, -13856649, -6636738, -9915042);
        q21Var.invalidate();
        String r10 = str != null ? a4.a.r(MessagesController.getInstance(this.currentAccount).linkPrefix, "/", str, new StringBuilder("https://")) : null;
        q21 q21Var2 = this.E;
        if (str2 != null) {
            str = str2;
        }
        q21Var2.c(r10, str, z10, z11);
        q21 q21Var3 = this.E;
        q21Var3.e = new g21(this);
        p0Var.addView(q21Var3);
        org.telegram.ui.Components.lj0 lj0Var = new org.telegram.ui.Components.lj0(context);
        this.F = lj0Var;
        lj0Var.setAutoRepeat(true);
        this.F.f(R.raw.plane_logo_plain, 60, 60, null);
        this.F.d();
        p0Var.addView(this.F);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.y = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(42.0f));
        this.y.s(AndroidUtilities.dp(84.0f), AndroidUtilities.dp(84.0f));
        p0Var.addView(this.y, w7.y5.e(84, 84, 51));
        this.y.m(imageLocation, "84_84", imageLocation2, "50_50", h9Var, null, 0, null);
        ImageView imageView = new ImageView(context);
        this.G = imageView;
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        this.G.setBackground(org.telegram.ui.ActionBar.h6.h0(AndroidUtilities.dp(34.0f), 671088640, 687865855));
        this.G.setImageResource(R.drawable.ic_ab_back);
        this.G.setScaleType(ImageView.ScaleType.CENTER);
        this.G.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.j21
            public final /* synthetic */ w21 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.b.finishFragment();
                        break;
                    case 1:
                        w21 w21Var = this.b;
                        w21Var.f.s.setClickable(false);
                        w21Var.g0();
                        break;
                    default:
                        w21.U(this.b);
                        break;
                }
            }
        });
        p0Var.addView(this.G, w7.y5.c(34.0f, 34));
        this.H = Bitmap.createBitmap(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.H);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, this.H.getWidth(), this.H.getHeight());
        Paint paint = new Paint(1);
        paint.setColor(-1);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        canvas.drawBitmap(BitmapFactory.decodeResource(ApplicationLoader.applicationContext.getResources(), R.drawable.msg_qr_mini), (this.H.getWidth() - r6.getWidth()) * 0.5f, (this.H.getHeight() - r6.getHeight()) * 0.5f, paint);
        canvas.setBitmap(null);
        v21 v21Var = new v21(this, this, getParentActivity().getWindow());
        this.f = v21Var;
        this.x = v21Var.h;
        ChatThemeController chatThemeController = ChatThemeController.getInstance(this.currentAccount);
        chatThemeController.preloadAllWallpaperThumbs(true);
        chatThemeController.preloadAllWallpaperThumbs(false);
        chatThemeController.preloadAllWallpaperImages(true);
        chatThemeController.preloadAllWallpaperImages(false);
        NotificationCenter.getGlobalInstance().addObserver(v21Var, NotificationCenter.emojiLoaded);
        v21 v21Var2 = this.f;
        v21Var2.J = new g21(this);
        v21Var2.n.setText(LocaleController.getString(R.string.QrCode));
        this.f.r.setViewType(17);
        this.f.s.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.j21
            public final /* synthetic */ w21 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.b.finishFragment();
                        break;
                    case 1:
                        w21 w21Var = this.b;
                        w21Var.f.s.setClickable(false);
                        w21Var.g0();
                        break;
                    default:
                        w21.U(this.b);
                        break;
                }
            }
        });
        LinearLayout linearLayout = this.f.v;
        if (linearLayout != null) {
            final int i14 = 2;
            linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.j21
                public final /* synthetic */ w21 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i14) {
                        case 0:
                            this.b.finishFragment();
                            break;
                        case 1:
                            w21 w21Var = this.b;
                            w21Var.f.s.setClickable(false);
                            w21Var.g0();
                            break;
                        default:
                            w21.U(this.b);
                            break;
                    }
                }
            });
        }
        p0Var.addView(this.x, w7.y5.e(-1, -2, 80));
        this.h.N = true;
        this.fragmentView = p0Var;
        Utilities.themeQueue.postRunnable(new h21(this, 4), 25L);
        this.fragmentView.postDelayed(new h21(this, 5), T ? 250L : j3);
        this.N = getParentActivity().getWindow().getDecorView().getSystemUiVisibility();
        if (getParentActivity() != null) {
            getParentActivity().getWindow().getDecorView().setSystemUiVisibility(this.N | 1028);
        }
        View view = this.fragmentView;
        g21 g21Var = new g21(this);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.j(view, g21Var);
        return this.fragmentView;
    }

    public final void d0(int i10, org.telegram.ui.ActionBar.b4 b4Var, boolean z10) {
        float f7;
        this.O = i10;
        org.telegram.ui.ActionBar.b4 b4Var2 = this.J;
        final boolean z11 = this.K;
        this.J = b4Var;
        org.telegram.ui.ActionBar.a4 a4Var = (org.telegram.ui.ActionBar.a4) b4Var.f.get(z11 ? 1 : 0);
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            f7 = Math.max(0.5f, 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue()) * 1.0f;
            this.s.cancel();
        } else {
            f7 = 1.0f;
        }
        org.telegram.ui.Components.mc0 mc0Var = this.h;
        this.n = mc0Var;
        mc0Var.q(false);
        this.n.setAlpha(255);
        org.telegram.ui.Components.mc0 mc0Var2 = new org.telegram.ui.Components.mc0();
        this.h = mc0Var2;
        mc0Var2.setCallback(this.w);
        this.h.n(a4Var.k, a4Var.l, a4Var.m, a4Var.n);
        this.h.r(this.w);
        this.h.s(1.0f);
        org.telegram.ui.Components.mc0 mc0Var3 = this.h;
        mc0Var3.N = true;
        org.telegram.ui.Components.mc0 mc0Var4 = this.n;
        if (mc0Var4 != null) {
            mc0Var3.h = mc0Var4.h;
        }
        this.E.a.h = mc0Var3.h;
        TLRPC.WallPaper k10 = this.J.k(z11 ? 1 : 0);
        int i11 = 2;
        if (k10 != null) {
            org.telegram.ui.Components.mc0 mc0Var5 = this.h;
            mc0Var5.t(mc0Var5.u, k10.settings.intensity);
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            this.J.o(z11 ? 1 : 0, new ResultCallback() { // from class: org.telegram.ui.i21
                @Override // org.telegram.tgnet.ResultCallback
                public final void onComplete(Object obj) {
                    Pair pair = (Pair) obj;
                    w21 w21Var = w21.this;
                    long i12 = w21Var.J.i(z11 ? 1 : 0);
                    if (pair == null || i12 == 0) {
                        return;
                    }
                    long longValue = ((Long) pair.first).longValue();
                    Bitmap bitmap = ((dg.a) pair.second).b;
                    if (longValue != i12 || bitmap == null) {
                        return;
                    }
                    w21Var.e0(w21Var.h.q, bitmap, SystemClock.elapsedRealtime() - elapsedRealtime > 150);
                }

                @Override // org.telegram.tgnet.ResultCallback
                public final /* synthetic */ void onError(Throwable th2) {
                    org.telegram.tgnet.l.a(this, th2);
                }

                @Override // org.telegram.tgnet.ResultCallback
                public final /* synthetic */ void onError(TLRPC.TL_error tL_error) {
                    org.telegram.tgnet.l.b(this, tL_error);
                }
            });
        } else {
            Utilities.themeQueue.postRunnable(new h21(this, i11), 35L);
        }
        org.telegram.ui.Components.mc0 mc0Var6 = this.h;
        mc0Var6.u(mc0Var6.f());
        a0.f fVar = R;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b4Var.e);
        sb2.append(z11 ? "n" : "d");
        int[] iArr = (int[]) fVar.get(sb2.toString());
        if (z10) {
            if (this.e == null) {
                int[] iArr2 = new int[4];
                this.e = iArr2;
                System.arraycopy(iArr, 0, iArr2, 0, 4);
            }
            this.h.setAlpha(255);
            org.telegram.ui.Components.mc0 mc0Var7 = this.h;
            mc0Var7.K = 0.0f;
            mc0Var7.i();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.s = ofFloat;
            ofFloat.addUpdateListener(new ai.x(23, this, iArr));
            this.s.addListener(new org.telegram.ui.Components.al0(12, this, iArr));
            this.s.setDuration((int) (f7 * 250.0f));
            this.s.start();
        } else {
            if (iArr != null) {
                q21 q21Var = this.E;
                q21Var.a.n(iArr[0], iArr[1], iArr[2], iArr[3]);
                q21Var.invalidate();
                System.arraycopy(iArr, 0, this.e, 0, 4);
            }
            this.n = null;
            this.w.invalidate();
        }
        org.telegram.ui.ActionBar.a5 a5Var = new org.telegram.ui.ActionBar.a5(null, (this.K ? org.telegram.ui.ActionBar.h6.J : org.telegram.ui.ActionBar.h6.A0()).Y, this.K, !z10);
        a5Var.f = false;
        a5Var.e = true;
        a5Var.m = this.a;
        a5Var.l = (int) (f7 * 250.0f);
        AndroidUtilities.runOnUIThread(new ai.s4(this, z10, b4Var2, a5Var, 28));
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void e0(int i10, Bitmap bitmap, boolean z10) {
        if (bitmap != null) {
            this.h.t(bitmap, i10);
            ValueAnimator valueAnimator = this.v;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (!z10) {
                this.h.s(1.0f);
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.v = ofFloat;
            ofFloat.addUpdateListener(new q11(this, 2));
            this.v.setDuration(250L);
            this.v.start();
        }
    }

    public final void g0() {
        Point point = AndroidUtilities.displaySize;
        int min = Math.min(point.x, point.y);
        Point point2 = AndroidUtilities.displaySize;
        int max = Math.max(point2.x, point2.y);
        float f7 = min;
        if ((max * 1.0f) / f7 > 1.92f) {
            max = (int) (f7 * 1.92f);
        }
        Bitmap createBitmap = Bitmap.createBitmap(min, max, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        this.x.setVisibility(8);
        this.G.setVisibility(8);
        this.F.setVisibility(8);
        this.F.getAnimatedDrawable();
        q21 q21Var = this.E;
        if (q21Var != null) {
            q21Var.d(true);
        }
        this.fragmentView.measure(View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30));
        this.fragmentView.layout(0, 0, min, max);
        this.fragmentView.draw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(this.F.getLeft(), this.F.getTop(), this.F.getRight(), this.F.getBottom());
        if (this.I != null) {
            canvas.drawBitmap(this.I, (Rect) null, rectF, new Paint(2));
        }
        canvas.setBitmap(null);
        this.x.setVisibility(0);
        this.G.setVisibility(0);
        this.F.setVisibility(0);
        ViewGroup viewGroup = (ViewGroup) this.fragmentView.getParent();
        this.fragmentView.layout(0, 0, viewGroup.getWidth(), viewGroup.getHeight());
        q21 q21Var2 = this.E;
        if (q21Var2 != null) {
            q21Var2.d(false);
        }
        Uri bitmapShareUri = AndroidUtilities.getBitmapShareUri(createBitmap, "qr_tmp.jpg", Bitmap.CompressFormat.JPEG);
        if (bitmapShareUri != null) {
            try {
                getParentActivity().startActivityForResult(Intent.createChooser(new Intent("android.intent.action.SEND").setType("image/*").putExtra("android.intent.extra.STREAM", bitmapShareUri), LocaleController.getString(R.string.InviteByQRCode)), 500);
            } catch (ActivityNotFoundException e) {
                e.printStackTrace();
            }
        }
        AndroidUtilities.runOnUIThread(new h21(this, 0), 500L);
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final org.telegram.ui.ActionBar.y3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.y3.c;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final org.telegram.ui.ActionBar.d6 getResourceProvider() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final ArrayList getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.j6> themeDescriptions = super.getThemeDescriptions();
        v21 v21Var = this.f;
        v21Var.getClass();
        u21 u21Var = new u21(v21Var);
        ArrayList arrayList = new ArrayList();
        Paint paint = v21Var.a;
        int i10 = org.telegram.ui.ActionBar.h6.h5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 1, null, paint, null, null, i10));
        int i11 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 32, null, null, new Drawable[]{v21Var.f}, u21Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(v21Var.n, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.j5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(v21Var.y, 16, new Class[]{org.telegram.ui.Components.h21.class}, null, null, null, org.telegram.ui.ActionBar.h6.i5));
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            ((org.telegram.ui.ActionBar.j6) obj).o = v21Var.d.a;
        }
        themeDescriptions.addAll(arrayList);
        oy0 oy0Var = new oy0(3, this);
        TextView textView = this.f.s;
        int i13 = org.telegram.ui.ActionBar.h6.Oh;
        themeDescriptions.add(new org.telegram.ui.ActionBar.j6(textView, 32, null, null, null, oy0Var, i13));
        themeDescriptions.add(new org.telegram.ui.ActionBar.j6(this.f.s, 65568, null, null, null, null, org.telegram.ui.ActionBar.h6.Qh));
        TextView textView2 = this.f.w;
        if (textView2 != null) {
            themeDescriptions.add(new org.telegram.ui.ActionBar.j6(textView2, 4, null, null, null, oy0Var, i13));
            themeDescriptions.add(new org.telegram.ui.ActionBar.j6(this.f.x, 8, null, null, null, oy0Var, i13));
        }
        int size2 = themeDescriptions.size();
        while (i11 < size2) {
            org.telegram.ui.ActionBar.j6 j6Var = themeDescriptions.get(i11);
            i11++;
            j6Var.o = this.a;
        }
        return themeDescriptions;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean onFragmentCreate() {
        this.L = this.arguments.getLong("user_id");
        this.M = this.arguments.getLong("chat_id");
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onFragmentDestroy() {
        a0.f fVar;
        v21 v21Var = this.f;
        v21Var.getClass();
        NotificationCenter.getGlobalInstance().removeObserver(v21Var, NotificationCenter.emojiLoaded);
        this.f = null;
        this.H.recycle();
        this.H = null;
        int i10 = 0;
        while (true) {
            fVar = this.d;
            if (i10 >= fVar.c) {
                break;
            }
            Bitmap bitmap = (Bitmap) fVar.h(i10);
            if (bitmap != null) {
                bitmap.recycle();
            }
            i10++;
        }
        fVar.clear();
        if (getParentActivity() != null) {
            getParentActivity().getWindow().getDecorView().setSystemUiVisibility(this.N);
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onPause() {
        if (getParentActivity() != null) {
            getParentActivity().getWindow().getDecorView().setSystemUiVisibility(this.N);
        }
        super.onPause();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        if (getParentActivity() != null && i10 == 34) {
            if (iArr.length > 0 && iArr[0] == 0) {
                f0(this);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new g21(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.L5, false), null);
            alertDialog$Builder.o();
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onResume() {
        super.onResume();
        if (getParentActivity() != null) {
            getParentActivity().getWindow().getDecorView().setSystemUiVisibility(this.N | 1028);
        }
    }
}
