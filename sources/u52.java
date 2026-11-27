// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class u52 extends l69 {
    public final Context c;
    public final boolean d;
    public boolean e;
    public boolean f;
    public final ArrayList h = new ArrayList(8);
    public int n;
    public int r;
    public boolean s;
    public final /* synthetic */ ChatAttachAlertPhotoLayout w;

    public u52(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, boolean z) {
        this.w = chatAttachAlertPhotoLayout;
        this.c = context;
        this.d = z;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        return false;
    }

    @Override // l69
    public final boolean E(d79 d79Var) {
        do6 do6Var;
        boolean isEmpty = ChatAttachAlertPhotoLayout.s1.isEmpty();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        return !(isEmpty && ((do6Var = chatAttachAlertPhotoLayout.U0) == null || do6Var.e.isEmpty())) && chatAttachAlertPhotoLayout.b.L1 && b() > 30;
    }

    @Override // l69
    public final String F(int i) {
        no6 M = M(i);
        if (M == null) {
            int i2 = this.r;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
            if (i <= i2) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.s1;
                if (arrayList.isEmpty()) {
                    do6 do6Var = chatAttachAlertPhotoLayout.U0;
                    if (do6Var != null) {
                        M = (no6) do6Var.e.get(0);
                    }
                } else {
                    M = (no6) arrayList.get(0);
                }
            } else if (!chatAttachAlertPhotoLayout.U0.e.isEmpty()) {
                M = (no6) c00.g(1, chatAttachAlertPhotoLayout.U0.e);
            }
        }
        if (M == null) {
            return "";
        }
        long j = M.D;
        if (Build.VERSION.SDK_INT <= 28) {
            j /= 1000;
        }
        return ob6.e0(j, true);
    }

    @Override // l69
    public final void G(d79 d79Var, float f, int[] iArr) {
        int currentActionBarHeight = a.getCurrentActionBarHeight();
        int measuredHeight = d79Var.getChildAt(0).getMeasuredHeight();
        float b = b();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        float ceil = (((int) (Math.ceil(b / chatAttachAlertPhotoLayout.N0) * measuredHeight)) - (d79Var.getMeasuredHeight() - currentActionBarHeight)) * f;
        float f2 = measuredHeight;
        iArr[0] = ((int) (ceil / f2)) * chatAttachAlertPhotoLayout.N0;
        int paddingTop = d79Var.getPaddingTop() + ((int) (ceil % f2)) + ((int) ((1.0f - f) * currentActionBarHeight));
        iArr[1] = paddingTop;
        if (iArr[0] != 0 || paddingTop >= chatAttachAlertPhotoLayout.getListTopPadding()) {
            return;
        }
        iArr[1] = chatAttachAlertPhotoLayout.getListTopPadding() + currentActionBarHeight;
    }

    @Override // l69
    public final float H(d79 d79Var) {
        byte b = this.w.N0;
        int ceil = (int) Math.ceil(this.n / b);
        if (d79Var.getChildCount() != 0) {
            int measuredHeight = d79Var.getChildAt(0).getMeasuredHeight();
            if (RecyclerView.S(d79Var.getChildAt(0)) >= 0) {
                return Utilities.i((((r4 / b) * measuredHeight) - r1.getTop()) / ((ceil * measuredHeight) - (d79Var.getMeasuredHeight() - a.getCurrentActionBarHeight())), 1.0f, 0.0f);
            }
        }
        return 0.0f;
    }

    @Override // l69
    public final void J(d79 d79Var) {
        this.s = false;
        int childCount = d79Var.getChildCount();
        for (int i = 0; i < childCount; i++) {
            d79Var.getChildAt(i).invalidate();
        }
    }

    @Override // l69
    public final void K() {
        this.s = true;
    }

    public final n69 L() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        d88 d88Var = new d88(this.c, chatAttachAlertPhotoLayout.a);
        if (this == chatAttachAlertPhotoLayout.H) {
            d88Var.setOutlineProvider(new dl0(this, (byte) 5));
            d88Var.setClipToOutline(true);
        }
        d88Var.setFastScrollDelegate(new rd1(this, (byte) 18));
        d88Var.setDelegate(new h01(this, d88Var, (byte) 26));
        return new n69(d88Var);
    }

    public final no6 M(int i) {
        boolean z = this.f;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        if (z && i > chatAttachAlertPhotoLayout.N0) {
            i--;
        }
        if (this.d && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
            i--;
        }
        boolean z2 = ChatAttachAlertPhotoLayout.r1;
        return chatAttachAlertPhotoLayout.c0(i);
    }

    @Override // j79
    public final int b() {
        int i = 0;
        this.e = false;
        this.f = false;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        u52 u52Var = chatAttachAlertPhotoLayout.H;
        if (!chatAttachAlertPhotoLayout.w0) {
            return 1;
        }
        boolean z = chatAttachAlertPhotoLayout.Q0;
        if (z && this == u52Var) {
            return 2;
        }
        if (this.d && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
            this.e = true;
            i = 1;
        }
        if (chatAttachAlertPhotoLayout.h1) {
            i++;
        }
        if (z && this == u52Var) {
            i++;
        }
        this.r = i;
        if (!z) {
            i += ChatAttachAlertPhotoLayout.s1.size();
            do6 do6Var = chatAttachAlertPhotoLayout.U0;
            if (do6Var != null) {
                i += do6Var.e.size();
            }
        }
        if (this.e && i > chatAttachAlertPhotoLayout.N0 && !chatAttachAlertPhotoLayout.P0) {
            this.f = true;
            i++;
        }
        if (this == u52Var) {
            i++;
        }
        this.n = i;
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0050 A[RETURN] */
    @Override // j79
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int d(int i) {
        int i2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        u52 u52Var = chatAttachAlertPhotoLayout.H;
        if (!chatAttachAlertPhotoLayout.w0) {
            return 2;
        }
        boolean z = chatAttachAlertPhotoLayout.Q0;
        if (z && this == u52Var) {
            return i == 0 ? 7 : 2;
        }
        boolean z2 = this.d;
        if (z2 && i == 0 && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
            return chatAttachAlertPhotoLayout.P0 ? 8 : 1;
        }
        if (this.f) {
            byte b = chatAttachAlertPhotoLayout.N0;
            if (i == b) {
                return 5;
            }
            if (i > b) {
                i2 = i - 1;
                if (z2) {
                    i2--;
                }
                if (!chatAttachAlertPhotoLayout.h1 && i2 == 0) {
                    return 4;
                }
                if (this == u52Var || i != this.n - 1) {
                    return !z ? 3 : 0;
                }
                return 2;
            }
        }
        i2 = i;
        if (z2) {
        }
        if (!chatAttachAlertPhotoLayout.h1) {
        }
        if (this == u52Var) {
        }
        if (!z) {
        }
    }

    @Override // j79
    public final void f() {
        super.f();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        if (this == chatAttachAlertPhotoLayout.H) {
            chatAttachAlertPhotoLayout.I.setVisibility((!(b() == 1 && !chatAttachAlertPhotoLayout.Q0 && chatAttachAlertPhotoLayout.U0 == null) && chatAttachAlertPhotoLayout.w0) ? 4 : 0);
        }
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        n12 n12Var = chatAttachAlertPhotoLayout.b;
        int i2 = f89Var.f;
        View view = f89Var.a;
        boolean z = this.d;
        if (i2 != 0) {
            if (i2 == 1) {
                ((x78) view).setItemSize(chatAttachAlertPhotoLayout.L0);
                return;
            }
            if (i2 != 3) {
                if (i2 == 7) {
                    ((jt4) view).setUseAnEmojiVisible(chatAttachAlertPhotoLayout.h1);
                    return;
                }
                return;
            } else {
                y78 y78Var = (y78) view;
                y78Var.setItemSize(chatAttachAlertPhotoLayout.L0);
                y78Var.setType((z && chatAttachAlertPhotoLayout.P0 && i == 0) ? 0 : 1);
                return;
            }
        }
        if (this.f && i > chatAttachAlertPhotoLayout.N0) {
            i--;
        }
        if (z && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
            i--;
        }
        if (chatAttachAlertPhotoLayout.h1) {
            i--;
        }
        d88 d88Var = (d88) view;
        if (this == chatAttachAlertPhotoLayout.H) {
            d88Var.setItemSize(chatAttachAlertPhotoLayout.L0);
        } else {
            d88Var.setIsVertical(chatAttachAlertPhotoLayout.s.o);
        }
        if (n12Var.N2 != 0 || n12Var.Q2 || n12Var.B1) {
            d88Var.getCheckBox().setVisibility(8);
        } else {
            d88Var.getCheckBox().setVisibility(0);
        }
        no6 c0 = chatAttachAlertPhotoLayout.c0(i);
        if (c0 == null) {
            return;
        }
        int i3 = c0.C;
        HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
        d88Var.d(c0, hashMap.size() > 1, z && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0, i == b() - 1, n12Var != null && n12Var.c2);
        if ((n12Var.Z1 instanceof zu1) && n12Var.Q3) {
            d88Var.b(ChatAttachAlertPhotoLayout.u1.indexOf(Integer.valueOf(i3)), hashMap.containsKey(Integer.valueOf(i3)), false);
        } else {
            d88Var.b(-1, hashMap.containsKey(Integer.valueOf(i3)), false);
        }
        if (!chatAttachAlertPhotoLayout.x0 && c0.b) {
            d88Var.setAlpha(0.3f);
        } else if (chatAttachAlertPhotoLayout.y0 || c0.b) {
            d88Var.setAlpha(1.0f);
        } else {
            d88Var.setAlpha(0.3f);
        }
        d88Var.getImageView().setTag(Integer.valueOf(i));
        d88Var.setTag(Integer.valueOf(i));
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.w;
        n12 n12Var = chatAttachAlertPhotoLayout.b;
        vnb vnbVar = chatAttachAlertPhotoLayout.a;
        if (i == 0) {
            ArrayList arrayList = this.h;
            if (arrayList.isEmpty()) {
                return L();
            }
            n69 n69Var = (n69) arrayList.get(0);
            arrayList.remove(0);
            return n69Var;
        }
        Context context = this.c;
        if (i == 1) {
            x78 x78Var = new x78(context);
            x78Var.setFocusable(true);
            x78Var.a = hl.L(0.0f);
            return new n69(x78Var);
        }
        byte b = 5;
        if (i == 2) {
            return new n69(new tb((byte) 5, context, this));
        }
        if (i == 4) {
            n12Var.getClass();
            return new n69(new t52(this, context));
        }
        if (i == 5) {
            return new n69(new View(context));
        }
        byte b2 = 17;
        if (i == 7) {
            jt4 jt4Var = new jt4(context, n12Var.G3);
            jt4Var.setLayoutParams(new r79(-1, hl.L(400.0f)));
            jt4Var.setGravity(17);
            jt4Var.isClickable();
            jt4Var.b.setOnClickListener(new mh3(new z42(chatAttachAlertPhotoLayout, b), (byte) 21));
            jt4Var.a.setOnClickListener(new mh3(new z42(chatAttachAlertPhotoLayout, (byte) 6), (byte) 22));
            jt4Var.c.setOnClickListener(new je3(jt4Var, new te2(this, (byte) 18), b2));
            return new n69(jt4Var);
        }
        if (i == 8) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(new r79(-1, hl.L(56.0f)));
            c51 c51Var = new c51(vnbVar, context, true);
            c51Var.setUseWrapContent(true);
            c51Var.f();
            c51Var.setPadding(hl.L(28.0f), 0, hl.L(28.0f), 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
            spannableStringBuilder.setSpan(new wm2(R.drawable.camera, 0), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) ob6.M0(2131750442, null));
            c51Var.i(spannableStringBuilder, false, true);
            frameLayout.addView(c51Var, tre.d(-2, 44.0f, 81, 10.0f, 0.0f, 10.0f, 12.0f));
            return new n69(frameLayout);
        }
        y78 y78Var = new y78(context);
        ImageView imageView = new ImageView(context);
        y78Var.a = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i2 = aob.aa;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        yob.s(imageView, i2, vnbVar, mode);
        y78Var.addView(imageView, tre.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
        ImageView imageView2 = new ImageView(context);
        y78Var.b = imageView2;
        imageView2.setScaleType(scaleType);
        yob.s(imageView2, aob.ba, vnbVar, mode);
        y78Var.addView(imageView2, tre.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
        TextView textView = new TextView(context);
        y78Var.c = textView;
        yob.X(textView, aob.ca, vnbVar);
        textView.setTextSize(1, 12.0f);
        textView.setGravity(17);
        y78Var.addView(textView, tre.d(-2, -2.0f, 17, 5.0f, 13.0f, 5.0f, 0.0f));
        y78Var.d = hl.L(80.0f);
        return new n69(y78Var);
    }

    @Override // j79
    public final void y(f89 f89Var) {
        if (f89Var.a instanceof x78) {
            this.w.R.i();
        }
    }
}
