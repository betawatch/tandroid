// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBoxSquare;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public class vac extends FrameLayout implements fn7, snb {
    public final vnb E;
    public final rb0 F;
    public boolean G;
    public Object H;
    public CharSequence I;
    public CharSequence J;
    public int K;
    public boolean L;
    public String M;
    public String N;
    public int O;
    public TLRPC.FileLocation P;
    public final int Q;
    public int R;
    public int S;
    public boolean T;
    public final a82 U;
    public long V;
    public boolean W;
    public final mb0 a;
    public boolean a0;
    public final ema b;
    public boolean b0;
    public final ema c;
    public final ImageView d;
    public final og2 e;
    public final CheckBoxSquare f;
    public final ImageView h;
    public final TextView n;
    public final TextView r;
    public Drawable s;
    public final ul w;
    public final ul x;
    public ImageView y;

    public vac(int i, int i2, vnb vnbVar, Context context, boolean z, boolean z2) {
        super(context);
        int i3;
        int i4;
        int i5;
        this.Q = yac.t0;
        this.U = new a82(this);
        this.E = vnbVar;
        if (z2) {
            TextView textView = new TextView(context);
            this.r = textView;
            textView.setGravity(17);
            qd4.w(textView, aob.Ji, vnbVar, 1, 14.0f);
            textView.setBackground(rnb.f(aob.Fi, 14.0f));
            textView.setText(ob6.M0(2131754479, null));
            textView.setPadding(hl.L(17.0f), 0, hl.L(17.0f), 0);
            boolean z3 = ob6.a0;
            addView(textView, tre.d(-2, 28.0f, (z3 ? 3 : 5) | 48, z3 ? 14.0f : 0.0f, 15.0f, z3 ? 0.0f : 14.0f, 0.0f));
            i3 = (int) Math.ceil((textView.getPaint().measureText(textView.getText().toString()) + hl.L(48.0f)) / hl.p);
        } else {
            i3 = 0;
        }
        this.R = aob.v0(aob.y6, vnbVar);
        this.S = aob.v0(aob.Zl, vnbVar);
        this.F = new rb0((vnb) null);
        mb0 mb0Var = new mb0((byte) 10, context, this);
        this.a = mb0Var;
        mb0Var.setRoundRadius(hl.L(24.0f));
        boolean z4 = ob6.a0;
        addView(mb0Var, tre.d(46, 46.0f, (z4 ? 5 : 3) | 48, z4 ? 0.0f : i + 7, 6.0f, z4 ? i + 7 : 0.0f, 0.0f));
        setClipChildren(false);
        ema emaVar = new ema(context);
        this.b = emaVar;
        yob.W(emaVar, aob.G6, vnbVar);
        emaVar.setTypeface(hl.o());
        emaVar.setTextSize(16);
        emaVar.setGravity((ob6.a0 ? 5 : 3) | 48);
        boolean z5 = ob6.a0;
        int i6 = (z5 ? 5 : 3) | 48;
        if (z5) {
            i4 = (i2 == 2 ? 18 : 0) + 28 + i3;
        } else {
            i4 = i + 64;
        }
        float f = i4;
        if (z5) {
            i5 = i + 64;
        } else {
            i5 = (i2 != 2 ? 0 : 18) + 28 + i3;
        }
        addView(emaVar, tre.d(-1, 20.0f, i6, f, 10.0f, i5, 0.0f));
        this.w = new ul(hl.L(20.0f), emaVar);
        this.x = new ul(hl.L(20.0f), emaVar);
        ema emaVar2 = new ema(context);
        this.c = emaVar2;
        emaVar2.setTextSize(15);
        emaVar2.setGravity((ob6.a0 ? 5 : 3) | 48);
        boolean z6 = ob6.a0;
        addView(emaVar2, tre.d(-1, 20.0f, (z6 ? 5 : 3) | 48, z6 ? i3 + 28 : i + 64, 32.0f, z6 ? i + 64 : i3 + 28, 0.0f));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i7 = aob.m6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        yob.s(imageView, i7, vnbVar, mode);
        imageView.setVisibility(8);
        boolean z7 = ob6.a0;
        addView(imageView, tre.d(-2, -2.0f, (z7 ? 5 : 3) | 16, z7 ? 0.0f : 16.0f, 0.0f, z7 ? 16.0f : 0.0f, 0.0f));
        if (i2 == 2) {
            CheckBoxSquare checkBoxSquare = new CheckBoxSquare(null, context, false);
            this.f = checkBoxSquare;
            boolean z8 = ob6.a0;
            addView(checkBoxSquare, tre.d(18, 18.0f, (z8 ? 3 : 5) | 16, z8 ? 19.0f : 0.0f, 0.0f, z8 ? 0.0f : 19.0f, 0.0f));
        } else if (i2 == 1) {
            og2 og2Var = new og2(21, vnbVar, context);
            this.e = og2Var;
            og2Var.setDrawUnchecked(false);
            og2Var.setDrawBackgroundAsArc(3);
            og2Var.b(-1, aob.d6, aob.k7);
            boolean z9 = ob6.a0;
            addView(og2Var, tre.d(24, 24.0f, (z9 ? 5 : 3) | 48, z9 ? 0.0f : i + 24, 36.0f, z9 ? i + 24 : 0.0f, 0.0f));
        } else if (i2 == 3) {
            ImageView imageView2 = new ImageView(context);
            this.h = imageView2;
            imageView2.setScaleType(scaleType);
            imageView2.setImageResource(R.drawable.account_check);
            yob.s(imageView2, aob.Fi, vnbVar, mode);
            imageView2.setVisibility(8);
            boolean z10 = ob6.a0;
            addView(imageView2, tre.d(24, 24.0f, (z10 ? 3 : 5) | 16, z10 ? i + 10 : 0.0f, 0.0f, z10 ? 0.0f : i + 10, 0.0f));
        }
        if (z) {
            TextView textView2 = new TextView(context);
            this.n = textView2;
            iye.b(textView2, 0.05f, 1.2f);
            textView2.setTextSize(1, 14.0f);
            yob.X(textView2, aob.li, vnbVar);
            textView2.setImportantForAccessibility(2);
            boolean z11 = ob6.a0;
            addView(textView2, tre.d(-2, -2.0f, (z11 ? 3 : 5) | 48, z11 ? 23.0f : 0.0f, 10.0f, z11 ? 0.0f : 23.0f, 0.0f));
        }
        setFocusable(true);
    }

    public final void a(String str, boolean z, boolean z2, boolean z3, View.OnClickListener onClickListener) {
        TextView textView = this.n;
        if (textView == null) {
            return;
        }
        int i = z2 ? aob.ui : z ? aob.ti : (z3 && TextUtils.isEmpty(str)) ? aob.Fi : aob.ce;
        vnb vnbVar = this.E;
        int v0 = aob.v0(i, vnbVar);
        yob.X(textView, i, vnbVar);
        if (z || z2) {
            textView.setText(str);
            textView.setPadding(hl.L(6.0f), hl.L(0.66f), hl.L(6.0f), hl.L(1.0f));
            textView.setTranslationX(hl.L(6.0f));
            ShapeDrawable b0 = aob.b0(hl.L(32.0f), aob.p1(0.12f, v0));
            uob K = yob.K(0.12f, i);
            textView.setBackground(b0);
            yob.j(textView, b0, K, null, vnbVar);
            textView.setOnClickListener(onClickListener);
        } else if (z3 && TextUtils.isEmpty(str)) {
            textView.setText(ob6.M0(2131754375, null));
            textView.setPadding(hl.L(6.0f), hl.L(0.66f), hl.L(6.0f), hl.L(1.0f));
            textView.setTranslationX(hl.L(6.0f));
            hf0 Y = aob.Y(aob.p1(0.12f, v0), hl.L(32.0f), hl.L(32.0f));
            uob K2 = yob.K(0.12f, i);
            textView.setBackground(Y);
            yob.j(textView, Y, null, K2, vnbVar);
            textView.setOnClickListener(onClickListener);
        } else {
            textView.setText(str);
            textView.setPadding(0, 0, 0, 0);
            textView.setTranslationX(0.0f);
            textView.setBackground(null);
            textView.setOnClickListener(onClickListener);
        }
        textView.setVisibility((str != null || z3) ? 0 : 8);
        if (str == null && !z3) {
            h(0, false);
        } else {
            CharSequence text = textView.getText();
            h((int) Math.ceil(textView.getPaint().measureText(text, 0, text.length())), false);
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.y6));
        hashSet.add(Integer.valueOf(aob.Zl));
        hashSet.add(Integer.valueOf(aob.d6));
        hashSet.add(Integer.valueOf(aob.k7));
        hashSet.add(Integer.valueOf(aob.ui));
        hashSet.add(Integer.valueOf(aob.ti));
        hashSet.add(Integer.valueOf(aob.ce));
    }

    public final void b(int i, int i2) {
        int i3;
        float f;
        mb0 mb0Var = this.a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) mb0Var.getLayoutParams();
        layoutParams.leftMargin = hl.L(ob6.a0 ? 0.0f : i + 7);
        layoutParams.rightMargin = hl.L(ob6.a0 ? i + 7 : 0.0f);
        mb0Var.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.b.getLayoutParams();
        boolean z = ob6.a0;
        CheckBoxSquare checkBoxSquare = this.f;
        if (z) {
            i3 = (checkBoxSquare != null ? 18 : 0) + 28;
        } else {
            i3 = i + 64 + i2;
        }
        layoutParams2.leftMargin = hl.L(i3);
        if (ob6.a0) {
            f = i + 64 + i2;
        } else {
            f = (checkBoxSquare != null ? 18 : 0) + 28;
        }
        layoutParams2.rightMargin = hl.L(f);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.c.getLayoutParams();
        layoutParams3.leftMargin = hl.L(ob6.a0 ? 28.0f : i + 64 + i2);
        layoutParams3.rightMargin = hl.L(ob6.a0 ? i + 64 + i2 : 28.0f);
        og2 og2Var = this.e;
        if (og2Var != null) {
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) og2Var.getLayoutParams();
            layoutParams4.leftMargin = hl.L(ob6.a0 ? 0.0f : i + 32 + i2);
            layoutParams4.rightMargin = hl.L(ob6.a0 ? i + 32 + i2 : 0.0f);
        }
    }

    public final void c(boolean z, boolean z2) {
        og2 og2Var = this.e;
        if (og2Var != null) {
            if (og2Var.getVisibility() != 0) {
                og2Var.setVisibility(0);
            }
            og2Var.a(z, z2);
            return;
        }
        CheckBoxSquare checkBoxSquare = this.f;
        if (checkBoxSquare != null) {
            if (checkBoxSquare.getVisibility() != 0) {
                checkBoxSquare.setVisibility(0);
            }
            checkBoxSquare.a(z, z2);
        } else {
            ImageView imageView = this.h;
            if (imageView != null) {
                imageView.setVisibility(z ? 0 : 8);
            }
        }
    }

    public final void d(Object obj, CharSequence charSequence, CharSequence charSequence2, boolean z) {
        ema emaVar = this.b;
        if (obj == null && charSequence == null && charSequence2 == null) {
            this.J = null;
            this.I = null;
            this.G = false;
            this.H = null;
            emaVar.l("", false);
            this.c.l("", false);
            this.a.setImageDrawable(null);
            return;
        }
        this.J = charSequence2;
        if (charSequence != null && emaVar != null) {
            try {
                charSequence = pv3.m(charSequence, emaVar.getPaint().getFontMetricsInt(), false, null, 0);
            } catch (Exception unused) {
            }
        }
        this.I = charSequence;
        this.G = !(obj instanceof String);
        this.H = obj;
        this.T = z;
        setWillNotDraw(!z);
        i(0);
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.l4) {
            this.b.invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (this.W && view == this.a) {
            br3.a(canvas, aob.R0, (view.getWidth() / 2.0f) + view.getX(), (view.getHeight() / 2.0f) + view.getY(), view.getHeight());
        }
        return super.drawChild(canvas, view, j);
    }

    public final void e(TLRPC.User user, boolean z) {
        d(user, null, null, z);
    }

    public final void f(vp7 vp7Var, CharSequence charSequence, boolean z) {
        String M0;
        Object X1;
        boolean z2 = vp7Var.e;
        int i = this.Q;
        if (z2) {
            M0 = vp7Var.c <= 0 ? vp7Var.f ? ob6.M0(2131747767, null) : ob6.M0(2131747768, null) : ob6.M0(2131747772, null);
        } else {
            boolean z3 = vp7Var.b;
            int i2 = vp7Var.c;
            int i3 = vp7Var.a;
            int i4 = 2131747583;
            if (i2 != 3 || i3 == Integer.MAX_VALUE) {
                if (i2 != 0 && i2 != 1) {
                    i4 = 2131747628;
                } else if (z3) {
                    M0 = ob6.M0(2131747645, null);
                }
                M0 = ob6.M0(i4, null);
            } else {
                int currentTime = i3 - ConnectionsManager.getInstance(i).getCurrentTime();
                M0 = currentTime <= 0 ? z3 ? ob6.M0(2131747645, null) : ob6.M0(2131747583, null) : currentTime < 3600 ? ob6.a0("WillUnmuteIn", null, 2131742496, ob6.G(currentTime / 60, "Minutes", new Object[0])) : currentTime < 86400 ? ob6.a0("WillUnmuteIn", null, 2131742496, ob6.G((int) Math.ceil((currentTime / 60.0f) / 60.0f), "Hours", new Object[0])) : currentTime < 31536000 ? ob6.a0("WillUnmuteIn", null, 2131742496, ob6.G((int) Math.ceil(((currentTime / 60.0f) / 60.0f) / 24.0f), "Days", new Object[0])) : null;
            }
            if (M0 == null) {
                M0 = ob6.M0(2131747621, null);
            }
            if (vp7Var.f) {
                M0 = M0.concat(", Auto");
            }
        }
        if (wf3.B(vp7Var.d)) {
            TLRPC.EncryptedChat a1 = uc7.s1(i).a1(Integer.valueOf((int) (vp7Var.d & 4294967295L)));
            if (a1 == null || (X1 = uc7.s1(i).X1(Long.valueOf(a1.user_id))) == null) {
                return;
            }
            d(X1, charSequence, M0, false);
            return;
        }
        if (wf3.D(vp7Var.d)) {
            Object X12 = uc7.s1(i).X1(Long.valueOf(vp7Var.d));
            if (X12 != null) {
                d(X12, charSequence, M0, z);
                return;
            }
            return;
        }
        Object M02 = uc7.s1(i).M0(Long.valueOf(-vp7Var.d));
        if (M02 != null) {
            d(M02, charSequence, M0, z);
        }
    }

    public final void g(int i, b8c b8cVar, boolean z) {
        CharSequence M0;
        long j = b8cVar.y;
        if (j > 0) {
            TLRPC.User X1 = uc7.s1(i).X1(Long.valueOf(j));
            String p = lbc.p(X1);
            if (X1 != null) {
                d(X1, null, !TextUtils.isEmpty(p) ? c00.i("@", p) : X1.bot ? ob6.M0(2131753149, null) : X1.contact ? ob6.M0(2131750757, null) : ob6.M0(2131750684, null), z);
                return;
            }
            return;
        }
        TLRPC.Chat M02 = uc7.s1(i).M0(Long.valueOf(-j));
        if (M02 != null) {
            if (M02.participants_count != 0) {
                boolean V = xc2.V(M02);
                int i2 = M02.participants_count;
                M0 = V ? ob6.H(',', "Subscribers", i2) : ob6.H(',', "Members", i2);
            } else {
                M0 = !xc2.t0(M02) ? (!xc2.T(M02) || M02.megagroup) ? ob6.M0(2131748395, null) : ob6.M0(2131752299, null) : (!xc2.T(M02) || M02.megagroup) ? ob6.M0(2131748392, null) : ob6.M0(2131752288, null);
            }
            d(M02, null, M0, z);
        }
    }

    public Object getCurrentObject() {
        return this.H;
    }

    public long getDialogId() {
        return this.V;
    }

    public CharSequence getName() {
        return this.b.getText();
    }

    public final void h(int i, boolean z) {
        int i2;
        int i3;
        int i4;
        if (i > 0) {
            i += hl.L(6.0f);
        }
        if (ob6.a0) {
            i3 = i;
            i2 = 0;
        } else {
            i2 = i;
            i3 = 0;
        }
        this.b.setPadding(i3, 0, i2, 0);
        if (z) {
            if (ob6.a0) {
                i4 = i;
                i = 0;
            } else {
                i4 = 0;
            }
            this.c.setPadding(i4, 0, i, 0);
        }
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0351  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v4, types: [android.graphics.drawable.Drawable, boolean[], int[], java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(int i) {
        TLRPC.User user;
        TLRPC.Chat chat;
        TLRPC.FileLocation fileLocation;
        String str;
        ?? r10;
        de0 de0Var;
        rb0 rb0Var;
        boolean z;
        String str2;
        boolean z2;
        int i2;
        TLRPC.UserStatus userStatus;
        TextView textView;
        ImageView imageView;
        boolean z3;
        char c;
        String str3;
        boolean z4;
        TLRPC.FileLocation fileLocation2;
        this.V = 0L;
        this.W = false;
        Object obj = this.H;
        if (obj instanceof TLRPC.User) {
            user = (TLRPC.User) obj;
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            TLRPC.FileLocation fileLocation3 = userProfilePhoto != null ? userProfilePhoto.photo_small : null;
            this.V = user.id;
            fileLocation = fileLocation3;
            chat = null;
        } else if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat2 = (TLRPC.Chat) obj;
            TLRPC.ChatPhoto chatPhoto = chat2.photo;
            TLRPC.FileLocation fileLocation4 = chatPhoto != null ? chatPhoto.photo_small : null;
            this.V = chat2.id;
            this.W = xc2.Y(chat2);
            fileLocation = fileLocation4;
            chat = chat2;
            user = null;
        } else {
            user = null;
            chat = null;
            fileLocation = null;
        }
        String str4 = "";
        if (i != 0) {
            int i3 = uc7.r5;
            boolean z5 = (i & 2) != 0 && ((fileLocation2 = this.P) == null ? fileLocation != null : !(fileLocation != null && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.local_id == fileLocation.local_id));
            if (user != null && !z5 && (i & 4) != 0) {
                TLRPC.UserStatus userStatus2 = user.status;
                if ((userStatus2 != null ? userStatus2.expires : 0) != this.O) {
                    z5 = true;
                }
            }
            if (z5 || this.I != null || this.N == null || (i & 1) == 0) {
                str3 = null;
                z4 = z5;
            } else {
                if (user != null) {
                    str3 = hl.C2(hl.A2(lbc.r(user)));
                } else {
                    str3 = hl.C2(hl.A2(chat == null ? "" : chat.title));
                }
                z4 = z5;
                if (!str3.equals(this.N)) {
                    z4 = true;
                }
            }
            if (!z4) {
                return;
            } else {
                str = str3;
            }
        } else {
            str = null;
        }
        boolean z6 = this.H instanceof String;
        de0 de0Var2 = this.a;
        ema emaVar = this.c;
        ema emaVar2 = this.b;
        rb0 rb0Var2 = this.F;
        if (z6) {
            ((FrameLayout.LayoutParams) emaVar2.getLayoutParams()).topMargin = hl.L(19.0f);
            String str5 = (String) this.H;
            str5.getClass();
            char c2 = 65535;
            switch (str5.hashCode()) {
                case -1716307998:
                    if (str5.equals("archived")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1237460524:
                    if (str5.equals("groups")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -1197490811:
                    if (str5.equals("non_contacts")) {
                        c = 2;
                        c2 = c;
                        break;
                    }
                    break;
                case -567451565:
                    if (str5.equals("contacts")) {
                        c = 3;
                        c2 = c;
                        break;
                    }
                    break;
                case -268161860:
                    if (str5.equals("new_chats")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case 3029900:
                    if (str5.equals("bots")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case 3496342:
                    if (str5.equals("read")) {
                        c2 = 6;
                        break;
                    }
                    break;
                case 104264043:
                    if (str5.equals("muted")) {
                        c2 = 7;
                        break;
                    }
                    break;
                case 151051367:
                    if (str5.equals("existing_chats")) {
                        c2 = '\b';
                        break;
                    }
                    break;
                case 1432626128:
                    if (str5.equals("channels")) {
                        c2 = '\t';
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    rb0Var2.f(11);
                    break;
                case 1:
                    rb0Var2.f(6);
                    break;
                case 2:
                    rb0Var2.f(5);
                    break;
                case 3:
                    rb0Var2.f(4);
                    break;
                case 4:
                    rb0Var2.f(24);
                    break;
                case 5:
                    rb0Var2.f(8);
                    break;
                case 6:
                    rb0Var2.f(10);
                    break;
                case 7:
                    rb0Var2.f(9);
                    break;
                case '\b':
                    rb0Var2.f(23);
                    break;
                case '\t':
                    rb0Var2.f(7);
                    break;
            }
            de0Var2.o(null, "50_50", rb0Var2);
            this.J = "";
            rb0Var = rb0Var2;
            de0Var = de0Var2;
            r10 = 0;
        } else {
            ((FrameLayout.LayoutParams) emaVar2.getLayoutParams()).topMargin = hl.L(10.0f);
            if (user == null) {
                r10 = 0;
                z = false;
                r10 = 0;
                if (chat != null) {
                    rb0Var2.p(chat);
                } else {
                    CharSequence charSequence = this.I;
                    int i4 = this.K;
                    if (charSequence != null) {
                        long j = i4;
                        String charSequence2 = charSequence.toString();
                        de0Var = de0Var2;
                        rb0Var = rb0Var2;
                        rb0Var.j(j, charSequence2, null, null);
                    } else {
                        de0Var = de0Var2;
                        long j2 = i4;
                        rb0Var = rb0Var2;
                        rb0Var.j(j2, "#", null, null);
                    }
                }
            } else {
                if (this.L && lbc.D(user)) {
                    emaVar2.l(ob6.M0(2131745629, null), true);
                    emaVar.l(null, false);
                    rb0Var2.f(1);
                    de0Var2.m(null, "50_50", rb0Var2, user);
                    ((FrameLayout.LayoutParams) emaVar2.getLayoutParams()).topMargin = hl.L(19.0f);
                    return;
                }
                z = false;
                z = false;
                rb0Var2.q(user);
                TLRPC.UserStatus userStatus3 = user.status;
                if (userStatus3 != null) {
                    this.O = userStatus3.expires;
                } else {
                    this.O = 0;
                }
            }
            rb0Var = rb0Var2;
            de0Var = de0Var2;
            r10 = z;
        }
        CharSequence charSequence3 = this.I;
        vnb vnbVar = this.E;
        if (charSequence3 != null) {
            this.N = r10;
            String str6 = this.M;
            if (str6 != null) {
                charSequence3 = hl.u1(charSequence3, str6, vnbVar);
            }
            if (charSequence3 != null) {
                try {
                    z3 = false;
                    try {
                        charSequence3 = pv3.m(charSequence3, emaVar2.getPaint().getFontMetricsInt(), false, r10, 0);
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                }
                emaVar2.l(charSequence3, z3);
            }
            z3 = false;
            emaVar2.l(charSequence3, z3);
        } else {
            if (user != null) {
                String r = str == null ? lbc.r(user) : hl.C2(hl.A2(str));
                this.N = r;
                str2 = r;
            } else if (chat != null) {
                if (str == null) {
                    str = chat.title;
                }
                String C2 = hl.C2(hl.A2(str));
                this.N = C2;
                str2 = C2;
            } else {
                this.N = "";
                str2 = str4;
            }
            String str7 = this.M;
            CharSequence charSequence4 = str2;
            if (str7 != null) {
                charSequence4 = hl.u1(str2, str7, vnbVar);
            }
            if (charSequence4 != null) {
                try {
                    z2 = false;
                    try {
                        charSequence4 = pv3.m(charSequence4, emaVar2.getPaint().getFontMetricsInt(), false, r10, 0);
                    } catch (Exception unused3) {
                    }
                } catch (Exception unused4) {
                }
                emaVar2.l(charSequence4, z2);
            }
            z2 = false;
            emaVar2.l(charSequence4, z2);
        }
        long c3 = user != null ? wf3.c(user) : chat != null ? wf3.c(chat) : 0L;
        ul ulVar = this.w;
        if (c3 == 0) {
            ulVar.g(r10, false);
            emaVar2.setLeftDrawable((Drawable) r10);
        } else {
            ulVar.j(c3, false);
            ulVar.k(Integer.valueOf(aob.v0(aob.z9, vnbVar)));
            emaVar2.setLeftDrawable(ulVar);
        }
        int i5 = this.Q;
        if (user != null) {
            uc7.s1(i5);
            if (uc7.F2(user) && !uc7.s1(i5).M3()) {
                if (wf3.f(user.emoji_status) != 0) {
                    long f = wf3.f(user.emoji_status);
                    ul ulVar2 = this.x;
                    ulVar2.j(f, false);
                    ulVar2.k(Integer.valueOf(aob.v0(aob.z9, vnbVar)));
                    emaVar2.i(ulVar2);
                } else {
                    if (this.s == null) {
                        this.s = getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                        tac tacVar = new tac(hl.L(14.0f), hl.L(14.0f), this.s);
                        this.s = tacVar;
                        yob.x(this, tacVar, aob.z9, vnbVar, PorterDuff.Mode.MULTIPLY);
                    }
                    emaVar2.i(this.s);
                }
                emaVar2.setRightDrawableTopPadding(-hl.L(0.5f));
                if (this.J == null) {
                    emaVar.setTextColor(this.R);
                    CharSequence charSequence5 = this.J;
                    String str8 = this.M;
                    if (str8 != null) {
                        charSequence5 = hl.u1(charSequence5, str8, vnbVar);
                    }
                    i2 = 0;
                    emaVar.l(charSequence5, false);
                } else if (user == null) {
                    i2 = 0;
                } else if (user.bot) {
                    emaVar.setTextColor(this.R);
                    if (user.bot_chat_history || ((textView = this.n) != null && textView.getVisibility() == 0)) {
                        i2 = 0;
                        emaVar.l(ob6.M0(2131752927, r10), false);
                    } else {
                        i2 = 0;
                        emaVar.l(ob6.M0(2131752928, r10), false);
                    }
                } else if (user.id == yac.h(i5).e() || (((userStatus = user.status) != null && userStatus.expires > ConnectionsManager.getInstance(i5).getCurrentTime()) || uc7.s1(i5).a0.containsKey(Long.valueOf(user.id)))) {
                    i2 = 0;
                    emaVar.setTextColor(this.S);
                    emaVar.l(ob6.M0(2131747553, r10), false);
                } else {
                    emaVar.setTextColor(this.R);
                    i2 = 0;
                    emaVar.l(ob6.d0(i5, user, r10, r10), false);
                }
                imageView = this.d;
                if (imageView.getVisibility() != 0) {
                    imageView.setVisibility(8);
                    imageView.setImageResource(i2);
                } else {
                    imageView.getVisibility();
                }
                this.P = fileLocation;
                if (user == null) {
                    de0Var.f(user, rb0Var);
                } else if (chat != null) {
                    de0Var.f(chat, rb0Var);
                } else {
                    de0Var.setImageDrawable(rb0Var);
                }
                de0Var.setRoundRadius(!this.W ? hl.L(12.777778f) : (chat == null || !chat.forum) ? hl.L(24.0f) : hl.L(14.0f));
                yob.W(emaVar2, aob.G6, vnbVar);
            }
        }
        emaVar2.i(r10);
        emaVar2.setRightDrawableTopPadding(0);
        if (this.J == null) {
        }
        imageView = this.d;
        if (imageView.getVisibility() != 0) {
        }
        this.P = fileLocation;
        if (user == null) {
        }
        de0Var.setRoundRadius(!this.W ? hl.L(12.777778f) : (chat == null || !chat.forum) ? hl.L(24.0f) : hl.L(14.0f));
        yob.W(emaVar2, aob.G6, vnbVar);
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        CheckBoxSquare checkBoxSquare = this.f;
        if (checkBoxSquare != null) {
            checkBoxSquare.invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jn7.e().b(this, jn7.l4);
        this.x.a();
        this.w.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jn7.e().n(this, jn7.l4);
        this.x.b();
        this.w.b();
        this.U.g();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.T) {
            canvas.drawLine(ob6.a0 ? 0.0f : hl.L(68.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (ob6.a0 ? hl.L(68.0f) : 0), getMeasuredHeight() - 1, aob.j0);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        CheckBoxSquare checkBoxSquare = this.f;
        if (checkBoxSquare == null || checkBoxSquare.getVisibility() != 0) {
            og2 og2Var = this.e;
            if (og2Var != null && og2Var.getVisibility() == 0) {
                accessibilityNodeInfo.setCheckable(true);
                accessibilityNodeInfo.setChecked(og2Var.a.q);
                accessibilityNodeInfo.setClassName("android.widget.CheckBox");
            }
        } else {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(checkBoxSquare.h);
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        }
        StringBuilder sb = new StringBuilder();
        ema emaVar = this.b;
        if (emaVar != null) {
            CharSequence text = emaVar.getText();
            if (!TextUtils.isEmpty(text)) {
                sb.append(text);
            }
        }
        TextView textView = this.n;
        if (textView != null && textView.getVisibility() == 0) {
            CharSequence text2 = textView.getText();
            if (!TextUtils.isEmpty(text2)) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(text2);
            }
        }
        ema emaVar2 = this.c;
        if (emaVar2 != null) {
            CharSequence text3 = emaVar2.getText();
            if (!TextUtils.isEmpty(text3)) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(text3);
            }
        }
        if (sb.length() > 0) {
            accessibilityNodeInfo.setContentDescription(sb);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(this.a0 ? 56.0f : 58.0f) + (this.T ? 1 : 0), TLObject.FLAG_30));
    }

    public void setAddButtonVisible(boolean z) {
        TextView textView = this.r;
        if (textView == null) {
            return;
        }
        textView.setVisibility(z ? 0 : 8);
    }

    public void setAvatarPadding(int i) {
        b(i, 0);
    }

    public void setCallCellStyle(int i) {
        this.a0 = true;
        ema emaVar = this.b;
        emaVar.setTextSize(15);
        boolean z = ob6.a0;
        emaVar.setLayoutParams(tre.d(-1, 20.0f, (z ? 5 : 3) | 48, z ? 30.0f : i + 66, 10.0f, z ? i + 66 : 30.0f, 0.0f));
        ema emaVar2 = this.c;
        emaVar2.setTextSize(13);
        boolean z2 = ob6.a0;
        emaVar2.setLayoutParams(tre.d(-1, 20.0f, (z2 ? 5 : 3) | 48, z2 ? 30.0f : i + 66, 32.0f, z2 ? i + 66 : 30.0f, 0.0f));
        int L = hl.L(22.0f);
        mb0 mb0Var = this.a;
        mb0Var.setRoundRadius(L);
        boolean z3 = ob6.a0;
        mb0Var.setLayoutParams(tre.d(44, 44.0f, (z3 ? 5 : 3) | 48, z3 ? 0.0f : i + 8, 6.0f, z3 ? i + 8 : 0.0f, 0.0f));
        og2 og2Var = this.e;
        if (og2Var != null) {
            boolean z4 = ob6.a0;
            og2Var.setLayoutParams(tre.d(24, 24.0f, (z4 ? 5 : 3) | 48, z4 ? 0.0f : i + 37, 32.0f, z4 ? i + 37 : 0.0f, 0.0f));
        }
    }

    public void setCheckDisabled(boolean z) {
        CheckBoxSquare checkBoxSquare = this.f;
        if (checkBoxSquare != null) {
            checkBoxSquare.setDisabled(z);
        }
    }

    public void setCloseIcon(View.OnClickListener onClickListener) {
        ImageView imageView = this.y;
        if (onClickListener == null) {
            if (imageView != null) {
                removeView(imageView);
                this.y = null;
                return;
            }
            return;
        }
        if (imageView == null) {
            ImageView imageView2 = new ImageView(getContext());
            this.y = imageView2;
            imageView2.setScaleType(ImageView.ScaleType.CENTER);
            iye.a(this.y);
            this.y.setImageResource(R.drawable.ic_close_white);
            ImageView imageView3 = this.y;
            int i = aob.A6;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            vnb vnbVar = this.E;
            yob.s(imageView3, i, vnbVar, mode);
            ImageView imageView4 = this.y;
            int i2 = aob.i6;
            yob.R(imageView4, aob.f0(aob.v0(i2, vnbVar), 5, -1), null, yob.M(i2), vnbVar);
            ImageView imageView5 = this.y;
            boolean z = ob6.a0;
            addView(imageView5, tre.d(30, 30.0f, (z ? 3 : 5) | 16, z ? 14.0f : 0.0f, 0.0f, z ? 0.0f : 14.0f, 0.0f));
        }
        this.y.setOnClickListener(onClickListener);
    }

    public void setCurrentId(int i) {
        this.K = i;
    }

    public void setNameTypeface(Typeface typeface) {
        this.b.setTypeface(typeface);
    }

    public void setQuery(String str) {
        this.M = str;
        i(0);
    }

    public void setSelfAsSavedMessages(boolean z) {
        this.L = z;
    }

    @Override // snb
    public final void updateColors() {
        try {
            int i = this.R;
            int i2 = this.S;
            vnb vnbVar = this.E;
            if (!this.b0) {
                this.R = aob.v0(aob.y6, vnbVar);
                this.S = aob.v0(aob.Zl, vnbVar);
            }
            ema emaVar = this.c;
            if (emaVar != null) {
                int textColor = emaVar.getTextColor();
                if (textColor == i2 && i2 != i) {
                    emaVar.setTextColor(this.S);
                } else if (textColor == i) {
                    emaVar.setTextColor(this.R);
                }
            }
            mb0 mb0Var = this.a;
            if (mb0Var != null) {
                mb0Var.invalidate();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public vac(Context context, int i, int i2, boolean z) {
        this(i, i2, null, context, z, false);
    }
}
