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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class z11 extends org.telegram.ui.ActionBar.o2 {
    public static final a0.f N;
    public static List O;
    public static boolean P;
    public u11 A;
    public org.telegram.ui.Components.pi0 B;
    public ImageView C;
    public Bitmap D;
    public Bitmap E;
    public org.telegram.ui.ActionBar.b4 F;
    public boolean G;
    public long H;
    public long I;
    public int J;
    public int K;
    public boolean L;
    public i0.b M;
    public final org.telegram.ui.Cells.e3 a;
    public final org.telegram.ui.ActionBar.b4 b;
    public final Rect c;
    public final a0.f d;
    public int[] e;
    public y11 f;
    public org.telegram.ui.Components.jb0 h;
    public org.telegram.ui.Components.jb0 n;
    public org.telegram.ui.Components.jb0 r;
    public ValueAnimator s;
    public ValueAnimator v;
    public yi0 w;
    public fh.v x;
    public org.telegram.ui.Components.o9 y;

    static {
        a0.f fVar = new a0.f(0);
        N = fVar;
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
        P = true;
    }

    public z11(Bundle bundle) {
        super(bundle);
        this.a = new org.telegram.ui.Cells.e3(this);
        org.telegram.ui.ActionBar.b4 b4Var = new org.telegram.ui.ActionBar.b4(this.currentAccount);
        b4Var.e = "🏠";
        b4Var.c = nf.b.d("🏠");
        b4Var.d = TLRPC.ChatTheme.ofEmoticon(b4Var.e);
        org.telegram.ui.ActionBar.a4 a4Var = new org.telegram.ui.ActionBar.a4();
        a4Var.a = org.telegram.ui.ActionBar.f6.N0("Blue");
        a4Var.e = 99;
        b4Var.f.add(a4Var);
        org.telegram.ui.ActionBar.a4 a4Var2 = new org.telegram.ui.ActionBar.a4();
        a4Var2.a = org.telegram.ui.ActionBar.f6.N0("Dark Blue");
        a4Var2.e = 0;
        b4Var.f.add(a4Var2);
        this.b = b4Var;
        this.c = new Rect();
        this.d = new a0.f(0);
        this.e = null;
        this.h = new org.telegram.ui.Components.jb0();
        this.F = b4Var;
        this.K = -1;
        this.M = i0.b.e;
    }

    public static /* synthetic */ void T(z11 z11Var) {
        if (z11Var.getParentActivity() == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 23 || z11Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
            e0(z11Var);
        } else {
            z11Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
        }
    }

    public static /* synthetic */ void U(z11 z11Var) {
        P = false;
        List list = O;
        if (list == null || list.isEmpty()) {
            ChatThemeController.getInstance(z11Var.currentAccount).requestAllChatThemes(new p11(z11Var), true);
        } else {
            z11Var.b0(O);
        }
    }

    public static void V(z11 z11Var, boolean z10, org.telegram.ui.ActionBar.b4 b4Var, org.telegram.ui.ActionBar.a5 a5Var) {
        org.telegram.ui.Cells.e3 e3Var = z11Var.a;
        if (z10) {
            e3Var.b = b4Var.b(((z11) e3Var.c).currentAccount, z11Var.G ? 1 : 0);
        } else {
            e3Var.b = z11Var.F.b(((z11) e3Var.c).currentAccount, z11Var.G ? 1 : 0);
        }
        a5Var.h = new m11(z11Var, 3);
        ((ActionBarLayout) z11Var.parentLayout).f(a5Var, null);
        LinearLayout linearLayout = z11Var.f.v;
        if (linearLayout != null) {
            linearLayout.setBackground(org.telegram.ui.ActionBar.v5.d(new float[]{6.0f}, 0, i0.a.k(org.telegram.ui.ActionBar.v5.b(z11Var.getThemedColor(org.telegram.ui.ActionBar.f6.Oh)), 25)));
        }
    }

    public static /* synthetic */ void W(z11 z11Var) {
        z11Var.b.n(z11Var.currentAccount);
        View view = z11Var.fragmentView;
        if (view == null) {
            return;
        }
        view.postDelayed(new m11(z11Var, 1), 17L);
    }

    public static void e0(org.telegram.ui.ActionBar.o2 o2Var) {
        s9.d0(o2Var.getParentActivity(), 1, new q11(o2Var.getCurrentAccount(), o2Var));
    }

    public final Bitmap a0(org.telegram.ui.ActionBar.b4 b4Var, boolean z10) {
        if (!z10) {
            return this.D;
        }
        String str = b4Var.e;
        a0.f fVar = this.d;
        Bitmap bitmap = (Bitmap) fVar.get(str);
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(this.D.getWidth(), this.D.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap);
            int[] iArr = (int[]) N.get(b4Var.e + "n");
            if (iArr != null) {
                if (this.r == null) {
                    this.r = new org.telegram.ui.Components.jb0(true, 0, 0, 0, 0);
                }
                this.r.n(iArr[0], iArr[1], iArr[2], iArr[3]);
                this.r.setBounds(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), canvas.getWidth() - AndroidUtilities.dp(6.0f), canvas.getHeight() - AndroidUtilities.dp(6.0f));
                this.r.draw(canvas);
            }
            canvas.drawBitmap(this.D, 0.0f, 0.0f, (Paint) null);
            canvas.setBitmap(null);
            fVar.put(b4Var.e, bitmap);
        }
        return bitmap;
    }

    public final void b0(List list) {
        if (list == null || list.isEmpty() || this.f == null) {
            return;
        }
        list.set(0, this.b);
        ArrayList arrayList = new ArrayList(list.size());
        for (int i9 = 0; i9 < list.size(); i9++) {
            org.telegram.ui.ActionBar.b4 b4Var = (org.telegram.ui.ActionBar.b4) list.get(i9);
            b4Var.n(this.currentAccount);
            org.telegram.ui.Components.bp bpVar = new org.telegram.ui.Components.bp(b4Var);
            boolean z10 = this.G;
            bpVar.c = z10 ? 1 : 0;
            bpVar.e = a0(b4Var, z10);
            arrayList.add(bpVar);
        }
        org.telegram.ui.Components.ap apVar = this.f.b;
        apVar.d = arrayList;
        apVar.l();
        int i10 = 0;
        while (true) {
            if (i10 == arrayList.size()) {
                i10 = -1;
                break;
            } else {
                if (nf.b.a(((org.telegram.ui.Components.bp) arrayList.get(i10)).a.c, this.F.c)) {
                    this.f.G = (org.telegram.ui.Components.bp) arrayList.get(i10);
                    break;
                }
                i10++;
            }
        }
        if (i10 != -1) {
            this.f.b(i10);
        }
        y11 y11Var = this.f;
        w11 w11Var = y11Var.B;
        w11Var.setAlpha(0.0f);
        w11Var.animate().alpha(1.0f).setDuration(150L).start();
        w11Var.setVisibility(0);
        org.telegram.ui.Components.e00 e00Var = y11Var.r;
        e00Var.animate().alpha(0.0f).setListener(new org.telegram.ui.Components.u9(e00Var)).setDuration(150L).start();
        org.telegram.ui.Components.wk0 wk0Var = y11Var.y;
        wk0Var.setAlpha(0.0f);
        wk0Var.animate().alpha(1.0f).setDuration(150L).start();
    }

    public final void c0(int i9, org.telegram.ui.ActionBar.b4 b4Var, boolean z10) {
        float f10;
        this.K = i9;
        org.telegram.ui.ActionBar.b4 b4Var2 = this.F;
        final boolean z11 = this.G;
        this.F = b4Var;
        org.telegram.ui.ActionBar.a4 a4Var = (org.telegram.ui.ActionBar.a4) b4Var.f.get(z11 ? 1 : 0);
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            f10 = Math.max(0.5f, 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue()) * 1.0f;
            this.s.cancel();
        } else {
            f10 = 1.0f;
        }
        org.telegram.ui.Components.jb0 jb0Var = this.h;
        this.n = jb0Var;
        jb0Var.q(false);
        this.n.setAlpha(255);
        org.telegram.ui.Components.jb0 jb0Var2 = new org.telegram.ui.Components.jb0();
        this.h = jb0Var2;
        jb0Var2.setCallback(this.w);
        this.h.n(a4Var.k, a4Var.l, a4Var.m, a4Var.n);
        this.h.r(this.w);
        this.h.s(1.0f);
        org.telegram.ui.Components.jb0 jb0Var3 = this.h;
        jb0Var3.N = true;
        org.telegram.ui.Components.jb0 jb0Var4 = this.n;
        if (jb0Var4 != null) {
            jb0Var3.h = jb0Var4.h;
        }
        this.A.a.h = jb0Var3.h;
        TLRPC.WallPaper k10 = this.F.k(z11 ? 1 : 0);
        int i10 = 2;
        if (k10 != null) {
            org.telegram.ui.Components.jb0 jb0Var5 = this.h;
            jb0Var5.t(jb0Var5.u, k10.settings.intensity);
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            this.F.o(z11 ? 1 : 0, new ResultCallback() { // from class: org.telegram.ui.n11
                @Override // org.telegram.tgnet.ResultCallback
                public final void onComplete(Object obj) {
                    Pair pair = (Pair) obj;
                    z11 z11Var = z11.this;
                    long i11 = z11Var.F.i(z11 ? 1 : 0);
                    if (pair == null || i11 == 0) {
                        return;
                    }
                    long longValue = ((Long) pair.first).longValue();
                    Bitmap bitmap = ((lf.a) pair.second).b;
                    if (longValue != i11 || bitmap == null) {
                        return;
                    }
                    z11Var.d0(z11Var.h.q, bitmap, SystemClock.elapsedRealtime() - elapsedRealtime > 150);
                }

                @Override // org.telegram.tgnet.ResultCallback
                public final /* synthetic */ void onError(Throwable th) {
                    org.telegram.tgnet.k.a(this, th);
                }

                @Override // org.telegram.tgnet.ResultCallback
                public final /* synthetic */ void onError(TLRPC.TL_error tL_error) {
                    org.telegram.tgnet.k.b(this, tL_error);
                }
            });
        } else {
            Utilities.themeQueue.postRunnable(new m11(this, i10), 35L);
        }
        org.telegram.ui.Components.jb0 jb0Var6 = this.h;
        jb0Var6.u(jb0Var6.f());
        a0.f fVar = N;
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
            org.telegram.ui.Components.jb0 jb0Var7 = this.h;
            jb0Var7.K = 0.0f;
            jb0Var7.i();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.s = ofFloat;
            ofFloat.addUpdateListener(new f2.g(19, this, iArr));
            this.s.addListener(new org.telegram.ui.Components.su0(10, this, iArr));
            this.s.setDuration((int) (f10 * 250.0f));
            this.s.start();
        } else {
            if (iArr != null) {
                u11 u11Var = this.A;
                u11Var.a.n(iArr[0], iArr[1], iArr[2], iArr[3]);
                u11Var.invalidate();
                System.arraycopy(iArr, 0, this.e, 0, 4);
            }
            this.n = null;
            this.w.invalidate();
        }
        org.telegram.ui.ActionBar.a5 a5Var = new org.telegram.ui.ActionBar.a5(null, (this.G ? org.telegram.ui.ActionBar.f6.J : org.telegram.ui.ActionBar.f6.A0()).U, this.G, !z10);
        a5Var.f = false;
        a5Var.e = true;
        a5Var.m = this.a;
        a5Var.l = (int) (f10 * 250.0f);
        AndroidUtilities.runOnUIThread(new bg.d(this, z10, b4Var2, a5Var, 25));
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x00c5, code lost:
    
        if (r9 != 1) goto L47;
     */
    @Override // org.telegram.ui.ActionBar.o2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        long j10;
        String str;
        String str2;
        ImageLocation imageLocation;
        ImageLocation imageLocation2;
        org.telegram.ui.Components.z8 z8Var;
        boolean z10;
        boolean z11;
        TLRPC.Chat chat;
        ImageLocation imageLocation3;
        org.telegram.ui.Components.z8 z8Var2;
        ImageLocation imageLocation4;
        char c10;
        String str3;
        final int i9 = 1;
        setHasOwnBackground(true);
        this.G = org.telegram.ui.ActionBar.f6.I.q();
        final int i10 = 0;
        this.actionBar.setAddToContainer(false);
        this.actionBar.setBackground(null);
        this.actionBar.C(-1, false);
        org.telegram.ui.ActionBar.r0 r0Var = new org.telegram.ui.ActionBar.r0(this, context, 2);
        yi0 yi0Var = new yi0(this, context, 6);
        this.w = yi0Var;
        r0Var.addView(yi0Var);
        long j11 = 0;
        if (this.H != 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.H));
            if (user != null) {
                str = UserObject.getPublicUsername(user);
                if (str == null) {
                    str2 = UserObject.getUserName(user);
                    ArrayList<TLRPC.PrivacyRule> privacyRules = ContactsController.getInstance(this.currentAccount).getPrivacyRules(6);
                    if (privacyRules == null) {
                        j10 = 0;
                    } else {
                        int i11 = 0;
                        while (true) {
                            if (i11 >= privacyRules.size()) {
                                j10 = j11;
                                break;
                            }
                            TLRPC.PrivacyRule privacyRule = privacyRules.get(i11);
                            j10 = j11;
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
                            i11++;
                            j11 = j10;
                        }
                        c10 = 2;
                        if (c10 == 2) {
                            ArrayList<TLRPC.PrivacyRule> privacyRules2 = ContactsController.getInstance(this.currentAccount).getPrivacyRules(7);
                            if (privacyRules2 != null && privacyRules2.size() != 0) {
                                for (int i12 = 0; i12 < privacyRules2.size(); i12++) {
                                    TLRPC.PrivacyRule privacyRule2 = privacyRules2.get(i12);
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
                    z8Var2 = new org.telegram.ui.Components.z8(0, user);
                    imageLocation4 = ImageLocation.getForUser(this.currentAccount, user, 1);
                    imageLocation3 = ImageLocation.getForUser(this.currentAccount, user, 0);
                } else {
                    j10 = 0;
                    str2 = null;
                    z10 = false;
                }
                z11 = false;
                z8Var2 = new org.telegram.ui.Components.z8(0, user);
                imageLocation4 = ImageLocation.getForUser(this.currentAccount, user, 1);
                imageLocation3 = ImageLocation.getForUser(this.currentAccount, user, 0);
            } else {
                j10 = 0;
                imageLocation3 = null;
                str = null;
                str2 = null;
                z8Var2 = null;
                imageLocation4 = null;
                z10 = false;
                z11 = false;
            }
            imageLocation = imageLocation3;
            z8Var = z8Var2;
            imageLocation2 = imageLocation4;
        } else {
            j10 = 0;
            if (this.I == 0 || (chat = getMessagesController().getChat(Long.valueOf(this.I))) == null) {
                str = null;
                str2 = null;
                imageLocation = null;
                imageLocation2 = null;
                z8Var = null;
            } else {
                str = ChatObject.getPublicUsername(chat);
                org.telegram.ui.Components.z8 z8Var3 = new org.telegram.ui.Components.z8(chat);
                ImageLocation forChat = ImageLocation.getForChat(this.currentAccount, chat, 1);
                str2 = null;
                imageLocation = ImageLocation.getForChat(this.currentAccount, chat, 0);
                z8Var = z8Var3;
                imageLocation2 = forChat;
            }
            z10 = false;
            z11 = false;
        }
        u11 u11Var = new u11(context);
        this.A = u11Var;
        u11Var.a.n(-9324972, -13856649, -6636738, -9915042);
        u11Var.invalidate();
        String p6 = str != null ? aa.d.p(MessagesController.getInstance(this.currentAccount).linkPrefix, "/", str, new StringBuilder("https://")) : null;
        u11 u11Var2 = this.A;
        if (str2 != null) {
            str = str2;
        }
        u11Var2.c(p6, str, z10, z11);
        u11 u11Var3 = this.A;
        u11Var3.e = new l11(this);
        r0Var.addView(u11Var3);
        org.telegram.ui.Components.pi0 pi0Var = new org.telegram.ui.Components.pi0(context);
        this.B = pi0Var;
        pi0Var.setAutoRepeat(true);
        this.B.f(R.raw.plane_logo_plain, 60, 60, null);
        this.B.d();
        r0Var.addView(this.B);
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        this.y = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(42.0f));
        this.y.s(AndroidUtilities.dp(84.0f), AndroidUtilities.dp(84.0f));
        r0Var.addView(this.y, g7.e6.e(84, 84, 51));
        this.y.m(imageLocation, "84_84", imageLocation2, "50_50", z8Var, null, 0, null);
        ImageView imageView = new ImageView(context);
        this.C = imageView;
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        this.C.setBackground(org.telegram.ui.ActionBar.f6.h0(AndroidUtilities.dp(34.0f), 671088640, 687865855));
        this.C.setImageResource(R.drawable.ic_ab_back);
        this.C.setScaleType(ImageView.ScaleType.CENTER);
        this.C.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.o11
            public final /* synthetic */ z11 b;

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
                        z11 z11Var = this.b;
                        z11Var.f.s.setClickable(false);
                        z11Var.f0();
                        break;
                    default:
                        z11.T(this.b);
                        break;
                }
            }
        });
        r0Var.addView(this.C, g7.e6.c(34.0f, 34));
        this.D = Bitmap.createBitmap(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.D);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, this.D.getWidth(), this.D.getHeight());
        Paint paint = new Paint(1);
        paint.setColor(-1);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        canvas.drawBitmap(BitmapFactory.decodeResource(ApplicationLoader.applicationContext.getResources(), R.drawable.msg_qr_mini), (this.D.getWidth() - r6.getWidth()) * 0.5f, (this.D.getHeight() - r6.getHeight()) * 0.5f, paint);
        canvas.setBitmap(null);
        y11 y11Var = new y11(this, this, getParentActivity().getWindow());
        this.f = y11Var;
        this.x = y11Var.h;
        ChatThemeController chatThemeController = ChatThemeController.getInstance(this.currentAccount);
        chatThemeController.preloadAllWallpaperThumbs(true);
        chatThemeController.preloadAllWallpaperThumbs(false);
        chatThemeController.preloadAllWallpaperImages(true);
        chatThemeController.preloadAllWallpaperImages(false);
        NotificationCenter.getGlobalInstance().addObserver(y11Var, NotificationCenter.emojiLoaded);
        y11 y11Var2 = this.f;
        y11Var2.F = new l11(this);
        y11Var2.n.setText(LocaleController.getString(R.string.QrCode));
        this.f.r.setViewType(17);
        this.f.s.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.o11
            public final /* synthetic */ z11 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i9) {
                    case 0:
                        this.b.finishFragment();
                        break;
                    case 1:
                        z11 z11Var = this.b;
                        z11Var.f.s.setClickable(false);
                        z11Var.f0();
                        break;
                    default:
                        z11.T(this.b);
                        break;
                }
            }
        });
        LinearLayout linearLayout = this.f.v;
        if (linearLayout != null) {
            final int i13 = 2;
            linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.o11
                public final /* synthetic */ z11 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            this.b.finishFragment();
                            break;
                        case 1:
                            z11 z11Var = this.b;
                            z11Var.f.s.setClickable(false);
                            z11Var.f0();
                            break;
                        default:
                            z11.T(this.b);
                            break;
                    }
                }
            });
        }
        r0Var.addView(this.x, g7.e6.e(-1, -2, 80));
        this.h.N = true;
        this.fragmentView = r0Var;
        Utilities.themeQueue.postRunnable(new m11(this, 4), 25L);
        this.fragmentView.postDelayed(new m11(this, 5), P ? 250L : j10);
        this.J = getParentActivity().getWindow().getDecorView().getSystemUiVisibility();
        if (getParentActivity() != null) {
            getParentActivity().getWindow().getDecorView().setSystemUiVisibility(this.J | 1028);
        }
        View view = this.fragmentView;
        l11 l11Var = new l11(this);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(view, l11Var);
        return this.fragmentView;
    }

    public final void d0(int i9, Bitmap bitmap, boolean z10) {
        if (bitmap != null) {
            this.h.t(bitmap, i9);
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
            ofFloat.addUpdateListener(new v01(this, 2));
            this.v.setDuration(250L);
            this.v.start();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void f0() {
        Point point = AndroidUtilities.displaySize;
        int min = Math.min(point.x, point.y);
        Point point2 = AndroidUtilities.displaySize;
        int max = Math.max(point2.x, point2.y);
        float f10 = min;
        if ((max * 1.0f) / f10 > 1.92f) {
            max = (int) (f10 * 1.92f);
        }
        Bitmap createBitmap = Bitmap.createBitmap(min, max, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        this.x.setVisibility(8);
        this.C.setVisibility(8);
        this.B.setVisibility(8);
        this.B.getAnimatedDrawable();
        u11 u11Var = this.A;
        if (u11Var != null) {
            u11Var.d(true);
        }
        this.fragmentView.measure(View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30));
        this.fragmentView.layout(0, 0, min, max);
        this.fragmentView.draw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(this.B.getLeft(), this.B.getTop(), this.B.getRight(), this.B.getBottom());
        if (this.E != null) {
            canvas.drawBitmap(this.E, (Rect) null, rectF, new Paint(2));
        }
        canvas.setBitmap(null);
        this.x.setVisibility(0);
        this.C.setVisibility(0);
        this.B.setVisibility(0);
        ViewGroup viewGroup = (ViewGroup) this.fragmentView.getParent();
        this.fragmentView.layout(0, 0, viewGroup.getWidth(), viewGroup.getHeight());
        u11 u11Var2 = this.A;
        if (u11Var2 != null) {
            u11Var2.d(false);
        }
        Uri bitmapShareUri = AndroidUtilities.getBitmapShareUri(createBitmap, "qr_tmp.jpg", Bitmap.CompressFormat.JPEG);
        if (bitmapShareUri != null) {
            try {
                getParentActivity().startActivityForResult(Intent.createChooser(new Intent("android.intent.action.SEND").setType("image/*").putExtra("android.intent.extra.STREAM", bitmapShareUri), LocaleController.getString(R.string.InviteByQRCode)), 500);
            } catch (ActivityNotFoundException e10) {
                e10.printStackTrace();
            }
        }
        AndroidUtilities.runOnUIThread(new m11(this, 0), 500L);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final org.telegram.ui.ActionBar.y3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.y3.c;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final org.telegram.ui.ActionBar.b6 getResourceProvider() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.h6> themeDescriptions = super.getThemeDescriptions();
        y11 y11Var = this.f;
        y11Var.getClass();
        x11 x11Var = new x11(y11Var);
        ArrayList arrayList = new ArrayList();
        Paint paint = y11Var.a;
        int i9 = org.telegram.ui.ActionBar.f6.h5;
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 1, null, paint, null, null, i9));
        int i10 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 32, null, null, new Drawable[]{y11Var.f}, x11Var, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(y11Var.n, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.j5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(y11Var.y, 16, new Class[]{org.telegram.ui.Components.a11.class}, null, null, null, org.telegram.ui.ActionBar.f6.i5));
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((org.telegram.ui.ActionBar.h6) obj).o = y11Var.d.a;
        }
        themeDescriptions.addAll(arrayList);
        sx0 sx0Var = new sx0(3, this);
        TextView textView = this.f.s;
        int i12 = org.telegram.ui.ActionBar.f6.Oh;
        themeDescriptions.add(new org.telegram.ui.ActionBar.h6(textView, 32, null, null, null, sx0Var, i12));
        themeDescriptions.add(new org.telegram.ui.ActionBar.h6(this.f.s, 65568, null, null, null, null, org.telegram.ui.ActionBar.f6.Qh));
        TextView textView2 = this.f.w;
        if (textView2 != null) {
            themeDescriptions.add(new org.telegram.ui.ActionBar.h6(textView2, 4, null, null, null, sx0Var, i12));
            themeDescriptions.add(new org.telegram.ui.ActionBar.h6(this.f.x, 8, null, null, null, sx0Var, i12));
        }
        int size2 = themeDescriptions.size();
        while (i10 < size2) {
            org.telegram.ui.ActionBar.h6 h6Var = themeDescriptions.get(i10);
            i10++;
            h6Var.o = this.a;
        }
        return themeDescriptions;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        this.H = this.arguments.getLong("user_id");
        this.I = this.arguments.getLong("chat_id");
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        a0.f fVar;
        y11 y11Var = this.f;
        y11Var.getClass();
        NotificationCenter.getGlobalInstance().removeObserver(y11Var, NotificationCenter.emojiLoaded);
        this.f = null;
        this.D.recycle();
        this.D = null;
        int i9 = 0;
        while (true) {
            fVar = this.d;
            if (i9 >= fVar.c) {
                break;
            }
            Bitmap bitmap = (Bitmap) fVar.h(i9);
            if (bitmap != null) {
                bitmap.recycle();
            }
            i9++;
        }
        fVar.clear();
        if (getParentActivity() != null) {
            getParentActivity().getWindow().getDecorView().setSystemUiVisibility(this.J);
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onPause() {
        if (getParentActivity() != null) {
            getParentActivity().getWindow().getDecorView().setSystemUiVisibility(this.J);
        }
        super.onPause();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onRequestPermissionsResultFragment(int i9, String[] strArr, int[] iArr) {
        if (getParentActivity() != null && i9 == 34) {
            if (iArr.length > 0 && iArr[0] == 0) {
                e0(this);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new l11(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.L5, false), null);
            alertDialog$Builder.o();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        if (getParentActivity() != null) {
            getParentActivity().getWindow().getDecorView().setSystemUiVisibility(this.J | 1028);
        }
    }
}
