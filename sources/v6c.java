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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public class v6c extends FrameLayout implements gk7, tjb {
    public final wjb E;
    public final pb0 F;
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
    public final j72 U;
    public long V;
    public boolean W;
    public final kb0 a;
    public boolean a0;
    public final jia b;
    public boolean b0;
    public final jia c;
    public final ImageView d;
    public final wf2 e;
    public final CheckBoxSquare f;
    public final ImageView h;
    public final TextView n;
    public final TextView r;
    public Drawable s;
    public final tl w;
    public final tl x;
    public ImageView y;

    public v6c(int i, int i2, wjb wjbVar, Context context, boolean z, boolean z2) {
        super(context);
        int i3;
        int i4;
        int i5;
        this.Q = y6c.t0;
        this.U = new j72(this);
        this.E = wjbVar;
        if (z2) {
            TextView textView = new TextView(context);
            this.r = textView;
            textView.setGravity(17);
            tb4.w(textView, bkb.Ii, wjbVar, 1, 14.0f);
            textView.setBackground(sjb.f(bkb.Ei, 14.0f));
            textView.setText(k96.M0(2131754483, null));
            textView.setPadding(gl.L(17.0f), 0, gl.L(17.0f), 0);
            boolean z3 = k96.a0;
            addView(textView, nme.d(-2, 28.0f, (z3 ? 3 : 5) | 48, z3 ? 14.0f : 0.0f, 15.0f, z3 ? 0.0f : 14.0f, 0.0f));
            i3 = (int) Math.ceil((textView.getPaint().measureText(textView.getText().toString()) + gl.L(48.0f)) / gl.p);
        } else {
            i3 = 0;
        }
        this.R = bkb.v0(bkb.x6, wjbVar);
        this.S = bkb.v0(bkb.Yl, wjbVar);
        this.F = new pb0((wjb) null);
        kb0 kb0Var = new kb0((byte) 10, context, this);
        this.a = kb0Var;
        kb0Var.setRoundRadius(gl.L(24.0f));
        boolean z4 = k96.a0;
        addView(kb0Var, nme.d(46, 46.0f, (z4 ? 5 : 3) | 48, z4 ? 0.0f : i + 7, 6.0f, z4 ? i + 7 : 0.0f, 0.0f));
        setClipChildren(false);
        jia jiaVar = new jia(context);
        this.b = jiaVar;
        zkb.W(jiaVar, bkb.F6, wjbVar);
        jiaVar.setTypeface(gl.o());
        jiaVar.setTextSize(16);
        jiaVar.setGravity((k96.a0 ? 5 : 3) | 48);
        boolean z5 = k96.a0;
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
        addView(jiaVar, nme.d(-1, 20.0f, i6, f, 10.0f, i5, 0.0f));
        this.w = new tl(gl.L(20.0f), jiaVar);
        this.x = new tl(gl.L(20.0f), jiaVar);
        jia jiaVar2 = new jia(context);
        this.c = jiaVar2;
        jiaVar2.setTextSize(15);
        jiaVar2.setGravity((k96.a0 ? 5 : 3) | 48);
        boolean z6 = k96.a0;
        addView(jiaVar2, nme.d(-1, 20.0f, (z6 ? 5 : 3) | 48, z6 ? i3 + 28 : i + 64, 32.0f, z6 ? i + 64 : i3 + 28, 0.0f));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i7 = bkb.l6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        zkb.s(imageView, i7, wjbVar, mode);
        imageView.setVisibility(8);
        boolean z7 = k96.a0;
        addView(imageView, nme.d(-2, -2.0f, (z7 ? 5 : 3) | 16, z7 ? 0.0f : 16.0f, 0.0f, z7 ? 16.0f : 0.0f, 0.0f));
        if (i2 == 2) {
            CheckBoxSquare checkBoxSquare = new CheckBoxSquare(null, context, false);
            this.f = checkBoxSquare;
            boolean z8 = k96.a0;
            addView(checkBoxSquare, nme.d(18, 18.0f, (z8 ? 3 : 5) | 16, z8 ? 19.0f : 0.0f, 0.0f, z8 ? 0.0f : 19.0f, 0.0f));
        } else if (i2 == 1) {
            wf2 wf2Var = new wf2(21, wjbVar, context);
            this.e = wf2Var;
            wf2Var.setDrawUnchecked(false);
            wf2Var.setDrawBackgroundAsArc(3);
            wf2Var.b(-1, bkb.c6, bkb.j7);
            boolean z9 = k96.a0;
            addView(wf2Var, nme.d(24, 24.0f, (z9 ? 5 : 3) | 48, z9 ? 0.0f : i + 24, 36.0f, z9 ? i + 24 : 0.0f, 0.0f));
        } else if (i2 == 3) {
            ImageView imageView2 = new ImageView(context);
            this.h = imageView2;
            imageView2.setScaleType(scaleType);
            imageView2.setImageResource(R.drawable.account_check);
            zkb.s(imageView2, bkb.Ei, wjbVar, mode);
            imageView2.setVisibility(8);
            boolean z10 = k96.a0;
            addView(imageView2, nme.d(24, 24.0f, (z10 ? 3 : 5) | 16, z10 ? i + 10 : 0.0f, 0.0f, z10 ? 0.0f : i + 10, 0.0f));
        }
        if (z) {
            TextView textView2 = new TextView(context);
            this.n = textView2;
            ote.b(textView2, 0.05f, 1.2f);
            textView2.setTextSize(1, 14.0f);
            zkb.X(textView2, bkb.ki, wjbVar);
            textView2.setImportantForAccessibility(2);
            boolean z11 = k96.a0;
            addView(textView2, nme.d(-2, -2.0f, (z11 ? 3 : 5) | 48, z11 ? 23.0f : 0.0f, 10.0f, z11 ? 0.0f : 23.0f, 0.0f));
        }
        setFocusable(true);
    }

    public final void a(String str, boolean z, boolean z2, boolean z3, View.OnClickListener onClickListener) {
        TextView textView = this.n;
        if (textView == null) {
            return;
        }
        int i = z2 ? bkb.ti : z ? bkb.si : (z3 && TextUtils.isEmpty(str)) ? bkb.Ei : bkb.be;
        wjb wjbVar = this.E;
        int v0 = bkb.v0(i, wjbVar);
        zkb.X(textView, i, wjbVar);
        if (z || z2) {
            textView.setText(str);
            textView.setPadding(gl.L(6.0f), gl.L(0.66f), gl.L(6.0f), gl.L(1.0f));
            textView.setTranslationX(gl.L(6.0f));
            ShapeDrawable b0 = bkb.b0(gl.L(32.0f), bkb.p1(0.12f, v0));
            vkb K = zkb.K(0.12f, i);
            textView.setBackground(b0);
            zkb.j(textView, b0, K, null, wjbVar);
            textView.setOnClickListener(onClickListener);
        } else if (z3 && TextUtils.isEmpty(str)) {
            textView.setText(k96.M0(2131754379, null));
            textView.setPadding(gl.L(6.0f), gl.L(0.66f), gl.L(6.0f), gl.L(1.0f));
            textView.setTranslationX(gl.L(6.0f));
            ff0 Y = bkb.Y(bkb.p1(0.12f, v0), gl.L(32.0f), gl.L(32.0f));
            vkb K2 = zkb.K(0.12f, i);
            textView.setBackground(Y);
            zkb.j(textView, Y, null, K2, wjbVar);
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

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.x6));
        hashSet.add(Integer.valueOf(bkb.Yl));
        hashSet.add(Integer.valueOf(bkb.c6));
        hashSet.add(Integer.valueOf(bkb.j7));
        hashSet.add(Integer.valueOf(bkb.ti));
        hashSet.add(Integer.valueOf(bkb.si));
        hashSet.add(Integer.valueOf(bkb.be));
    }

    public final void b(int i, int i2) {
        int i3;
        float f;
        kb0 kb0Var = this.a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) kb0Var.getLayoutParams();
        layoutParams.leftMargin = gl.L(k96.a0 ? 0.0f : i + 7);
        layoutParams.rightMargin = gl.L(k96.a0 ? i + 7 : 0.0f);
        kb0Var.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.b.getLayoutParams();
        boolean z = k96.a0;
        CheckBoxSquare checkBoxSquare = this.f;
        if (z) {
            i3 = (checkBoxSquare != null ? 18 : 0) + 28;
        } else {
            i3 = i + 64 + i2;
        }
        layoutParams2.leftMargin = gl.L(i3);
        if (k96.a0) {
            f = i + 64 + i2;
        } else {
            f = (checkBoxSquare != null ? 18 : 0) + 28;
        }
        layoutParams2.rightMargin = gl.L(f);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.c.getLayoutParams();
        layoutParams3.leftMargin = gl.L(k96.a0 ? 28.0f : i + 64 + i2);
        layoutParams3.rightMargin = gl.L(k96.a0 ? i + 64 + i2 : 28.0f);
        wf2 wf2Var = this.e;
        if (wf2Var != null) {
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) wf2Var.getLayoutParams();
            layoutParams4.leftMargin = gl.L(k96.a0 ? 0.0f : i + 32 + i2);
            layoutParams4.rightMargin = gl.L(k96.a0 ? i + 32 + i2 : 0.0f);
        }
    }

    public final void c(boolean z, boolean z2) {
        wf2 wf2Var = this.e;
        if (wf2Var != null) {
            if (wf2Var.getVisibility() != 0) {
                wf2Var.setVisibility(0);
            }
            wf2Var.a(z, z2);
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
        jia jiaVar = this.b;
        if (obj == null && charSequence == null && charSequence2 == null) {
            this.J = null;
            this.I = null;
            this.G = false;
            this.H = null;
            jiaVar.l("", false);
            this.c.l("", false);
            this.a.setImageDrawable(null);
            return;
        }
        this.J = charSequence2;
        if (charSequence != null && jiaVar != null) {
            try {
                charSequence = vu3.m(charSequence, jiaVar.getPaint().getFontMetricsInt(), false, null, 0);
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

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.k4) {
            this.b.invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (this.W && view == this.a) {
            kq3.a(canvas, bkb.R0, (view.getWidth() / 2.0f) + view.getX(), (view.getHeight() / 2.0f) + view.getY(), view.getHeight());
        }
        return super.drawChild(canvas, view, j);
    }

    public final void e(TLRPC.User user, boolean z) {
        d(user, null, null, z);
    }

    public final void f(vm7 vm7Var, CharSequence charSequence, boolean z) {
        String M0;
        Object V1;
        boolean z2 = vm7Var.e;
        int i = this.Q;
        if (z2) {
            M0 = vm7Var.c <= 0 ? vm7Var.f ? k96.M0(2131747847, null) : k96.M0(2131747848, null) : k96.M0(2131747852, null);
        } else {
            boolean z3 = vm7Var.b;
            int i2 = vm7Var.c;
            int i3 = vm7Var.a;
            int i4 = 2131747663;
            if (i2 != 3 || i3 == Integer.MAX_VALUE) {
                if (i2 != 0 && i2 != 1) {
                    i4 = 2131747708;
                } else if (z3) {
                    M0 = k96.M0(2131747725, null);
                }
                M0 = k96.M0(i4, null);
            } else {
                int currentTime = i3 - ConnectionsManager.getInstance(i).getCurrentTime();
                M0 = currentTime <= 0 ? z3 ? k96.M0(2131747725, null) : k96.M0(2131747663, null) : currentTime < 3600 ? k96.a0("WillUnmuteIn", null, 2131742602, k96.G(currentTime / 60, "Minutes", new Object[0])) : currentTime < 86400 ? k96.a0("WillUnmuteIn", null, 2131742602, k96.G((int) Math.ceil((currentTime / 60.0f) / 60.0f), "Hours", new Object[0])) : currentTime < 31536000 ? k96.a0("WillUnmuteIn", null, 2131742602, k96.G((int) Math.ceil(((currentTime / 60.0f) / 60.0f) / 24.0f), "Days", new Object[0])) : null;
            }
            if (M0 == null) {
                M0 = k96.M0(2131747701, null);
            }
            if (vm7Var.f) {
                M0 = M0.concat(", Auto");
            }
        }
        if (cf3.B(vm7Var.d)) {
            TLRPC.EncryptedChat Y0 = na7.q1(i).Y0(Integer.valueOf((int) (vm7Var.d & 4294967295L)));
            if (Y0 == null || (V1 = na7.q1(i).V1(Long.valueOf(Y0.user_id))) == null) {
                return;
            }
            d(V1, charSequence, M0, false);
            return;
        }
        if (cf3.D(vm7Var.d)) {
            Object V12 = na7.q1(i).V1(Long.valueOf(vm7Var.d));
            if (V12 != null) {
                d(V12, charSequence, M0, z);
                return;
            }
            return;
        }
        Object K0 = na7.q1(i).K0(Long.valueOf(-vm7Var.d));
        if (K0 != null) {
            d(K0, charSequence, M0, z);
        }
    }

    public final void g(int i, c4c c4cVar, boolean z) {
        CharSequence M0;
        long j = c4cVar.y;
        if (j > 0) {
            TLRPC.User V1 = na7.q1(i).V1(Long.valueOf(j));
            String o = l7c.o(V1);
            if (V1 != null) {
                d(V1, null, !TextUtils.isEmpty(o) ? b00.h("@", o) : V1.bot ? k96.M0(2131753153, null) : V1.contact ? k96.M0(2131750780, null) : k96.M0(2131750707, null), z);
                return;
            }
            return;
        }
        TLRPC.Chat K0 = na7.q1(i).K0(Long.valueOf(-j));
        if (K0 != null) {
            if (K0.participants_count != 0) {
                boolean V = hc2.V(K0);
                int i2 = K0.participants_count;
                M0 = V ? k96.H(',', "Subscribers", i2) : k96.H(',', "Members", i2);
            } else {
                M0 = !hc2.t0(K0) ? (!hc2.T(K0) || K0.megagroup) ? k96.M0(2131748449, null) : k96.M0(2131752317, null) : (!hc2.T(K0) || K0.megagroup) ? k96.M0(2131748446, null) : k96.M0(2131752306, null);
            }
            d(K0, null, M0, z);
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
            i += gl.L(6.0f);
        }
        if (k96.a0) {
            i3 = i;
            i2 = 0;
        } else {
            i2 = i;
            i3 = 0;
        }
        this.b.setPadding(i3, 0, i2, 0);
        if (z) {
            if (k96.a0) {
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
        be0 be0Var;
        pb0 pb0Var;
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
            this.W = hc2.Y(chat2);
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
            int i3 = na7.q5;
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
                    str3 = gl.C2(gl.A2(l7c.q(user)));
                } else {
                    str3 = gl.C2(gl.A2(chat == null ? "" : chat.title));
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
        be0 be0Var2 = this.a;
        jia jiaVar = this.c;
        jia jiaVar2 = this.b;
        pb0 pb0Var2 = this.F;
        if (z6) {
            ((FrameLayout.LayoutParams) jiaVar2.getLayoutParams()).topMargin = gl.L(19.0f);
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
                    pb0Var2.f(11);
                    break;
                case 1:
                    pb0Var2.f(6);
                    break;
                case 2:
                    pb0Var2.f(5);
                    break;
                case 3:
                    pb0Var2.f(4);
                    break;
                case 4:
                    pb0Var2.f(24);
                    break;
                case 5:
                    pb0Var2.f(8);
                    break;
                case 6:
                    pb0Var2.f(10);
                    break;
                case 7:
                    pb0Var2.f(9);
                    break;
                case '\b':
                    pb0Var2.f(23);
                    break;
                case '\t':
                    pb0Var2.f(7);
                    break;
            }
            be0Var2.o(null, "50_50", pb0Var2);
            this.J = "";
            pb0Var = pb0Var2;
            be0Var = be0Var2;
            r10 = 0;
        } else {
            ((FrameLayout.LayoutParams) jiaVar2.getLayoutParams()).topMargin = gl.L(10.0f);
            if (user == null) {
                r10 = 0;
                z = false;
                r10 = 0;
                if (chat != null) {
                    pb0Var2.p(chat);
                } else {
                    CharSequence charSequence = this.I;
                    int i4 = this.K;
                    if (charSequence != null) {
                        long j = i4;
                        String charSequence2 = charSequence.toString();
                        be0Var = be0Var2;
                        pb0Var = pb0Var2;
                        pb0Var.j(j, charSequence2, null, null);
                    } else {
                        be0Var = be0Var2;
                        long j2 = i4;
                        pb0Var = pb0Var2;
                        pb0Var.j(j2, "#", null, null);
                    }
                }
            } else {
                if (this.L && l7c.C(user)) {
                    jiaVar2.l(k96.M0(2131745709, null), true);
                    jiaVar.l(null, false);
                    pb0Var2.f(1);
                    be0Var2.m(null, "50_50", pb0Var2, user);
                    ((FrameLayout.LayoutParams) jiaVar2.getLayoutParams()).topMargin = gl.L(19.0f);
                    return;
                }
                z = false;
                z = false;
                pb0Var2.q(user);
                TLRPC.UserStatus userStatus3 = user.status;
                if (userStatus3 != null) {
                    this.O = userStatus3.expires;
                } else {
                    this.O = 0;
                }
            }
            pb0Var = pb0Var2;
            be0Var = be0Var2;
            r10 = z;
        }
        CharSequence charSequence3 = this.I;
        wjb wjbVar = this.E;
        if (charSequence3 != null) {
            this.N = r10;
            String str6 = this.M;
            if (str6 != null) {
                charSequence3 = gl.u1(charSequence3, str6, wjbVar);
            }
            if (charSequence3 != null) {
                try {
                    z3 = false;
                    try {
                        charSequence3 = vu3.m(charSequence3, jiaVar2.getPaint().getFontMetricsInt(), false, r10, 0);
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                }
                jiaVar2.l(charSequence3, z3);
            }
            z3 = false;
            jiaVar2.l(charSequence3, z3);
        } else {
            if (user != null) {
                String q = str == null ? l7c.q(user) : gl.C2(gl.A2(str));
                this.N = q;
                str2 = q;
            } else if (chat != null) {
                if (str == null) {
                    str = chat.title;
                }
                String C2 = gl.C2(gl.A2(str));
                this.N = C2;
                str2 = C2;
            } else {
                this.N = "";
                str2 = str4;
            }
            String str7 = this.M;
            CharSequence charSequence4 = str2;
            if (str7 != null) {
                charSequence4 = gl.u1(str2, str7, wjbVar);
            }
            if (charSequence4 != null) {
                try {
                    z2 = false;
                    try {
                        charSequence4 = vu3.m(charSequence4, jiaVar2.getPaint().getFontMetricsInt(), false, r10, 0);
                    } catch (Exception unused3) {
                    }
                } catch (Exception unused4) {
                }
                jiaVar2.l(charSequence4, z2);
            }
            z2 = false;
            jiaVar2.l(charSequence4, z2);
        }
        long c3 = user != null ? cf3.c(user) : chat != null ? cf3.c(chat) : 0L;
        tl tlVar = this.w;
        if (c3 == 0) {
            tlVar.g(r10, false);
            jiaVar2.setLeftDrawable((Drawable) r10);
        } else {
            tlVar.j(c3, false);
            tlVar.k(Integer.valueOf(bkb.v0(bkb.y9, wjbVar)));
            jiaVar2.setLeftDrawable(tlVar);
        }
        int i5 = this.Q;
        if (user != null) {
            na7.q1(i5);
            if (na7.A2(user) && !na7.q1(i5).E3()) {
                if (cf3.f(user.emoji_status) != 0) {
                    long f = cf3.f(user.emoji_status);
                    tl tlVar2 = this.x;
                    tlVar2.j(f, false);
                    tlVar2.k(Integer.valueOf(bkb.v0(bkb.y9, wjbVar)));
                    jiaVar2.i(tlVar2);
                } else {
                    if (this.s == null) {
                        this.s = getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                        t6c t6cVar = new t6c(gl.L(14.0f), gl.L(14.0f), this.s);
                        this.s = t6cVar;
                        zkb.x(this, t6cVar, bkb.y9, wjbVar, PorterDuff.Mode.MULTIPLY);
                    }
                    jiaVar2.i(this.s);
                }
                jiaVar2.setRightDrawableTopPadding(-gl.L(0.5f));
                if (this.J == null) {
                    jiaVar.setTextColor(this.R);
                    CharSequence charSequence5 = this.J;
                    String str8 = this.M;
                    if (str8 != null) {
                        charSequence5 = gl.u1(charSequence5, str8, wjbVar);
                    }
                    i2 = 0;
                    jiaVar.l(charSequence5, false);
                } else if (user == null) {
                    i2 = 0;
                } else if (user.bot) {
                    jiaVar.setTextColor(this.R);
                    if (user.bot_chat_history || ((textView = this.n) != null && textView.getVisibility() == 0)) {
                        i2 = 0;
                        jiaVar.l(k96.M0(2131752934, r10), false);
                    } else {
                        i2 = 0;
                        jiaVar.l(k96.M0(2131752935, r10), false);
                    }
                } else if (user.id == y6c.h(i5).e() || (((userStatus = user.status) != null && userStatus.expires > ConnectionsManager.getInstance(i5).getCurrentTime()) || na7.q1(i5).a0.containsKey(Long.valueOf(user.id)))) {
                    i2 = 0;
                    jiaVar.setTextColor(this.S);
                    jiaVar.l(k96.M0(2131747633, r10), false);
                } else {
                    jiaVar.setTextColor(this.R);
                    i2 = 0;
                    jiaVar.l(k96.d0(i5, user, r10, r10), false);
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
                    be0Var.f(user, pb0Var);
                } else if (chat != null) {
                    be0Var.f(chat, pb0Var);
                } else {
                    be0Var.setImageDrawable(pb0Var);
                }
                be0Var.setRoundRadius(!this.W ? gl.L(12.777778f) : (chat == null || !chat.forum) ? gl.L(24.0f) : gl.L(14.0f));
                zkb.W(jiaVar2, bkb.F6, wjbVar);
            }
        }
        jiaVar2.i(r10);
        jiaVar2.setRightDrawableTopPadding(0);
        if (this.J == null) {
        }
        imageView = this.d;
        if (imageView.getVisibility() != 0) {
        }
        this.P = fileLocation;
        if (user == null) {
        }
        be0Var.setRoundRadius(!this.W ? gl.L(12.777778f) : (chat == null || !chat.forum) ? gl.L(24.0f) : gl.L(14.0f));
        zkb.W(jiaVar2, bkb.F6, wjbVar);
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
        kk7.e().b(this, kk7.k4);
        this.x.a();
        this.w.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kk7.e().n(this, kk7.k4);
        this.x.b();
        this.w.b();
        this.U.g();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.T) {
            canvas.drawLine(k96.a0 ? 0.0f : gl.L(68.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (k96.a0 ? gl.L(68.0f) : 0), getMeasuredHeight() - 1, bkb.j0);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        CheckBoxSquare checkBoxSquare = this.f;
        if (checkBoxSquare == null || checkBoxSquare.getVisibility() != 0) {
            wf2 wf2Var = this.e;
            if (wf2Var != null && wf2Var.getVisibility() == 0) {
                accessibilityNodeInfo.setCheckable(true);
                accessibilityNodeInfo.setChecked(wf2Var.a.q);
                accessibilityNodeInfo.setClassName("android.widget.CheckBox");
            }
        } else {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(checkBoxSquare.h);
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        }
        StringBuilder sb = new StringBuilder();
        jia jiaVar = this.b;
        if (jiaVar != null) {
            CharSequence text = jiaVar.getText();
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
        jia jiaVar2 = this.c;
        if (jiaVar2 != null) {
            CharSequence text3 = jiaVar2.getText();
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(this.a0 ? 56.0f : 58.0f) + (this.T ? 1 : 0), TLObject.FLAG_30));
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
        jia jiaVar = this.b;
        jiaVar.setTextSize(15);
        boolean z = k96.a0;
        jiaVar.setLayoutParams(nme.d(-1, 20.0f, (z ? 5 : 3) | 48, z ? 30.0f : i + 66, 10.0f, z ? i + 66 : 30.0f, 0.0f));
        jia jiaVar2 = this.c;
        jiaVar2.setTextSize(13);
        boolean z2 = k96.a0;
        jiaVar2.setLayoutParams(nme.d(-1, 20.0f, (z2 ? 5 : 3) | 48, z2 ? 30.0f : i + 66, 32.0f, z2 ? i + 66 : 30.0f, 0.0f));
        int L = gl.L(22.0f);
        kb0 kb0Var = this.a;
        kb0Var.setRoundRadius(L);
        boolean z3 = k96.a0;
        kb0Var.setLayoutParams(nme.d(44, 44.0f, (z3 ? 5 : 3) | 48, z3 ? 0.0f : i + 8, 6.0f, z3 ? i + 8 : 0.0f, 0.0f));
        wf2 wf2Var = this.e;
        if (wf2Var != null) {
            boolean z4 = k96.a0;
            wf2Var.setLayoutParams(nme.d(24, 24.0f, (z4 ? 5 : 3) | 48, z4 ? 0.0f : i + 37, 32.0f, z4 ? i + 37 : 0.0f, 0.0f));
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
            ote.a(this.y);
            this.y.setImageResource(R.drawable.ic_close_white);
            ImageView imageView3 = this.y;
            int i = bkb.z6;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            wjb wjbVar = this.E;
            zkb.s(imageView3, i, wjbVar, mode);
            ImageView imageView4 = this.y;
            int i2 = bkb.h6;
            zkb.R(imageView4, bkb.f0(bkb.v0(i2, wjbVar), 5, -1), null, zkb.M(i2), wjbVar);
            ImageView imageView5 = this.y;
            boolean z = k96.a0;
            addView(imageView5, nme.d(30, 30.0f, (z ? 3 : 5) | 16, z ? 14.0f : 0.0f, 0.0f, z ? 0.0f : 14.0f, 0.0f));
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

    @Override // tjb
    public final void updateColors() {
        try {
            int i = this.R;
            int i2 = this.S;
            wjb wjbVar = this.E;
            if (!this.b0) {
                this.R = bkb.v0(bkb.x6, wjbVar);
                this.S = bkb.v0(bkb.Yl, wjbVar);
            }
            jia jiaVar = this.c;
            if (jiaVar != null) {
                int textColor = jiaVar.getTextColor();
                if (textColor == i2 && i2 != i) {
                    jiaVar.setTextColor(this.S);
                } else if (textColor == i) {
                    jiaVar.setTextColor(this.R);
                }
            }
            kb0 kb0Var = this.a;
            if (kb0Var != null) {
                kb0Var.invalidate();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public v6c(Context context, int i, int i2, boolean z) {
        this(i, i2, null, context, z, false);
    }
}
