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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class y11 extends org.telegram.ui.ActionBar.n2 {
    public static final a0.f N;
    public static List O;
    public static boolean P;
    public t11 A;
    public org.telegram.ui.Components.ri0 B;
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
    public i0.c M;
    public final i6 a;
    public final org.telegram.ui.ActionBar.b4 b;
    public final Rect c;
    public final a0.f d;
    public int[] e;
    public x11 f;
    public org.telegram.ui.Components.nb0 h;
    public org.telegram.ui.Components.nb0 n;
    public org.telegram.ui.Components.nb0 r;
    public ValueAnimator s;
    public ValueAnimator v;
    public aj0 w;
    public ag.y1 x;
    public org.telegram.ui.Components.n9 y;

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

    public y11(Bundle bundle) {
        super(bundle);
        this.a = new i6(this);
        org.telegram.ui.ActionBar.b4 b4Var = new org.telegram.ui.ActionBar.b4(this.currentAccount);
        b4Var.e = "🏠";
        b4Var.c = of.b.d("🏠");
        b4Var.d = TLRPC.ChatTheme.ofEmoticon(b4Var.e);
        org.telegram.ui.ActionBar.a4 a4Var = new org.telegram.ui.ActionBar.a4();
        a4Var.a = org.telegram.ui.ActionBar.g6.N0("Blue");
        a4Var.e = 99;
        b4Var.f.add(a4Var);
        org.telegram.ui.ActionBar.a4 a4Var2 = new org.telegram.ui.ActionBar.a4();
        a4Var2.a = org.telegram.ui.ActionBar.g6.N0("Dark Blue");
        a4Var2.e = 0;
        b4Var.f.add(a4Var2);
        this.b = b4Var;
        this.c = new Rect();
        this.d = new a0.f(0);
        this.e = null;
        this.h = new org.telegram.ui.Components.nb0();
        this.F = b4Var;
        this.K = -1;
        this.M = i0.c.e;
    }

    public static /* synthetic */ void U(y11 y11Var) {
        if (y11Var.getParentActivity() == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 23 || y11Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
            f0(y11Var);
        } else {
            y11Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
        }
    }

    public static /* synthetic */ void V(y11 y11Var) {
        P = false;
        List list = O;
        if (list == null || list.isEmpty()) {
            ChatThemeController.getInstance(y11Var.currentAccount).requestAllChatThemes(new o11(y11Var), true);
        } else {
            y11Var.c0(O);
        }
    }

    public static void W(y11 y11Var, boolean z10, org.telegram.ui.ActionBar.b4 b4Var, org.telegram.ui.ActionBar.a5 a5Var) {
        i6 i6Var = y11Var.a;
        if (z10) {
            i6Var.b = b4Var.b(((y11) i6Var.c).currentAccount, y11Var.G ? 1 : 0);
        } else {
            i6Var.b = y11Var.F.b(((y11) i6Var.c).currentAccount, y11Var.G ? 1 : 0);
        }
        a5Var.h = new l11(y11Var, 3);
        ((ActionBarLayout) y11Var.parentLayout).f(a5Var, null);
        LinearLayout linearLayout = y11Var.f.v;
        if (linearLayout != null) {
            linearLayout.setBackground(org.telegram.ui.ActionBar.w5.d(new float[]{6.0f}, 0, i0.b.k(org.telegram.ui.ActionBar.w5.b(y11Var.getThemedColor(org.telegram.ui.ActionBar.g6.Oh)), 25)));
        }
    }

    public static /* synthetic */ void X(y11 y11Var) {
        y11Var.b.n(y11Var.currentAccount);
        View view = y11Var.fragmentView;
        if (view == null) {
            return;
        }
        view.postDelayed(new l11(y11Var, 1), 17L);
    }

    public static void f0(org.telegram.ui.ActionBar.n2 n2Var) {
        t9.e0(n2Var.getParentActivity(), 1, new p11(n2Var.getCurrentAccount(), n2Var));
    }

    public final Bitmap b0(org.telegram.ui.ActionBar.b4 b4Var, boolean z10) {
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
                    this.r = new org.telegram.ui.Components.nb0(true, 0, 0, 0, 0);
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

    public final void c0(List list) {
        if (list == null || list.isEmpty() || this.f == null) {
            return;
        }
        list.set(0, this.b);
        ArrayList arrayList = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            org.telegram.ui.ActionBar.b4 b4Var = (org.telegram.ui.ActionBar.b4) list.get(i10);
            b4Var.n(this.currentAccount);
            org.telegram.ui.Components.zo zoVar = new org.telegram.ui.Components.zo(b4Var);
            boolean z10 = this.G;
            zoVar.c = z10 ? 1 : 0;
            zoVar.e = b0(b4Var, z10);
            arrayList.add(zoVar);
        }
        org.telegram.ui.Components.yo yoVar = this.f.b;
        yoVar.d = arrayList;
        yoVar.l();
        int i11 = 0;
        while (true) {
            if (i11 == arrayList.size()) {
                i11 = -1;
                break;
            } else {
                if (of.b.a(((org.telegram.ui.Components.zo) arrayList.get(i11)).a.c, this.F.c)) {
                    this.f.G = (org.telegram.ui.Components.zo) arrayList.get(i11);
                    break;
                }
                i11++;
            }
        }
        if (i11 != -1) {
            this.f.b(i11);
        }
        x11 x11Var = this.f;
        v11 v11Var = x11Var.B;
        v11Var.setAlpha(0.0f);
        v11Var.animate().alpha(1.0f).setDuration(150L).start();
        v11Var.setVisibility(0);
        org.telegram.ui.Components.h00 h00Var = x11Var.r;
        h00Var.animate().alpha(0.0f).setListener(new go(h00Var)).setDuration(150L).start();
        org.telegram.ui.Components.zk0 zk0Var = x11Var.y;
        zk0Var.setAlpha(0.0f);
        zk0Var.animate().alpha(1.0f).setDuration(150L).start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x00c5, code lost:
    
        if (r9 != 1) goto L47;
     */
    @Override // org.telegram.ui.ActionBar.n2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        long j10;
        String str;
        String str2;
        ImageLocation imageLocation;
        ImageLocation imageLocation2;
        org.telegram.ui.Components.y8 y8Var;
        boolean z10;
        boolean z11;
        TLRPC.Chat chat;
        ImageLocation imageLocation3;
        org.telegram.ui.Components.y8 y8Var2;
        ImageLocation imageLocation4;
        char c10;
        String str3;
        final int i10 = 1;
        setHasOwnBackground(true);
        this.G = org.telegram.ui.ActionBar.g6.I.q();
        final int i11 = 0;
        this.actionBar.setAddToContainer(false);
        this.actionBar.setBackground(null);
        this.actionBar.D(-1, false);
        org.telegram.ui.ActionBar.q0 q0Var = new org.telegram.ui.ActionBar.q0(this, context, 2);
        aj0 aj0Var = new aj0(this, context, 6);
        this.w = aj0Var;
        q0Var.addView(aj0Var);
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
                        int i12 = 0;
                        while (true) {
                            if (i12 >= privacyRules.size()) {
                                j10 = j11;
                                break;
                            }
                            TLRPC.PrivacyRule privacyRule = privacyRules.get(i12);
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
                            i12++;
                            j11 = j10;
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
                    y8Var2 = new org.telegram.ui.Components.y8(0, user);
                    imageLocation4 = ImageLocation.getForUser(this.currentAccount, user, 1);
                    imageLocation3 = ImageLocation.getForUser(this.currentAccount, user, 0);
                } else {
                    j10 = 0;
                    str2 = null;
                    z10 = false;
                }
                z11 = false;
                y8Var2 = new org.telegram.ui.Components.y8(0, user);
                imageLocation4 = ImageLocation.getForUser(this.currentAccount, user, 1);
                imageLocation3 = ImageLocation.getForUser(this.currentAccount, user, 0);
            } else {
                j10 = 0;
                imageLocation3 = null;
                str = null;
                str2 = null;
                y8Var2 = null;
                imageLocation4 = null;
                z10 = false;
                z11 = false;
            }
            imageLocation = imageLocation3;
            y8Var = y8Var2;
            imageLocation2 = imageLocation4;
        } else {
            j10 = 0;
            if (this.I == 0 || (chat = getMessagesController().getChat(Long.valueOf(this.I))) == null) {
                str = null;
                str2 = null;
                imageLocation = null;
                imageLocation2 = null;
                y8Var = null;
            } else {
                str = ChatObject.getPublicUsername(chat);
                org.telegram.ui.Components.y8 y8Var3 = new org.telegram.ui.Components.y8(chat);
                ImageLocation forChat = ImageLocation.getForChat(this.currentAccount, chat, 1);
                str2 = null;
                imageLocation = ImageLocation.getForChat(this.currentAccount, chat, 0);
                y8Var = y8Var3;
                imageLocation2 = forChat;
            }
            z10 = false;
            z11 = false;
        }
        t11 t11Var = new t11(context);
        this.A = t11Var;
        t11Var.a.n(-9324972, -13856649, -6636738, -9915042);
        t11Var.invalidate();
        String n10 = str != null ? a9.p.n(MessagesController.getInstance(this.currentAccount).linkPrefix, "/", str, new StringBuilder("https://")) : null;
        t11 t11Var2 = this.A;
        if (str2 != null) {
            str = str2;
        }
        t11Var2.c(n10, str, z10, z11);
        t11 t11Var3 = this.A;
        t11Var3.e = new k11(this);
        q0Var.addView(t11Var3);
        org.telegram.ui.Components.ri0 ri0Var = new org.telegram.ui.Components.ri0(context);
        this.B = ri0Var;
        ri0Var.setAutoRepeat(true);
        this.B.f(R.raw.plane_logo_plain, 60, 60, null);
        this.B.d();
        q0Var.addView(this.B);
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
        this.y = n9Var;
        n9Var.setRoundRadius(AndroidUtilities.dp(42.0f));
        this.y.s(AndroidUtilities.dp(84.0f), AndroidUtilities.dp(84.0f));
        q0Var.addView(this.y, h7.z5.e(84, 84, 51));
        this.y.m(imageLocation, "84_84", imageLocation2, "50_50", y8Var, null, 0, null);
        ImageView imageView = new ImageView(context);
        this.C = imageView;
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        this.C.setBackground(org.telegram.ui.ActionBar.g6.h0(AndroidUtilities.dp(34.0f), 671088640, 687865855));
        this.C.setImageResource(R.drawable.ic_ab_back);
        this.C.setScaleType(ImageView.ScaleType.CENTER);
        this.C.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.n11
            public final /* synthetic */ y11 b;

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
                        y11 y11Var = this.b;
                        y11Var.f.s.setClickable(false);
                        y11Var.g0();
                        break;
                    default:
                        y11.U(this.b);
                        break;
                }
            }
        });
        q0Var.addView(this.C, h7.z5.c(34.0f, 34));
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
        x11 x11Var = new x11(this, this, getParentActivity().getWindow());
        this.f = x11Var;
        this.x = x11Var.h;
        ChatThemeController chatThemeController = ChatThemeController.getInstance(this.currentAccount);
        chatThemeController.preloadAllWallpaperThumbs(true);
        chatThemeController.preloadAllWallpaperThumbs(false);
        chatThemeController.preloadAllWallpaperImages(true);
        chatThemeController.preloadAllWallpaperImages(false);
        NotificationCenter.getGlobalInstance().addObserver(x11Var, NotificationCenter.emojiLoaded);
        x11 x11Var2 = this.f;
        x11Var2.F = new k11(this);
        x11Var2.n.setText(LocaleController.getString(R.string.QrCode));
        this.f.r.setViewType(17);
        this.f.s.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.n11
            public final /* synthetic */ y11 b;

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
                        y11 y11Var = this.b;
                        y11Var.f.s.setClickable(false);
                        y11Var.g0();
                        break;
                    default:
                        y11.U(this.b);
                        break;
                }
            }
        });
        LinearLayout linearLayout = this.f.v;
        if (linearLayout != null) {
            final int i14 = 2;
            linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.n11
                public final /* synthetic */ y11 b;

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
                            y11 y11Var = this.b;
                            y11Var.f.s.setClickable(false);
                            y11Var.g0();
                            break;
                        default:
                            y11.U(this.b);
                            break;
                    }
                }
            });
        }
        q0Var.addView(this.x, h7.z5.e(-1, -2, 80));
        this.h.N = true;
        this.fragmentView = q0Var;
        Utilities.themeQueue.postRunnable(new l11(this, 4), 25L);
        this.fragmentView.postDelayed(new l11(this, 5), P ? 250L : j10);
        this.J = getParentActivity().getWindow().getDecorView().getSystemUiVisibility();
        if (getParentActivity() != null) {
            getParentActivity().getWindow().getDecorView().setSystemUiVisibility(this.J | 1028);
        }
        View view = this.fragmentView;
        k11 k11Var = new k11(this);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(view, k11Var);
        return this.fragmentView;
    }

    public final void d0(int i10, org.telegram.ui.ActionBar.b4 b4Var, boolean z10) {
        float f10;
        this.K = i10;
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
        org.telegram.ui.Components.nb0 nb0Var = this.h;
        this.n = nb0Var;
        nb0Var.q(false);
        this.n.setAlpha(255);
        org.telegram.ui.Components.nb0 nb0Var2 = new org.telegram.ui.Components.nb0();
        this.h = nb0Var2;
        nb0Var2.setCallback(this.w);
        this.h.n(a4Var.k, a4Var.l, a4Var.m, a4Var.n);
        this.h.r(this.w);
        this.h.s(1.0f);
        org.telegram.ui.Components.nb0 nb0Var3 = this.h;
        nb0Var3.N = true;
        org.telegram.ui.Components.nb0 nb0Var4 = this.n;
        if (nb0Var4 != null) {
            nb0Var3.h = nb0Var4.h;
        }
        this.A.a.h = nb0Var3.h;
        TLRPC.WallPaper k10 = this.F.k(z11 ? 1 : 0);
        int i11 = 2;
        if (k10 != null) {
            org.telegram.ui.Components.nb0 nb0Var5 = this.h;
            nb0Var5.t(nb0Var5.u, k10.settings.intensity);
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            this.F.o(z11 ? 1 : 0, new ResultCallback() { // from class: org.telegram.ui.m11
                @Override // org.telegram.tgnet.ResultCallback
                public final void onComplete(Object obj) {
                    Pair pair = (Pair) obj;
                    y11 y11Var = y11.this;
                    long i12 = y11Var.F.i(z11 ? 1 : 0);
                    if (pair == null || i12 == 0) {
                        return;
                    }
                    long longValue = ((Long) pair.first).longValue();
                    Bitmap bitmap = ((mf.a) pair.second).b;
                    if (longValue != i12 || bitmap == null) {
                        return;
                    }
                    y11Var.e0(y11Var.h.q, bitmap, SystemClock.elapsedRealtime() - elapsedRealtime > 150);
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
            Utilities.themeQueue.postRunnable(new l11(this, i11), 35L);
        }
        org.telegram.ui.Components.nb0 nb0Var6 = this.h;
        nb0Var6.u(nb0Var6.f());
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
            org.telegram.ui.Components.nb0 nb0Var7 = this.h;
            nb0Var7.K = 0.0f;
            nb0Var7.i();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.s = ofFloat;
            ofFloat.addUpdateListener(new ag.t2(20, this, iArr));
            this.s.addListener(new org.telegram.ui.Components.fk0(12, this, iArr));
            this.s.setDuration((int) (f10 * 250.0f));
            this.s.start();
        } else {
            if (iArr != null) {
                t11 t11Var = this.A;
                t11Var.a.n(iArr[0], iArr[1], iArr[2], iArr[3]);
                t11Var.invalidate();
                System.arraycopy(iArr, 0, this.e, 0, 4);
            }
            this.n = null;
            this.w.invalidate();
        }
        org.telegram.ui.ActionBar.a5 a5Var = new org.telegram.ui.ActionBar.a5(null, (this.G ? org.telegram.ui.ActionBar.g6.J : org.telegram.ui.ActionBar.g6.A0()).U, this.G, !z10);
        a5Var.f = false;
        a5Var.e = true;
        a5Var.m = this.a;
        a5Var.l = (int) (f10 * 250.0f);
        AndroidUtilities.runOnUIThread(new cg.c(this, z10, b4Var2, a5Var, 24));
    }

    @Override // org.telegram.ui.ActionBar.n2
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
            ofFloat.addUpdateListener(new w01(this, 2));
            this.v.setDuration(250L);
            this.v.start();
        }
    }

    public final void g0() {
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
        t11 t11Var = this.A;
        if (t11Var != null) {
            t11Var.d(true);
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
        t11 t11Var2 = this.A;
        if (t11Var2 != null) {
            t11Var2.d(false);
        }
        Uri bitmapShareUri = AndroidUtilities.getBitmapShareUri(createBitmap, "qr_tmp.jpg", Bitmap.CompressFormat.JPEG);
        if (bitmapShareUri != null) {
            try {
                getParentActivity().startActivityForResult(Intent.createChooser(new Intent("android.intent.action.SEND").setType("image/*").putExtra("android.intent.extra.STREAM", bitmapShareUri), LocaleController.getString(R.string.InviteByQRCode)), 500);
            } catch (ActivityNotFoundException e9) {
                e9.printStackTrace();
            }
        }
        AndroidUtilities.runOnUIThread(new l11(this, 0), 500L);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final org.telegram.ui.ActionBar.y3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.y3.c;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final org.telegram.ui.ActionBar.c6 getResourceProvider() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.i6> themeDescriptions = super.getThemeDescriptions();
        x11 x11Var = this.f;
        x11Var.getClass();
        w11 w11Var = new w11(x11Var);
        ArrayList arrayList = new ArrayList();
        Paint paint = x11Var.a;
        int i10 = org.telegram.ui.ActionBar.g6.h5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 1, null, paint, null, null, i10));
        int i11 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 32, null, null, new Drawable[]{x11Var.f}, w11Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(x11Var.n, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.j5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(x11Var.y, 16, new Class[]{org.telegram.ui.Components.b11.class}, null, null, null, org.telegram.ui.ActionBar.g6.i5));
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            ((org.telegram.ui.ActionBar.i6) obj).o = x11Var.d.a;
        }
        themeDescriptions.addAll(arrayList);
        sx0 sx0Var = new sx0(3, this);
        TextView textView = this.f.s;
        int i13 = org.telegram.ui.ActionBar.g6.Oh;
        themeDescriptions.add(new org.telegram.ui.ActionBar.i6(textView, 32, null, null, null, sx0Var, i13));
        themeDescriptions.add(new org.telegram.ui.ActionBar.i6(this.f.s, 65568, null, null, null, null, org.telegram.ui.ActionBar.g6.Qh));
        TextView textView2 = this.f.w;
        if (textView2 != null) {
            themeDescriptions.add(new org.telegram.ui.ActionBar.i6(textView2, 4, null, null, null, sx0Var, i13));
            themeDescriptions.add(new org.telegram.ui.ActionBar.i6(this.f.x, 8, null, null, null, sx0Var, i13));
        }
        int size2 = themeDescriptions.size();
        while (i11 < size2) {
            org.telegram.ui.ActionBar.i6 i6Var = themeDescriptions.get(i11);
            i11++;
            i6Var.o = this.a;
        }
        return themeDescriptions;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        this.H = this.arguments.getLong("user_id");
        this.I = this.arguments.getLong("chat_id");
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        a0.f fVar;
        x11 x11Var = this.f;
        x11Var.getClass();
        NotificationCenter.getGlobalInstance().removeObserver(x11Var, NotificationCenter.emojiLoaded);
        this.f = null;
        this.D.recycle();
        this.D = null;
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
            getParentActivity().getWindow().getDecorView().setSystemUiVisibility(this.J);
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onPause() {
        if (getParentActivity() != null) {
            getParentActivity().getWindow().getDecorView().setSystemUiVisibility(this.J);
        }
        super.onPause();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        if (getParentActivity() != null && i10 == 34) {
            if (iArr.length > 0 && iArr[0] == 0) {
                f0(this);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new k11(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L5, false), null);
            alertDialog$Builder.o();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        if (getParentActivity() != null) {
            getParentActivity().getWindow().getDecorView().setSystemUiVisibility(this.J | 1028);
        }
    }
}
