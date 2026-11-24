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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class w8c extends FrameLayout implements jm7, vlb {
    public final ylb E;
    public final pc0 F;
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
    public final u82 U;
    public long V;
    public boolean W;
    public final kc0 a;
    public boolean a0;
    public final lka b;
    public boolean b0;
    public final lka c;
    public final ImageView d;
    public final jh2 e;
    public final CheckBoxSquare f;
    public final ImageView h;
    public final TextView n;
    public final TextView r;
    public Drawable s;
    public final tm w;
    public final tm x;
    public ImageView y;

    public w8c(int i, int i2, ylb ylbVar, Context context, boolean z, boolean z2) {
        super(context);
        int i3;
        int i4;
        int i5;
        this.Q = z8c.t0;
        this.U = new u82(this);
        this.E = ylbVar;
        if (z2) {
            TextView textView = new TextView(context);
            this.r = textView;
            textView.setGravity(17);
            td4.x(textView, cmb.Ii, ylbVar, 1, 14.0f);
            textView.setBackground(ulb.f(cmb.Ei, 14.0f));
            textView.setText(jb6.M0(2131754483, null));
            textView.setPadding(gm.L(17.0f), 0, gm.L(17.0f), 0);
            boolean z3 = jb6.a0;
            addView(textView, qoe.d(-2, 28.0f, (z3 ? 3 : 5) | 48, z3 ? 14.0f : 0.0f, 15.0f, z3 ? 0.0f : 14.0f, 0.0f));
            i3 = (int) Math.ceil((textView.getPaint().measureText(textView.getText().toString()) + gm.L(48.0f)) / gm.p);
        } else {
            i3 = 0;
        }
        this.R = cmb.v0(cmb.x6, ylbVar);
        this.S = cmb.v0(cmb.Yl, ylbVar);
        this.F = new pc0((ylb) null);
        kc0 kc0Var = new kc0((byte) 10, context, this);
        this.a = kc0Var;
        kc0Var.setRoundRadius(gm.L(24.0f));
        boolean z4 = jb6.a0;
        addView(kc0Var, qoe.d(46, 46.0f, (z4 ? 5 : 3) | 48, z4 ? 0.0f : i + 7, 6.0f, z4 ? i + 7 : 0.0f, 0.0f));
        setClipChildren(false);
        lka lkaVar = new lka(context);
        this.b = lkaVar;
        anb.W(lkaVar, cmb.F6, ylbVar);
        lkaVar.setTypeface(gm.o());
        lkaVar.setTextSize(16);
        lkaVar.setGravity((jb6.a0 ? 5 : 3) | 48);
        boolean z5 = jb6.a0;
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
        addView(lkaVar, qoe.d(-1, 20.0f, i6, f, 10.0f, i5, 0.0f));
        this.w = new tm(gm.L(20.0f), lkaVar);
        this.x = new tm(gm.L(20.0f), lkaVar);
        lka lkaVar2 = new lka(context);
        this.c = lkaVar2;
        lkaVar2.setTextSize(15);
        lkaVar2.setGravity((jb6.a0 ? 5 : 3) | 48);
        boolean z6 = jb6.a0;
        addView(lkaVar2, qoe.d(-1, 20.0f, (z6 ? 5 : 3) | 48, z6 ? i3 + 28 : i + 64, 32.0f, z6 ? i + 64 : i3 + 28, 0.0f));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i7 = cmb.l6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        anb.s(imageView, i7, ylbVar, mode);
        imageView.setVisibility(8);
        boolean z7 = jb6.a0;
        addView(imageView, qoe.d(-2, -2.0f, (z7 ? 5 : 3) | 16, z7 ? 0.0f : 16.0f, 0.0f, z7 ? 16.0f : 0.0f, 0.0f));
        if (i2 == 2) {
            CheckBoxSquare checkBoxSquare = new CheckBoxSquare(null, context, false);
            this.f = checkBoxSquare;
            boolean z8 = jb6.a0;
            addView(checkBoxSquare, qoe.d(18, 18.0f, (z8 ? 3 : 5) | 16, z8 ? 19.0f : 0.0f, 0.0f, z8 ? 0.0f : 19.0f, 0.0f));
        } else if (i2 == 1) {
            jh2 jh2Var = new jh2(21, ylbVar, context);
            this.e = jh2Var;
            jh2Var.setDrawUnchecked(false);
            jh2Var.setDrawBackgroundAsArc(3);
            jh2Var.b(-1, cmb.c6, cmb.j7);
            boolean z9 = jb6.a0;
            addView(jh2Var, qoe.d(24, 24.0f, (z9 ? 5 : 3) | 48, z9 ? 0.0f : i + 24, 36.0f, z9 ? i + 24 : 0.0f, 0.0f));
        } else if (i2 == 3) {
            ImageView imageView2 = new ImageView(context);
            this.h = imageView2;
            imageView2.setScaleType(scaleType);
            imageView2.setImageResource(R.drawable.account_check);
            anb.s(imageView2, cmb.Ei, ylbVar, mode);
            imageView2.setVisibility(8);
            boolean z10 = jb6.a0;
            addView(imageView2, qoe.d(24, 24.0f, (z10 ? 3 : 5) | 16, z10 ? i + 10 : 0.0f, 0.0f, z10 ? 0.0f : i + 10, 0.0f));
        }
        if (z) {
            TextView textView2 = new TextView(context);
            this.n = textView2;
            rve.b(textView2, 0.05f, 1.2f);
            textView2.setTextSize(1, 14.0f);
            anb.X(textView2, cmb.ki, ylbVar);
            textView2.setImportantForAccessibility(2);
            boolean z11 = jb6.a0;
            addView(textView2, qoe.d(-2, -2.0f, (z11 ? 3 : 5) | 48, z11 ? 23.0f : 0.0f, 10.0f, z11 ? 0.0f : 23.0f, 0.0f));
        }
        setFocusable(true);
    }

    public final void a(String str, boolean z, boolean z2, boolean z3, View.OnClickListener onClickListener) {
        TextView textView = this.n;
        if (textView == null) {
            return;
        }
        int i = z2 ? cmb.ti : z ? cmb.si : (z3 && TextUtils.isEmpty(str)) ? cmb.Ei : cmb.be;
        ylb ylbVar = this.E;
        int v0 = cmb.v0(i, ylbVar);
        anb.X(textView, i, ylbVar);
        if (z || z2) {
            textView.setText(str);
            textView.setPadding(gm.L(6.0f), gm.L(0.66f), gm.L(6.0f), gm.L(1.0f));
            textView.setTranslationX(gm.L(6.0f));
            ShapeDrawable b0 = cmb.b0(gm.L(32.0f), cmb.p1(0.12f, v0));
            wmb K = anb.K(0.12f, i);
            textView.setBackground(b0);
            anb.j(textView, b0, K, null, ylbVar);
            textView.setOnClickListener(onClickListener);
        } else if (z3 && TextUtils.isEmpty(str)) {
            textView.setText(jb6.M0(2131754379, null));
            textView.setPadding(gm.L(6.0f), gm.L(0.66f), gm.L(6.0f), gm.L(1.0f));
            textView.setTranslationX(gm.L(6.0f));
            fg0 Y = cmb.Y(cmb.p1(0.12f, v0), gm.L(32.0f), gm.L(32.0f));
            wmb K2 = anb.K(0.12f, i);
            textView.setBackground(Y);
            anb.j(textView, Y, null, K2, ylbVar);
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

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.x6));
        hashSet.add(Integer.valueOf(cmb.Yl));
        hashSet.add(Integer.valueOf(cmb.c6));
        hashSet.add(Integer.valueOf(cmb.j7));
        hashSet.add(Integer.valueOf(cmb.ti));
        hashSet.add(Integer.valueOf(cmb.si));
        hashSet.add(Integer.valueOf(cmb.be));
    }

    public final void b(int i, int i2) {
        int i3;
        float f;
        kc0 kc0Var = this.a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) kc0Var.getLayoutParams();
        layoutParams.leftMargin = gm.L(jb6.a0 ? 0.0f : i + 7);
        layoutParams.rightMargin = gm.L(jb6.a0 ? i + 7 : 0.0f);
        kc0Var.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.b.getLayoutParams();
        boolean z = jb6.a0;
        CheckBoxSquare checkBoxSquare = this.f;
        if (z) {
            i3 = (checkBoxSquare != null ? 18 : 0) + 28;
        } else {
            i3 = i + 64 + i2;
        }
        layoutParams2.leftMargin = gm.L(i3);
        if (jb6.a0) {
            f = i + 64 + i2;
        } else {
            f = (checkBoxSquare != null ? 18 : 0) + 28;
        }
        layoutParams2.rightMargin = gm.L(f);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.c.getLayoutParams();
        layoutParams3.leftMargin = gm.L(jb6.a0 ? 28.0f : i + 64 + i2);
        layoutParams3.rightMargin = gm.L(jb6.a0 ? i + 64 + i2 : 28.0f);
        jh2 jh2Var = this.e;
        if (jh2Var != null) {
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) jh2Var.getLayoutParams();
            layoutParams4.leftMargin = gm.L(jb6.a0 ? 0.0f : i + 32 + i2);
            layoutParams4.rightMargin = gm.L(jb6.a0 ? i + 32 + i2 : 0.0f);
        }
    }

    public final void c(boolean z, boolean z2) {
        jh2 jh2Var = this.e;
        if (jh2Var != null) {
            if (jh2Var.getVisibility() != 0) {
                jh2Var.setVisibility(0);
            }
            jh2Var.a(z, z2);
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
        lka lkaVar = this.b;
        if (obj == null && charSequence == null && charSequence2 == null) {
            this.J = null;
            this.I = null;
            this.G = false;
            this.H = null;
            lkaVar.l("", false);
            this.c.l("", false);
            this.a.setImageDrawable(null);
            return;
        }
        this.J = charSequence2;
        if (charSequence != null && lkaVar != null) {
            try {
                charSequence = gw3.m(charSequence, lkaVar.getPaint().getFontMetricsInt(), false, null, 0);
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

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.m4) {
            this.b.invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (this.W && view == this.a) {
            ur3.a(canvas, cmb.R0, (view.getWidth() / 2.0f) + view.getX(), (view.getHeight() / 2.0f) + view.getY(), view.getHeight());
        }
        return super.drawChild(canvas, view, j);
    }

    public final void e(TLRPC.User user, boolean z) {
        d(user, null, null, z);
    }

    public final void f(zo7 zo7Var, CharSequence charSequence, boolean z) {
        String M0;
        Object W1;
        boolean z2 = zo7Var.e;
        int i = this.Q;
        if (z2) {
            M0 = zo7Var.c <= 0 ? zo7Var.f ? jb6.M0(2131747773, null) : jb6.M0(2131747774, null) : jb6.M0(2131747778, null);
        } else {
            boolean z3 = zo7Var.b;
            int i2 = zo7Var.c;
            int i3 = zo7Var.a;
            int i4 = 2131747589;
            if (i2 != 3 || i3 == Integer.MAX_VALUE) {
                if (i2 != 0 && i2 != 1) {
                    i4 = 2131747634;
                } else if (z3) {
                    M0 = jb6.M0(2131747651, null);
                }
                M0 = jb6.M0(i4, null);
            } else {
                int currentTime = i3 - ConnectionsManager.getInstance(i).getCurrentTime();
                M0 = currentTime <= 0 ? z3 ? jb6.M0(2131747651, null) : jb6.M0(2131747589, null) : currentTime < 3600 ? jb6.a0("WillUnmuteIn", null, 2131742528, jb6.G(currentTime / 60, "Minutes", new Object[0])) : currentTime < 86400 ? jb6.a0("WillUnmuteIn", null, 2131742528, jb6.G((int) Math.ceil((currentTime / 60.0f) / 60.0f), "Hours", new Object[0])) : currentTime < 31536000 ? jb6.a0("WillUnmuteIn", null, 2131742528, jb6.G((int) Math.ceil(((currentTime / 60.0f) / 60.0f) / 24.0f), "Days", new Object[0])) : null;
            }
            if (M0 == null) {
                M0 = jb6.M0(2131747627, null);
            }
            if (zo7Var.f) {
                M0 = M0.concat(", Auto");
            }
        }
        if (pg3.B(zo7Var.d)) {
            TLRPC.EncryptedChat Z0 = oc7.r1(i).Z0(Integer.valueOf((int) (zo7Var.d & 4294967295L)));
            if (Z0 == null || (W1 = oc7.r1(i).W1(Long.valueOf(Z0.user_id))) == null) {
                return;
            }
            d(W1, charSequence, M0, false);
            return;
        }
        if (pg3.D(zo7Var.d)) {
            Object W12 = oc7.r1(i).W1(Long.valueOf(zo7Var.d));
            if (W12 != null) {
                d(W12, charSequence, M0, z);
                return;
            }
            return;
        }
        Object L0 = oc7.r1(i).L0(Long.valueOf(-zo7Var.d));
        if (L0 != null) {
            d(L0, charSequence, M0, z);
        }
    }

    public final void g(int i, c6c c6cVar, boolean z) {
        CharSequence M0;
        long j = c6cVar.y;
        if (j > 0) {
            TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(j));
            String p = m9c.p(W1);
            if (W1 != null) {
                d(W1, null, !TextUtils.isEmpty(p) ? b10.h("@", p) : W1.bot ? jb6.M0(2131753121, null) : W1.contact ? jb6.M0(2131750729, null) : jb6.M0(2131750656, null), z);
                return;
            }
            return;
        }
        TLRPC.Chat L0 = oc7.r1(i).L0(Long.valueOf(-j));
        if (L0 != null) {
            if (L0.participants_count != 0) {
                boolean V = sd2.V(L0);
                int i2 = L0.participants_count;
                M0 = V ? jb6.H(',', "Subscribers", i2) : jb6.H(',', "Members", i2);
            } else {
                M0 = !sd2.t0(L0) ? (!sd2.T(L0) || L0.megagroup) ? jb6.M0(2131748398, null) : jb6.M0(2131752271, null) : (!sd2.T(L0) || L0.megagroup) ? jb6.M0(2131748395, null) : jb6.M0(2131752260, null);
            }
            d(L0, null, M0, z);
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
            i += gm.L(6.0f);
        }
        if (jb6.a0) {
            i3 = i;
            i2 = 0;
        } else {
            i2 = i;
            i3 = 0;
        }
        this.b.setPadding(i3, 0, i2, 0);
        if (z) {
            if (jb6.a0) {
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
        bf0 bf0Var;
        pc0 pc0Var;
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
            this.W = sd2.Y(chat2);
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
            int i3 = oc7.s5;
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
                    str3 = gm.C2(gm.A2(m9c.r(user)));
                } else {
                    str3 = gm.C2(gm.A2(chat == null ? "" : chat.title));
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
        bf0 bf0Var2 = this.a;
        lka lkaVar = this.c;
        lka lkaVar2 = this.b;
        pc0 pc0Var2 = this.F;
        if (z6) {
            ((FrameLayout.LayoutParams) lkaVar2.getLayoutParams()).topMargin = gm.L(19.0f);
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
                    pc0Var2.f(11);
                    break;
                case 1:
                    pc0Var2.f(6);
                    break;
                case 2:
                    pc0Var2.f(5);
                    break;
                case 3:
                    pc0Var2.f(4);
                    break;
                case 4:
                    pc0Var2.f(24);
                    break;
                case 5:
                    pc0Var2.f(8);
                    break;
                case 6:
                    pc0Var2.f(10);
                    break;
                case 7:
                    pc0Var2.f(9);
                    break;
                case '\b':
                    pc0Var2.f(23);
                    break;
                case '\t':
                    pc0Var2.f(7);
                    break;
            }
            bf0Var2.o(null, "50_50", pc0Var2);
            this.J = "";
            pc0Var = pc0Var2;
            bf0Var = bf0Var2;
            r10 = 0;
        } else {
            ((FrameLayout.LayoutParams) lkaVar2.getLayoutParams()).topMargin = gm.L(10.0f);
            if (user == null) {
                r10 = 0;
                z = false;
                r10 = 0;
                if (chat != null) {
                    pc0Var2.p(chat);
                } else {
                    CharSequence charSequence = this.I;
                    int i4 = this.K;
                    if (charSequence != null) {
                        long j = i4;
                        String charSequence2 = charSequence.toString();
                        bf0Var = bf0Var2;
                        pc0Var = pc0Var2;
                        pc0Var.j(j, charSequence2, null, null);
                    } else {
                        bf0Var = bf0Var2;
                        long j2 = i4;
                        pc0Var = pc0Var2;
                        pc0Var.j(j2, "#", null, null);
                    }
                }
            } else {
                if (this.L && m9c.D(user)) {
                    lkaVar2.l(jb6.M0(2131745635, null), true);
                    lkaVar.l(null, false);
                    pc0Var2.f(1);
                    bf0Var2.m(null, "50_50", pc0Var2, user);
                    ((FrameLayout.LayoutParams) lkaVar2.getLayoutParams()).topMargin = gm.L(19.0f);
                    return;
                }
                z = false;
                z = false;
                pc0Var2.q(user);
                TLRPC.UserStatus userStatus3 = user.status;
                if (userStatus3 != null) {
                    this.O = userStatus3.expires;
                } else {
                    this.O = 0;
                }
            }
            pc0Var = pc0Var2;
            bf0Var = bf0Var2;
            r10 = z;
        }
        CharSequence charSequence3 = this.I;
        ylb ylbVar = this.E;
        if (charSequence3 != null) {
            this.N = r10;
            String str6 = this.M;
            if (str6 != null) {
                charSequence3 = gm.u1(charSequence3, str6, ylbVar);
            }
            if (charSequence3 != null) {
                try {
                    z3 = false;
                    try {
                        charSequence3 = gw3.m(charSequence3, lkaVar2.getPaint().getFontMetricsInt(), false, r10, 0);
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                }
                lkaVar2.l(charSequence3, z3);
            }
            z3 = false;
            lkaVar2.l(charSequence3, z3);
        } else {
            if (user != null) {
                String r = str == null ? m9c.r(user) : gm.C2(gm.A2(str));
                this.N = r;
                str2 = r;
            } else if (chat != null) {
                if (str == null) {
                    str = chat.title;
                }
                String C2 = gm.C2(gm.A2(str));
                this.N = C2;
                str2 = C2;
            } else {
                this.N = "";
                str2 = str4;
            }
            String str7 = this.M;
            CharSequence charSequence4 = str2;
            if (str7 != null) {
                charSequence4 = gm.u1(str2, str7, ylbVar);
            }
            if (charSequence4 != null) {
                try {
                    z2 = false;
                    try {
                        charSequence4 = gw3.m(charSequence4, lkaVar2.getPaint().getFontMetricsInt(), false, r10, 0);
                    } catch (Exception unused3) {
                    }
                } catch (Exception unused4) {
                }
                lkaVar2.l(charSequence4, z2);
            }
            z2 = false;
            lkaVar2.l(charSequence4, z2);
        }
        long c3 = user != null ? pg3.c(user) : chat != null ? pg3.c(chat) : 0L;
        tm tmVar = this.w;
        if (c3 == 0) {
            tmVar.g(r10, false);
            lkaVar2.setLeftDrawable((Drawable) r10);
        } else {
            tmVar.j(c3, false);
            tmVar.k(Integer.valueOf(cmb.v0(cmb.y9, ylbVar)));
            lkaVar2.setLeftDrawable(tmVar);
        }
        int i5 = this.Q;
        if (user != null) {
            oc7.r1(i5);
            if (oc7.C2(user) && !oc7.r1(i5).H3()) {
                if (pg3.f(user.emoji_status) != 0) {
                    long f = pg3.f(user.emoji_status);
                    tm tmVar2 = this.x;
                    tmVar2.j(f, false);
                    tmVar2.k(Integer.valueOf(cmb.v0(cmb.y9, ylbVar)));
                    lkaVar2.i(tmVar2);
                } else {
                    if (this.s == null) {
                        this.s = getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                        u8c u8cVar = new u8c(gm.L(14.0f), gm.L(14.0f), this.s);
                        this.s = u8cVar;
                        anb.x(this, u8cVar, cmb.y9, ylbVar, PorterDuff.Mode.MULTIPLY);
                    }
                    lkaVar2.i(this.s);
                }
                lkaVar2.setRightDrawableTopPadding(-gm.L(0.5f));
                if (this.J == null) {
                    lkaVar.setTextColor(this.R);
                    CharSequence charSequence5 = this.J;
                    String str8 = this.M;
                    if (str8 != null) {
                        charSequence5 = gm.u1(charSequence5, str8, ylbVar);
                    }
                    i2 = 0;
                    lkaVar.l(charSequence5, false);
                } else if (user == null) {
                    i2 = 0;
                } else if (user.bot) {
                    lkaVar.setTextColor(this.R);
                    if (user.bot_chat_history || ((textView = this.n) != null && textView.getVisibility() == 0)) {
                        i2 = 0;
                        lkaVar.l(jb6.M0(2131752899, r10), false);
                    } else {
                        i2 = 0;
                        lkaVar.l(jb6.M0(2131752900, r10), false);
                    }
                } else if (user.id == z8c.h(i5).e() || (((userStatus = user.status) != null && userStatus.expires > ConnectionsManager.getInstance(i5).getCurrentTime()) || oc7.r1(i5).a0.containsKey(Long.valueOf(user.id)))) {
                    i2 = 0;
                    lkaVar.setTextColor(this.S);
                    lkaVar.l(jb6.M0(2131747559, r10), false);
                } else {
                    lkaVar.setTextColor(this.R);
                    i2 = 0;
                    lkaVar.l(jb6.d0(i5, user, r10, r10), false);
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
                    bf0Var.f(user, pc0Var);
                } else if (chat != null) {
                    bf0Var.f(chat, pc0Var);
                } else {
                    bf0Var.setImageDrawable(pc0Var);
                }
                bf0Var.setRoundRadius(!this.W ? gm.L(12.777778f) : (chat == null || !chat.forum) ? gm.L(24.0f) : gm.L(14.0f));
                anb.W(lkaVar2, cmb.F6, ylbVar);
            }
        }
        lkaVar2.i(r10);
        lkaVar2.setRightDrawableTopPadding(0);
        if (this.J == null) {
        }
        imageView = this.d;
        if (imageView.getVisibility() != 0) {
        }
        this.P = fileLocation;
        if (user == null) {
        }
        bf0Var.setRoundRadius(!this.W ? gm.L(12.777778f) : (chat == null || !chat.forum) ? gm.L(24.0f) : gm.L(14.0f));
        anb.W(lkaVar2, cmb.F6, ylbVar);
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
        nm7.e().b(this, nm7.m4);
        this.x.a();
        this.w.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nm7.e().n(this, nm7.m4);
        this.x.b();
        this.w.b();
        this.U.g();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.T) {
            canvas.drawLine(jb6.a0 ? 0.0f : gm.L(68.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (jb6.a0 ? gm.L(68.0f) : 0), getMeasuredHeight() - 1, cmb.j0);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        CheckBoxSquare checkBoxSquare = this.f;
        if (checkBoxSquare == null || checkBoxSquare.getVisibility() != 0) {
            jh2 jh2Var = this.e;
            if (jh2Var != null && jh2Var.getVisibility() == 0) {
                accessibilityNodeInfo.setCheckable(true);
                accessibilityNodeInfo.setChecked(jh2Var.a.q);
                accessibilityNodeInfo.setClassName("android.widget.CheckBox");
            }
        } else {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(checkBoxSquare.h);
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        }
        StringBuilder sb = new StringBuilder();
        lka lkaVar = this.b;
        if (lkaVar != null) {
            CharSequence text = lkaVar.getText();
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
        lka lkaVar2 = this.c;
        if (lkaVar2 != null) {
            CharSequence text3 = lkaVar2.getText();
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(this.a0 ? 56.0f : 58.0f) + (this.T ? 1 : 0), TLObject.FLAG_30));
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
        lka lkaVar = this.b;
        lkaVar.setTextSize(15);
        boolean z = jb6.a0;
        lkaVar.setLayoutParams(qoe.d(-1, 20.0f, (z ? 5 : 3) | 48, z ? 30.0f : i + 66, 10.0f, z ? i + 66 : 30.0f, 0.0f));
        lka lkaVar2 = this.c;
        lkaVar2.setTextSize(13);
        boolean z2 = jb6.a0;
        lkaVar2.setLayoutParams(qoe.d(-1, 20.0f, (z2 ? 5 : 3) | 48, z2 ? 30.0f : i + 66, 32.0f, z2 ? i + 66 : 30.0f, 0.0f));
        int L = gm.L(22.0f);
        kc0 kc0Var = this.a;
        kc0Var.setRoundRadius(L);
        boolean z3 = jb6.a0;
        kc0Var.setLayoutParams(qoe.d(44, 44.0f, (z3 ? 5 : 3) | 48, z3 ? 0.0f : i + 8, 6.0f, z3 ? i + 8 : 0.0f, 0.0f));
        jh2 jh2Var = this.e;
        if (jh2Var != null) {
            boolean z4 = jb6.a0;
            jh2Var.setLayoutParams(qoe.d(24, 24.0f, (z4 ? 5 : 3) | 48, z4 ? 0.0f : i + 37, 32.0f, z4 ? i + 37 : 0.0f, 0.0f));
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
            rve.a(this.y);
            this.y.setImageResource(R.drawable.ic_close_white);
            ImageView imageView3 = this.y;
            int i = cmb.z6;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            ylb ylbVar = this.E;
            anb.s(imageView3, i, ylbVar, mode);
            ImageView imageView4 = this.y;
            int i2 = cmb.h6;
            anb.R(imageView4, cmb.f0(cmb.v0(i2, ylbVar), 5, -1), null, anb.M(i2), ylbVar);
            ImageView imageView5 = this.y;
            boolean z = jb6.a0;
            addView(imageView5, qoe.d(30, 30.0f, (z ? 3 : 5) | 16, z ? 14.0f : 0.0f, 0.0f, z ? 0.0f : 14.0f, 0.0f));
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

    @Override // vlb
    public final void updateColors() {
        try {
            int i = this.R;
            int i2 = this.S;
            ylb ylbVar = this.E;
            if (!this.b0) {
                this.R = cmb.v0(cmb.x6, ylbVar);
                this.S = cmb.v0(cmb.Yl, ylbVar);
            }
            lka lkaVar = this.c;
            if (lkaVar != null) {
                int textColor = lkaVar.getTextColor();
                if (textColor == i2 && i2 != i) {
                    lkaVar.setTextColor(this.S);
                } else if (textColor == i) {
                    lkaVar.setTextColor(this.R);
                }
            }
            kc0 kc0Var = this.a;
            if (kc0Var != null) {
                kc0Var.invalidate();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public w8c(Context context, int i, int i2, boolean z) {
        this(i, i2, null, context, z, false);
    }
}
