package yf;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import g7.e6;
import ih.i3;
import ih.x7;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import kh.a5;
import kh.b4;
import kh.n5;
import kh.o5;
import kh.p4;
import kh.v4;
import kh.y4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.d01;
import org.telegram.ui.Components.gd0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ju0;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.qg;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.wu0;
import org.telegram.ui.Components.wy;
import org.telegram.ui.Components.y5;
import org.telegram.ui.Components.yu0;
import org.telegram.ui.gq0;
import org.telegram.ui.xs0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class l0 extends yu0 implements q1, h, m1, wu0, NotificationCenter.NotificationCenterDelegate {
    public final Bitmap A0;
    public boolean A1;
    public final xf.t1 B0;
    public o1.j B1;
    public final DispatchQueue C0;
    public final i0 C1;
    public final MediaController.CropState D0;
    public final Paint D1;
    public float E0;
    public final Paint E1;
    public float F0;
    public final Paint F1;
    public float G0;
    public final xf.q1 G1;
    public float H0;
    public boolean H1;
    public float I0;
    public o1.j I1;
    public float J0;
    public float J1;
    public float K0;
    public final Paint K1;
    public boolean L0;
    public final int L1;
    public float M0;
    public final mg.a M1;
    public qu0 N0;
    public org.telegram.ui.ActionBar.o1 N1;
    public j O0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout O1;
    public boolean P0;
    public Rect P1;
    public int Q0;
    public Runnable Q1;
    public final boolean R0;
    public final xf.s0 R1;
    public final b0 S0;
    public boolean S1;
    public final d0 T0;
    public float T1;
    public final g0 U0;
    public boolean U1;
    public final f0 V0;
    public final y5 V1;
    public d01 W0;
    public final Paint W1;
    public final FrameLayout X0;
    public final Paint X1;
    public final j0 Y0;
    public kg.d Y1;
    public final h0 Z0;
    public final float[] Z1;
    public final FrameLayout a1;
    public final int[] a2;
    public n5 b1;
    public wy b2;
    public int c1;
    public boolean c2;
    public int d1;
    public boolean d2;
    public float e1;
    public boolean e2;
    public ValueAnimator f1;
    public int f2;
    public boolean g1;
    public int g2;
    public final w1 h1;
    public int h2;
    public final n5.a0 i1;
    public int i2;
    public ArrayList j1;
    public boolean j2;
    public final int k1;
    public BigInteger l1;
    public TextView m1;
    public TextView n1;
    public TextView o1;
    public final r1 p1;
    public final o1 q1;
    public final t1 r1;
    public final ImageView s1;
    public final LinearLayout t1;
    public final TextView u1;
    public final TextView v1;
    public final f1 w0;
    public final TextView w1;
    public final j1 x0;
    public final Paint x1;
    public float y0;
    public final Paint y1;
    public final Bitmap z0;
    public float z1;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v22, types: [yf.v2] */
    /* JADX WARN: Type inference failed for: r1v25, types: [android.view.View, yf.n2, yf.y] */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r29v0, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout, org.telegram.ui.Components.wu0, org.telegram.ui.Components.xu0, yf.l0, yf.m1, yf.q1] */
    public l0(Context context, Activity activity, int i9, Bitmap bitmap, Bitmap bitmap2, int i10, ArrayList arrayList, MediaController.CropState cropState, gq0 gq0Var, b6 b6Var) {
        super(context, activity);
        int i11;
        Emoji.EmojiSpan[] emojiSpanArr;
        x1 x1Var;
        boolean z10 = false;
        this.c1 = 0;
        this.d1 = -1;
        final xs0 xs0Var = (xs0) this;
        this.i1 = new n5.a0(xs0Var, 21);
        byte b10 = 1;
        this.x1 = new Paint(1);
        this.y1 = new Paint(1);
        this.D1 = new Paint(1);
        this.E1 = new Paint(1);
        this.F1 = new Paint(1);
        xf.q1 q1Var = new xf.q1(1.0f, 0.016773745f, -1);
        this.G1 = q1Var;
        this.K1 = new Paint(1);
        this.U1 = false;
        this.V1 = new y5((View) this, 350L, gr.h);
        this.W1 = new Paint(1);
        Paint paint = new Paint(1);
        this.X1 = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        new Matrix();
        byte b11 = 2;
        this.Z1 = new float[2];
        this.a2 = new int[2];
        new ju0(xs0Var, 10);
        setDelegate(this);
        this.L1 = i9;
        this.M1 = new mg.a(3, b6Var);
        this.D0 = cropState;
        this.R0 = context instanceof BubbleActivity;
        xf.s0 e10 = xf.s0.e(i9);
        this.R1 = e10;
        e10.i(0, true);
        q1Var.a = e10.c();
        q1Var.c = e10.i;
        DispatchQueue dispatchQueue = new DispatchQueue("Paint");
        this.C0 = dispatchQueue;
        this.z0 = bitmap;
        this.A0 = bitmap2;
        this.k1 = i10;
        xf.t1 t1Var = new xf.t1();
        this.B0 = t1Var;
        t1Var.a = new t0.c(xs0Var, 8);
        b0 b0Var = new b0(xs0Var, context, new xf.q0(getPaintingSize(), bitmap2, i10, null), bitmap, bitmap2);
        this.S0 = b0Var;
        b0Var.setDelegate(new c0(xs0Var, gq0Var));
        b0Var.setUndoStore(t1Var);
        b0Var.setQueue(dispatchQueue);
        b0Var.setVisibility(4);
        addView(b0Var, e6.e(-1, -1, 51));
        d0 d0Var = new d0(xs0Var, context);
        this.T0 = d0Var;
        d0Var.setVisibility(4);
        addView(d0Var, e6.e(-1, -1, 51));
        f0 f0Var = new f0(xs0Var, context, new e0(xs0Var));
        this.V0 = f0Var;
        addView(f0Var);
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) arrayList.get(i12);
                byte b12 = mediaEntity.type;
                if (b12 == 0) {
                    ?? i02 = i0(mediaEntity.parentObject, mediaEntity.document, z10);
                    if ((mediaEntity.subType & b11) != 0) {
                        i02.r(z10);
                    }
                    ViewGroup.LayoutParams layoutParams = i02.getLayoutParams();
                    layoutParams.width = mediaEntity.viewWidth;
                    layoutParams.height = mediaEntity.viewHeight;
                    i11 = size;
                    x1Var = i02;
                } else if (b12 == b10) {
                    ?? j02 = j0(z10);
                    j02.setType(mediaEntity.subType);
                    j02.setTypeface(mediaEntity.textTypeface);
                    j02.setBaseFontSize(mediaEntity.fontSize);
                    SpannableString spannableString = new SpannableString(mediaEntity.text);
                    ArrayList<VideoEditedInfo.EmojiEntity> arrayList2 = mediaEntity.entities;
                    int size2 = arrayList2.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        VideoEditedInfo.EmojiEntity emojiEntity = arrayList2.get(i13);
                        int i14 = i13 + 1;
                        VideoEditedInfo.EmojiEntity emojiEntity2 = emojiEntity;
                        t5 t5Var = new t5(emojiEntity2.document_id, j02.getFontMetricsInt());
                        int i15 = emojiEntity2.offset;
                        spannableString.setSpan(t5Var, i15, emojiEntity2.length + i15, 33);
                        size = size;
                        size2 = size2;
                        i13 = i14;
                    }
                    i11 = size;
                    CharSequence replaceEmoji = Emoji.replaceEmoji(spannableString, j02.getFontMetricsInt(), false);
                    if ((replaceEmoji instanceof Spanned) && (emojiSpanArr = (Emoji.EmojiSpan[]) ((Spanned) replaceEmoji).getSpans(0, replaceEmoji.length(), Emoji.EmojiSpan.class)) != null) {
                        for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                            emojiSpan.scale = 0.85f;
                        }
                    }
                    j02.setText(replaceEmoji);
                    u0(j02, mediaEntity.textAlign);
                    xf.q1 swatch = j02.getSwatch();
                    swatch.a = mediaEntity.color;
                    j02.setSwatch(swatch);
                    x1Var = j02;
                } else {
                    i11 = size;
                    if (b12 == 2) {
                        x1 h02 = h0(mediaEntity.text, false);
                        h02.x0 = false;
                        if ((mediaEntity.subType & 2) != 0) {
                            h02.r(false);
                        }
                        if ((mediaEntity.subType & 16) != 0) {
                            h02.t(false);
                        }
                        ViewGroup.LayoutParams layoutParams2 = h02.getLayoutParams();
                        layoutParams2.width = mediaEntity.viewWidth;
                        layoutParams2.height = mediaEntity.viewHeight;
                        x1Var = h02;
                    } else {
                        i12++;
                        size = i11;
                        z10 = false;
                        b11 = 2;
                        b10 = 1;
                    }
                }
                x1Var.setX((mediaEntity.x * this.N0.a) - (((1.0f - mediaEntity.scale) * mediaEntity.viewWidth) / 2.0f));
                x1Var.setY((mediaEntity.y * this.N0.b) - (((1.0f - mediaEntity.scale) * mediaEntity.viewHeight) / 2.0f));
                x1Var.setPosition(new PointF((mediaEntity.viewWidth / 2.0f) + x1Var.getX(), (mediaEntity.viewHeight / 2.0f) + x1Var.getY()));
                x1Var.setScale(mediaEntity.scale);
                x1Var.setRotation((float) (((-mediaEntity.rotation) / 3.141592653589793d) * 180.0d));
                i12++;
                size = i11;
                z10 = false;
                b11 = 2;
                b10 = 1;
            }
        }
        this.V0.setVisibility(4);
        g0 g0Var = new g0(context);
        this.U0 = g0Var;
        addView(g0Var);
        ?? frameLayout = new FrameLayout(context);
        this.X0 = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        frameLayout.setBackground(new GradientDrawable(orientation, new int[]{-16777216, 0}));
        addView(frameLayout, e6.e(-1, -2, 48));
        ImageView imageView = new ImageView(context);
        this.s1 = imageView;
        imageView.setImageResource(R.drawable.photo_undo2);
        imageView.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        imageView.setBackground(f6.f0(1090519039, 1, -1));
        final int i16 = 0;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: yf.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        xs0 xs0Var2 = xs0Var;
                        b0 b0Var2 = xs0Var2.S0;
                        if (b0Var2 != null && (b0Var2.getCurrentBrush() instanceof xf.l)) {
                            b0Var2.b();
                            xs0Var2.p1.setSelectedIndex(1);
                            xs0Var2.n((xf.m) xf.m.a.get(0));
                            break;
                        } else {
                            xs0Var2.B0.c();
                            break;
                        }
                        break;
                    case 1:
                        xs0 xs0Var3 = xs0Var;
                        b0 b0Var3 = xs0Var3.S0;
                        xf.t1 t1Var2 = xs0Var3.B0;
                        if (t1Var2.a()) {
                            if (b0Var3 != null && (b0Var3.getCurrentBrush() instanceof xf.l)) {
                                b0Var3.b();
                                xs0Var3.p1.setSelectedIndex(1);
                                xs0Var3.n((xf.m) xf.m.a.get(0));
                            }
                            b0Var3.a();
                            t1Var2.c.clear();
                            t1Var2.b.clear();
                            AndroidUtilities.runOnUIThread(new pf.o1(t1Var2, 14));
                            xs0Var3.V0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        xs0 xs0Var4 = xs0Var;
                        j jVar = xs0Var4.O0;
                        if (jVar instanceof v2) {
                            AndroidUtilities.hideKeyboard(((v2) jVar).getFocusedView());
                        }
                        if (xs0Var4.c2) {
                            xs0Var4.l0(false);
                        }
                        xs0Var4.q0(xs0Var4.O0);
                        xs0Var4.r0(null, true);
                        break;
                    default:
                        xs0Var.r0(null, true);
                        break;
                }
            }
        });
        imageView.setAlpha(0.6f);
        imageView.setClickable(false);
        frameLayout.addView(imageView, e6.d(32, 32.0f, 51, 12.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.t1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(f6.f0(822083583, 7, -1));
        linearLayout.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        ll.k(16.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.PhotoEditorZoomOut));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.photo_zoomout);
        linearLayout.addView(imageView2, e6.t(24, 24, 16, 0, 0, 8, 0));
        linearLayout.addView(textView, e6.q(-2, -2, 16));
        linearLayout.setAlpha(0.0f);
        linearLayout.setOnClickListener(new fh.n(27));
        frameLayout.addView(linearLayout, e6.e(-2, 32, 17));
        TextView textView2 = new TextView(context);
        this.u1 = textView2;
        textView2.setBackground(f6.f0(822083583, 7, -1));
        textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        textView2.setText(LocaleController.getString(R.string.PhotoEditorClearAll));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        textView2.setTypeface(AndroidUtilities.bold());
        final int i17 = 1;
        textView2.setTextSize(1, 16.0f);
        textView2.setOnClickListener(new View.OnClickListener() { // from class: yf.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i17) {
                    case 0:
                        xs0 xs0Var2 = xs0Var;
                        b0 b0Var2 = xs0Var2.S0;
                        if (b0Var2 != null && (b0Var2.getCurrentBrush() instanceof xf.l)) {
                            b0Var2.b();
                            xs0Var2.p1.setSelectedIndex(1);
                            xs0Var2.n((xf.m) xf.m.a.get(0));
                            break;
                        } else {
                            xs0Var2.B0.c();
                            break;
                        }
                        break;
                    case 1:
                        xs0 xs0Var3 = xs0Var;
                        b0 b0Var3 = xs0Var3.S0;
                        xf.t1 t1Var2 = xs0Var3.B0;
                        if (t1Var2.a()) {
                            if (b0Var3 != null && (b0Var3.getCurrentBrush() instanceof xf.l)) {
                                b0Var3.b();
                                xs0Var3.p1.setSelectedIndex(1);
                                xs0Var3.n((xf.m) xf.m.a.get(0));
                            }
                            b0Var3.a();
                            t1Var2.c.clear();
                            t1Var2.b.clear();
                            AndroidUtilities.runOnUIThread(new pf.o1(t1Var2, 14));
                            xs0Var3.V0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        xs0 xs0Var4 = xs0Var;
                        j jVar = xs0Var4.O0;
                        if (jVar instanceof v2) {
                            AndroidUtilities.hideKeyboard(((v2) jVar).getFocusedView());
                        }
                        if (xs0Var4.c2) {
                            xs0Var4.l0(false);
                        }
                        xs0Var4.q0(xs0Var4.O0);
                        xs0Var4.r0(null, true);
                        break;
                    default:
                        xs0Var.r0(null, true);
                        break;
                }
            }
        });
        textView2.setAlpha(0.6f);
        TextView g10 = org.telegram.ui.Cells.j2.g(frameLayout, textView2, e6.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f), context);
        this.v1 = g10;
        g10.setBackground(f6.f0(822083583, 7, -1));
        g10.setPadding(org.telegram.ui.Cells.j2.c(8.0f, R.string.Clear, g10), 0, AndroidUtilities.dp(8.0f), 0);
        g10.setGravity(16);
        g10.setTextColor(-1);
        g10.setTypeface(AndroidUtilities.bold());
        g10.setTextSize(1, 16.0f);
        final int i18 = 2;
        g10.setOnClickListener(new View.OnClickListener() { // from class: yf.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i18) {
                    case 0:
                        xs0 xs0Var2 = xs0Var;
                        b0 b0Var2 = xs0Var2.S0;
                        if (b0Var2 != null && (b0Var2.getCurrentBrush() instanceof xf.l)) {
                            b0Var2.b();
                            xs0Var2.p1.setSelectedIndex(1);
                            xs0Var2.n((xf.m) xf.m.a.get(0));
                            break;
                        } else {
                            xs0Var2.B0.c();
                            break;
                        }
                        break;
                    case 1:
                        xs0 xs0Var3 = xs0Var;
                        b0 b0Var3 = xs0Var3.S0;
                        xf.t1 t1Var2 = xs0Var3.B0;
                        if (t1Var2.a()) {
                            if (b0Var3 != null && (b0Var3.getCurrentBrush() instanceof xf.l)) {
                                b0Var3.b();
                                xs0Var3.p1.setSelectedIndex(1);
                                xs0Var3.n((xf.m) xf.m.a.get(0));
                            }
                            b0Var3.a();
                            t1Var2.c.clear();
                            t1Var2.b.clear();
                            AndroidUtilities.runOnUIThread(new pf.o1(t1Var2, 14));
                            xs0Var3.V0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        xs0 xs0Var4 = xs0Var;
                        j jVar = xs0Var4.O0;
                        if (jVar instanceof v2) {
                            AndroidUtilities.hideKeyboard(((v2) jVar).getFocusedView());
                        }
                        if (xs0Var4.c2) {
                            xs0Var4.l0(false);
                        }
                        xs0Var4.q0(xs0Var4.O0);
                        xs0Var4.r0(null, true);
                        break;
                    default:
                        xs0Var.r0(null, true);
                        break;
                }
            }
        });
        g10.setAlpha(0.0f);
        g10.setVisibility(8);
        TextView g11 = org.telegram.ui.Cells.j2.g(frameLayout, g10, e6.d(-2, 32.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f), context);
        this.w1 = g11;
        g11.setBackground(f6.f0(822083583, 7, -1));
        g11.setPadding(org.telegram.ui.Cells.j2.c(8.0f, R.string.Done, g11), 0, AndroidUtilities.dp(8.0f), 0);
        g11.setGravity(16);
        g11.setTextColor(-1);
        g11.setTypeface(AndroidUtilities.bold());
        g11.setTextSize(1, 16.0f);
        final int i19 = 3;
        g11.setOnClickListener(new View.OnClickListener() { // from class: yf.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i19) {
                    case 0:
                        xs0 xs0Var2 = xs0Var;
                        b0 b0Var2 = xs0Var2.S0;
                        if (b0Var2 != null && (b0Var2.getCurrentBrush() instanceof xf.l)) {
                            b0Var2.b();
                            xs0Var2.p1.setSelectedIndex(1);
                            xs0Var2.n((xf.m) xf.m.a.get(0));
                            break;
                        } else {
                            xs0Var2.B0.c();
                            break;
                        }
                        break;
                    case 1:
                        xs0 xs0Var3 = xs0Var;
                        b0 b0Var3 = xs0Var3.S0;
                        xf.t1 t1Var2 = xs0Var3.B0;
                        if (t1Var2.a()) {
                            if (b0Var3 != null && (b0Var3.getCurrentBrush() instanceof xf.l)) {
                                b0Var3.b();
                                xs0Var3.p1.setSelectedIndex(1);
                                xs0Var3.n((xf.m) xf.m.a.get(0));
                            }
                            b0Var3.a();
                            t1Var2.c.clear();
                            t1Var2.b.clear();
                            AndroidUtilities.runOnUIThread(new pf.o1(t1Var2, 14));
                            xs0Var3.V0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        xs0 xs0Var4 = xs0Var;
                        j jVar = xs0Var4.O0;
                        if (jVar instanceof v2) {
                            AndroidUtilities.hideKeyboard(((v2) jVar).getFocusedView());
                        }
                        if (xs0Var4.c2) {
                            xs0Var4.l0(false);
                        }
                        xs0Var4.q0(xs0Var4.O0);
                        xs0Var4.r0(null, true);
                        break;
                    default:
                        xs0Var.r0(null, true);
                        break;
                }
            }
        });
        g11.setAlpha(0.0f);
        g11.setVisibility(8);
        frameLayout.addView(g11, e6.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        j0 j0Var = new j0(xs0Var, context);
        this.Y0 = j0Var;
        j0Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), 0);
        j0Var.setBackground(new GradientDrawable(orientation, new int[]{0, TLObject.FLAG_31}));
        addView(j0Var, e6.e(-1, 104, 80));
        r1 r1Var = new r1(context, bitmap2 != null);
        this.p1 = r1Var;
        r1Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        r1Var.setDelegate(this);
        r1Var.setSelectedIndex(1);
        j0Var.addView(r1Var, e6.c(48.0f, -1));
        o1 o1Var = new o1(context);
        this.q1 = o1Var;
        o1Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        o1Var.setVisibility(8);
        o1Var.setDelegate(this);
        o1Var.setAlignment(xf.s0.e(i9).g);
        j0Var.addView(o1Var, e6.c(48.0f, -1));
        h0 h0Var = new h0(xs0Var, context);
        this.Z0 = h0Var;
        addView(h0Var, e6.c(-1.0f, -1));
        t1 t1Var2 = new t1(context);
        this.r1 = t1Var2;
        t1Var2.setVisibility(8);
        t1Var2.setOnItemClickListener(new eh.j(xs0Var, 21));
        o1Var.setTypefaceListView(t1Var2);
        h0Var.addView(t1Var2, e6.d(-2, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
        Paint paint2 = this.x1;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.x1.setColor(1728053247);
        this.x1.setStrokeWidth(Math.max(2, AndroidUtilities.dp(1.0f)));
        this.y1.setColor(f6.v0(f6.G8, this.M1));
        i0 i0Var = new i0(xs0Var, context);
        this.C1 = i0Var;
        i0Var.setVisibility(8);
        i0Var.setColorPalette(xf.s0.e(i9));
        i0Var.setColorListener(new m(xs0Var, 0));
        j0Var.addView(i0Var, e6.d(-1, 84.0f, 48, 56.0f, 0.0f, 56.0f, 6.0f));
        setupTabsLayout(context);
        f1 f1Var = new f1(context);
        this.w0 = f1Var;
        f1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        f1Var.setBackground(f6.f0(1090519039, 1, -1));
        j0Var.addView(f1Var, e6.d(32, 32.0f, 83, 12.0f, 0.0f, 0.0f, 4.0f));
        j1 j1Var = new j1(context);
        this.x0 = j1Var;
        j1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        j1Var.setBackground(f6.f0(1090519039, 1, -1));
        j1Var.setOnClickListener(new gd0(xs0Var, context, bitmap2, 8));
        j0Var.addView(j1Var, e6.d(32, 32.0f, 85, 0.0f, 0.0f, 12.0f, 4.0f));
        w1 w1Var = new w1(context);
        this.h1 = w1Var;
        w1Var.setColorSwatch(this.G1);
        w1Var.setRenderView(this.S0);
        w1Var.setValueOverride(this.i1);
        this.G1.c = this.i1.get();
        w1Var.setOnUpdate(new ve.a(xs0Var, i9, 3));
        addView(w1Var, e6.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.a1 = frameLayout2;
        addView(frameLayout2, e6.c(-1.0f, -1));
        this.F1.setStyle(style);
        this.F1.setStrokeWidth(AndroidUtilities.dp(2.0f));
        s0(this.G1, null);
        n((xf.m) xf.m.a.get(0));
        d();
        if (Build.VERSION.SDK_INT >= 29) {
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (AndroidUtilities.displaySize.y * 0.35f), AndroidUtilities.dp(100.0f), (int) (AndroidUtilities.displaySize.y * 0.65d))));
        }
    }

    public static /* synthetic */ void Z(xs0 xs0Var, Integer num) {
        xs0Var.setNewColor(num.intValue());
        xs0Var.w0(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a7 A[Catch: all -> 0x002c, Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:4:0x0003, B:6:0x0022, B:8:0x0026, B:12:0x0036, B:14:0x005a, B:17:0x0061, B:18:0x0068, B:21:0x006d, B:22:0x0077, B:24:0x007d, B:26:0x0091, B:30:0x009b, B:34:0x00a7, B:36:0x00aa, B:41:0x00ad, B:46:0x00b4), top: B:3:0x0003, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a0(l0 l0Var) {
        xf.t0 t0Var;
        boolean z10;
        Bitmap bitmap = l0Var.A0;
        d8.c cVar = null;
        try {
            try {
                d8.b bVar = new d8.b(l0Var.getContext());
                bVar.c(1);
                bVar.b(1);
                bVar.c = false;
                cVar = bVar.a();
                if (!cVar.c.k()) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.e("face detection is not operational");
                    }
                    cVar.N();
                    return;
                }
                a5.m mVar = new a5.m(1);
                a8.b bVar2 = (a8.b) mVar.b;
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                mVar.d = bitmap;
                bVar2.a = width;
                bVar2.b = height;
                bVar2.c = l0Var.getFrameRotation();
                if (((ByteBuffer) mVar.c) == null && ((Bitmap) mVar.d) == null) {
                    throw new IllegalStateException("Missing image data.  Call either setBitmap or setImageData to specify the image");
                }
                try {
                    SparseArray Q = cVar.Q(mVar);
                    ArrayList arrayList = new ArrayList();
                    qu0 paintingSize = l0Var.getPaintingSize();
                    for (int i9 = 0; i9 < Q.size(); i9++) {
                        d8.a aVar = (d8.a) Q.get(Q.keyAt(i9));
                        int i10 = l0Var.k1;
                        if (i10 % 360 != 90 && i10 % 360 != 270) {
                            z10 = false;
                            t0Var = new xf.t0(aVar, bitmap, paintingSize, z10);
                            if (!(t0Var.d == null)) {
                                arrayList.add(t0Var);
                            }
                        }
                        z10 = true;
                        t0Var = new xf.t0(aVar, bitmap, paintingSize, z10);
                        if (!(t0Var.d == null)) {
                        }
                    }
                    l0Var.j1 = arrayList;
                    cVar.N();
                } catch (Throwable th) {
                    FileLog.e(th);
                    cVar.N();
                }
            } catch (Exception e10) {
                FileLog.e(e10);
                if (0 == 0) {
                }
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                cVar.N();
            }
            throw th2;
        }
    }

    public static void b0(l0 l0Var) {
        j jVar;
        f0 f0Var = l0Var.V0;
        j jVar2 = l0Var.O0;
        if (jVar2 != null) {
            PointF A0 = l0Var.A0(jVar2);
            j jVar3 = l0Var.O0;
            if (jVar3 instanceof n2) {
                n2 n2Var = new n2(l0Var.getContext(), (n2) l0Var.O0, A0);
                n2Var.setDelegate(l0Var);
                f0Var.addView(n2Var);
                jVar = n2Var;
            } else if (jVar3 instanceof v2) {
                v2 v2Var = new v2(l0Var.getContext(), (v2) l0Var.O0, A0);
                v2Var.setDelegate(l0Var);
                v2Var.setMaxWidth((int) (l0Var.getPaintingSize().a - 20.0f));
                f0Var.addView(v2Var, e6.c(-2.0f, -2));
                jVar = v2Var;
            } else {
                jVar = null;
            }
            l0Var.p0(jVar);
            l0Var.r0(jVar, true);
        }
        org.telegram.ui.ActionBar.o1 o1Var = l0Var.N1;
        if (o1Var == null || !o1Var.isShowing()) {
            return;
        }
        l0Var.N1.d(true);
    }

    public static void c0(xs0 xs0Var, Integer num) {
        xf.s0 s0Var = xs0Var.R1;
        s0Var.h(num.intValue(), true);
        s0Var.g();
        xs0Var.setNewColor(num.intValue());
        i0 i0Var = xs0Var.C1;
        i0Var.setSelectedColorIndex(s0Var.d());
        i0Var.getAdapter().l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ViewGroup getBarView() {
        return this.c1 == 2 ? this.q1 : this.p1;
    }

    private int getFrameRotation() {
        int i9 = this.k1;
        if (i9 == 90) {
            return 1;
        }
        if (i9 != 180) {
            return i9 != 270 ? 0 : 3;
        }
        return 2;
    }

    private qu0 getPaintingSize() {
        qu0 qu0Var = this.N0;
        if (qu0Var != null) {
            return qu0Var;
        }
        Bitmap bitmap = this.z0;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        int i9 = devicePerformanceClass != 0 ? devicePerformanceClass != 2 ? 2560 : 3840 : 1280;
        qu0 qu0Var2 = new qu0(width, height);
        float f10 = i9;
        qu0Var2.a = f10;
        float floor = (float) Math.floor((f10 * height) / width);
        qu0Var2.b = floor;
        if (floor > f10) {
            qu0Var2.b = f10;
            qu0Var2.a = (float) Math.floor((f10 * width) / height);
        }
        this.N0 = qu0Var2;
        return qu0Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewColor(int i9) {
        xf.q1 q1Var = this.G1;
        int i10 = q1Var.a;
        q1Var.a = i9;
        s0(q1Var, null);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new v4(this, i10, i9, 5));
        duration.start();
    }

    private void setTextType(int i9) {
        this.Q0 = i9;
        j jVar = this.O0;
        if (jVar instanceof v2) {
            ((v2) jVar).setType(i9);
        }
        xf.s0 e10 = xf.s0.e(this.L1);
        e10.h = i9;
        e10.a.edit().putInt("text_type", i9).apply();
        this.q1.setOutlineType(i9);
    }

    private void setupTabsLayout(Context context) {
        n5 n5Var = new n5(this, context);
        this.b1 = n5Var;
        n5Var.setClipToPadding(false);
        this.b1.setOrientation(0);
        this.Y0.addView(this.b1, e6.d(-1, 40.0f, 80, 52.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.m1 = textView;
        textView.setText(LocaleController.getString(R.string.PhotoEditorDraw).toUpperCase());
        TextView textView2 = this.m1;
        int i9 = f6.i6;
        mg.a aVar = this.M1;
        textView2.setBackground(f6.f0(f6.v0(i9, aVar), 7, -1));
        this.m1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.m1.setTextColor(-1);
        this.m1.setTextSize(1, 14.0f);
        this.m1.setGravity(1);
        this.m1.setTypeface(AndroidUtilities.bold());
        this.m1.setSingleLine();
        this.m1.setOnClickListener(new k(this, 0));
        this.b1.addView(this.m1, e6.l(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.n1 = textView3;
        textView3.setText(LocaleController.getString(R.string.PhotoEditorSticker).toUpperCase());
        this.n1.setBackground(f6.f0(f6.v0(i9, aVar), 7, -1));
        this.n1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.n1.setOnClickListener(new k(this, 1));
        this.n1.setTextColor(-1);
        this.n1.setTextSize(1, 14.0f);
        this.n1.setGravity(1);
        this.n1.setTypeface(AndroidUtilities.bold());
        this.n1.setAlpha(0.6f);
        this.n1.setSingleLine();
        this.b1.addView(this.n1, e6.l(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.o1 = textView4;
        textView4.setText(LocaleController.getString(R.string.PhotoEditorText).toUpperCase());
        this.o1.setBackground(f6.f0(f6.v0(i9, aVar), 7, -1));
        this.o1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.o1.setTextColor(-1);
        this.o1.setTextSize(1, 14.0f);
        this.o1.setGravity(1);
        this.o1.setTypeface(AndroidUtilities.bold());
        this.o1.setAlpha(0.6f);
        this.o1.setSingleLine();
        this.o1.setOnClickListener(new k(this, 4));
        this.b1.addView(this.o1, e6.l(1.0f, 0, -2));
    }

    public static void u0(v2 v2Var, int i9) {
        v2Var.setAlign(i9);
        int i10 = 2;
        v2Var.getEditText().setGravity(i9 != 1 ? i9 != 2 ? 19 : 21 : 17);
        if (i9 == 1) {
            i10 = 4;
        } else if (i9 == 2 ? !LocaleController.isRTL : LocaleController.isRTL) {
            i10 = 3;
        }
        v2Var.getEditText().setTextAlignment(i10);
    }

    @Override // yf.q1
    public final void A() {
        y0(new n(this, 4), this, 53, 0, getHeight());
    }

    public final PointF A0(j jVar) {
        MediaController.CropState cropState = this.D0;
        float f10 = cropState != null ? 200.0f / cropState.cropScale : 200.0f;
        if (jVar != null) {
            PointF position = jVar.getPosition();
            return new PointF(position.x + f10, position.y + f10);
        }
        float f11 = cropState != null ? 100.0f / cropState.cropScale : 100.0f;
        PointF g02 = g0();
        while (true) {
            int i9 = 0;
            boolean z10 = false;
            while (true) {
                f0 f0Var = this.V0;
                if (i9 >= f0Var.getChildCount()) {
                    break;
                }
                View childAt = f0Var.getChildAt(i9);
                if (childAt instanceof j) {
                    PointF position2 = ((j) childAt).getPosition();
                    if (((float) Math.sqrt(Math.pow(position2.y - g02.y, 2.0d) + Math.pow(position2.x - g02.x, 2.0d))) < f11) {
                        z10 = true;
                    }
                }
                i9++;
            }
            if (!z10) {
                return g02;
            }
            g02 = new PointF(g02.x + f10, g02.y + f10);
        }
    }

    public final void B0(int i9) {
        if (this.c1 == i9 || this.d1 == i9) {
            return;
        }
        ValueAnimator valueAnimator = this.f1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i10 = this.c1;
        ViewGroup viewGroup = this.q1;
        ViewGroup viewGroup2 = this.p1;
        ViewGroup viewGroup3 = i10 == 0 ? viewGroup2 : i10 == 2 ? viewGroup : null;
        this.d1 = i9;
        ViewGroup viewGroup4 = i9 == 0 ? viewGroup2 : i9 == 2 ? viewGroup : null;
        int i11 = this.L1;
        xf.s0 e10 = xf.s0.e(i11);
        boolean z10 = i9 == 2;
        if (e10.l != z10) {
            e10.l = z10;
            if (z10) {
                e10.i(-1, false);
            } else {
                e10.i(e10.a.getInt("brush", 0), false);
            }
        }
        int c10 = xf.s0.e(i11).c();
        xf.q1 q1Var = this.G1;
        q1Var.a = c10;
        s0(q1Var, null);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        this.f1 = duration;
        duration.setInterpolator(gr.f);
        this.f1.addUpdateListener(new i3(this, viewGroup3, viewGroup4, 4));
        this.f1.addListener(new o5(this, viewGroup3, viewGroup4, i9, 2));
        this.f1.start();
    }

    public final void C0() {
        int i9 = 0;
        while (true) {
            f0 f0Var = this.V0;
            if (i9 >= f0Var.getChildCount()) {
                return;
            }
            View childAt = f0Var.getChildAt(i9);
            if (childAt != this.O0) {
                if (childAt instanceof j) {
                    j jVar = (j) childAt;
                    if (!jVar.h0 && jVar.f0 <= 0.0f) {
                    }
                }
                i9++;
            }
            ((j) childAt).m();
            i9++;
        }
    }

    @Override // yf.m1
    public final void D() {
        z0(true);
    }

    @Override // org.telegram.ui.Components.wu0
    public final void G(int i9, boolean z10) {
        boolean z11;
        if (i9 > AndroidUtilities.dp(50.0f) && this.d2 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            if (z10) {
                this.h2 = i9;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.h2).commit();
            } else {
                this.g2 = i9;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.g2).commit();
            }
        }
        if (this.c2) {
            int i10 = z10 ? this.h2 : this.g2;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.b2.getLayoutParams();
            int i11 = layoutParams.width;
            int i12 = AndroidUtilities.displaySize.x;
            if (i11 != i12 || layoutParams.height != i10) {
                layoutParams.width = i12;
                layoutParams.height = i10;
                this.b2.setLayoutParams(layoutParams);
                this.f2 = layoutParams.height;
                requestLayout();
                b4 b4Var = ((xs0) this).k2.G1;
                if (b4Var != null) {
                    b4Var.a();
                }
                getHeight();
            }
        }
        if (this.i2 == i9 && this.j2 == z10) {
            getHeight();
            return;
        }
        this.i2 = i9;
        this.j2 = z10;
        boolean z12 = this.d2;
        j jVar = this.O0;
        if (jVar instanceof v2) {
            this.d2 = ((v2) jVar).getEditText().isFocused() && i9 > 0;
        } else {
            this.d2 = false;
        }
        if (this.d2 && this.c2) {
            x0(0);
        }
        if (this.f2 != 0 && !(z11 = this.d2) && z11 != z12 && !this.c2) {
            this.f2 = 0;
            requestLayout();
            b4 b4Var2 = ((xs0) this).k2.G1;
            if (b4Var2 != null) {
                b4Var2.a();
            }
        }
        getHeight();
    }

    @Override // yf.q1, yf.m1
    public final void a() {
        w0(true);
    }

    @Override // yf.h
    public final int[] b(j jVar) {
        return k0(jVar);
    }

    @Override // org.telegram.ui.Components.xu0, org.telegram.ui.ActionBar.w5
    public final void d() {
        this.K1.setColor(-15132391);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        f0 f0Var;
        v2 v2Var;
        String str;
        if (i9 != NotificationCenter.customTypefacesLoaded || (f0Var = this.V0) == null) {
            return;
        }
        for (int i11 = 0; i11 < f0Var.getChildCount(); i11++) {
            View childAt = f0Var.getChildAt(i11);
            if ((childAt instanceof v2) && (str = (v2Var = (v2) childAt).w0) != null) {
                v2Var.setTypeface(str);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ae  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        MediaController.CropState cropState;
        int i9;
        g0 g0Var;
        f0 f0Var = this.V0;
        if (view == f0Var) {
            float e10 = this.V1.e(this.S1);
            if (e10 > 0.0f) {
                float dp = AndroidUtilities.dp(24.0f * e10);
                int l1 = f6.l1(e10, 1090519039);
                Paint paint = this.W1;
                paint.setShadowLayer(dp, 0.0f, 0.0f, l1);
                paint.setColor(0);
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                canvas.translate(f0Var.getX(), f0Var.getY());
                canvas.scale(f0Var.getScaleX(), f0Var.getScaleY(), f0Var.getWidth() / 2.0f, f0Var.getHeight() / 2.0f);
                canvas.drawRect(0.0f, 0.0f, f0Var.getWidth(), f0Var.getHeight(), paint);
                canvas.drawRect(0.0f, 0.0f, f0Var.getWidth(), f0Var.getHeight(), this.X1);
                canvas.restore();
                if ((view != this.S0 || view == this.T0 || ((view == f0Var && f0Var.getClipChildren()) || (view == (g0Var = this.U0) && g0Var.getClipChildren()))) && (cropState = this.D0) != null) {
                    canvas.save();
                    r10 = this.R0 ? 0 : AndroidUtilities.statusBarHeight;
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + r10;
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    i9 = cropState.transformRotation;
                    if (i9 != 90 || i9 == 270) {
                        measuredHeight = measuredWidth;
                        measuredWidth = measuredHeight;
                    }
                    int scaleX = (int) ((view.getScaleX() * (measuredWidth * cropState.cropPw)) / cropState.cropScale);
                    int scaleY = (int) ((view.getScaleY() * (measuredHeight * cropState.cropPh)) / cropState.cropScale);
                    float ceil = ((float) Math.ceil((getMeasuredWidth() - scaleX) / 2.0f)) + this.H0;
                    float additionalBottom = (((getAdditionalBottom() + (((getMeasuredHeight() - this.f2) - currentActionBarHeight) - AndroidUtilities.dp(48.0f))) - scaleY) / 2.0f) + AndroidUtilities.dp(8.0f) + r10 + this.I0;
                    canvas.clipRect(Math.max(0.0f, ceil), Math.max(0.0f, additionalBottom), Math.min(ceil + scaleX, getMeasuredWidth()), Math.min(getMeasuredHeight(), additionalBottom + scaleY));
                    r10 = 1;
                }
                boolean drawChild = super.drawChild(canvas, view, j10);
                if (r10 != 0) {
                    canvas.restore();
                }
                return drawChild;
            }
        }
        if (view != this.S0) {
        }
        canvas.save();
        if (this.R0) {
        }
        int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + r10;
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        i9 = cropState.transformRotation;
        if (i9 != 90) {
        }
        measuredHeight2 = measuredWidth2;
        measuredWidth2 = measuredHeight2;
        int scaleX2 = (int) ((view.getScaleX() * (measuredWidth2 * cropState.cropPw)) / cropState.cropScale);
        int scaleY2 = (int) ((view.getScaleY() * (measuredHeight2 * cropState.cropPh)) / cropState.cropScale);
        float ceil2 = ((float) Math.ceil((getMeasuredWidth() - scaleX2) / 2.0f)) + this.H0;
        float additionalBottom2 = (((getAdditionalBottom() + (((getMeasuredHeight() - this.f2) - currentActionBarHeight2) - AndroidUtilities.dp(48.0f))) - scaleY2) / 2.0f) + AndroidUtilities.dp(8.0f) + r10 + this.I0;
        canvas.clipRect(Math.max(0.0f, ceil2), Math.max(0.0f, additionalBottom2), Math.min(ceil2 + scaleX2, getMeasuredWidth()), Math.min(getMeasuredHeight(), additionalBottom2 + scaleY2));
        r10 = 1;
        boolean drawChild2 = super.drawChild(canvas, view, j10);
        if (r10 != 0) {
        }
        return drawChild2;
    }

    @Override // yf.m1
    public final void e() {
        setTextType((this.Q0 + 1) % 4);
    }

    @Override // yf.m1
    public final void f(int i9) {
        j jVar = this.O0;
        if (jVar instanceof v2) {
            u0((v2) jVar, i9);
            xf.s0 e10 = xf.s0.e(this.L1);
            e10.g = i9;
            e10.a.edit().putInt("text_alignment", i9).apply();
        }
    }

    public final void f0(View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(scaleX * 0.5f);
        view.setScaleY(0.5f * scaleY);
        view.setAlpha(0.0f);
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new xf.o0(4, this, (x1) view)).start();
    }

    public final PointF g0() {
        qu0 paintingSize = getPaintingSize();
        float f10 = paintingSize.a / 2.0f;
        float f11 = paintingSize.b / 2.0f;
        if (this.D0 != null) {
            double radians = (float) Math.toRadians(-(r2.transformRotation + r2.cropRotate));
            float cos = (float) ((Math.cos(radians) * r2.cropPx) - (Math.sin(radians) * r2.cropPy));
            float b10 = (float) j3.r0.b(radians, r2.cropPy, Math.sin(radians) * r2.cropPx);
            f10 -= cos * paintingSize.a;
            f11 -= b10 * paintingSize.b;
        }
        return new PointF(f10, f11);
    }

    public int getAdditionalBottom() {
        return AndroidUtilities.dp(24.0f);
    }

    public int getAdditionalTop() {
        return AndroidUtilities.dp(48.0f);
    }

    public View getCancelView() {
        return this.w0;
    }

    @Override // org.telegram.ui.Components.yu0, org.telegram.ui.Components.xu0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public float getCropRotation() {
        MediaController.CropState cropState = this.D0;
        if (cropState != null) {
            return cropState.cropRotate + cropState.transformRotation;
        }
        return 0.0f;
    }

    public View getDoneView() {
        return this.x0;
    }

    public long getLcm() {
        return this.l1.longValue();
    }

    public List<TLRPC.InputDocument> getMasks() {
        t5[] t5VarArr;
        f0 f0Var = this.V0;
        int childCount = f0Var.getChildCount();
        ArrayList arrayList = null;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = f0Var.getChildAt(i9);
            if (childAt instanceof n2) {
                TLRPC.Document sticker = ((n2) childAt).getSticker();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.id = sticker.id;
                tL_inputDocument.access_hash = sticker.access_hash;
                byte[] bArr = sticker.file_reference;
                tL_inputDocument.file_reference = bArr;
                if (bArr == null) {
                    tL_inputDocument.file_reference = new byte[0];
                }
                arrayList.add(tL_inputDocument);
            } else if (childAt instanceof v2) {
                CharSequence text = ((v2) childAt).getText();
                if ((text instanceof Spanned) && (t5VarArr = (t5[]) ((Spanned) text).getSpans(0, text.length(), t5.class)) != null) {
                    for (t5 t5Var : t5VarArr) {
                        if (t5Var != null) {
                            TLRPC.Document document = t5Var.document;
                            if (document == null) {
                                document = k5.f(this.L1, t5Var.getDocumentId());
                            }
                            if (document != null) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                TLRPC.TL_inputDocument tL_inputDocument2 = new TLRPC.TL_inputDocument();
                                tL_inputDocument2.id = document.id;
                                tL_inputDocument2.access_hash = document.access_hash;
                                byte[] bArr2 = document.file_reference;
                                tL_inputDocument2.file_reference = bArr2;
                                if (bArr2 == null) {
                                    tL_inputDocument2.file_reference = new byte[0];
                                }
                                arrayList.add(tL_inputDocument2);
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public float getOffsetTranslationY() {
        return this.y0;
    }

    public int getPKeyboardHeight() {
        return 0;
    }

    public xf.c1 getRenderView() {
        return this.S0;
    }

    public float getSelectedEntityBottom() {
        j jVar = this.O0;
        f0 f0Var = this.V0;
        if (jVar == null) {
            return getY() + f0Var.getMeasuredHeight();
        }
        jVar.getLocationInWindow(new int[2]);
        return (f0Var.getScaleY() * this.O0.getHeight()) + r2[1];
    }

    public d01 getThanosEffect() {
        if (!d01.c()) {
            return null;
        }
        if (this.W0 == null) {
            d01 d01Var = new d01(getContext(), new n(this, 0));
            this.W0 = d01Var;
            addView(d01Var);
        }
        return this.W0;
    }

    public final x1 h0(String str, boolean z10) {
        float f10;
        qu0 qu0Var;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            f10 = options.outWidth / options.outHeight;
        } catch (Exception e10) {
            FileLog.e(e10);
            f10 = 1.0f;
        }
        f0 f0Var = this.V0;
        if (f10 > 1.0f) {
            float floor = (float) Math.floor(f0Var.getMeasuredWidth() * 0.5d);
            qu0Var = new qu0(floor, floor / f10);
        } else {
            float floor2 = (float) Math.floor(f0Var.getMeasuredHeight() * 0.5d);
            qu0Var = new qu0(f10 * floor2, floor2);
        }
        qu0 qu0Var2 = qu0Var;
        Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(str);
        if ((((Integer) imageOrientation.first).intValue() / 90) % 2 == 1) {
            float f11 = qu0Var2.a;
            qu0Var2.a = qu0Var2.b;
            qu0Var2.b = f11;
        }
        Context context = getContext();
        PointF g02 = g0();
        int intValue = ((Integer) imageOrientation.first).intValue();
        ((Integer) imageOrientation.second).getClass();
        x1 x1Var = new x1(context, g02, qu0Var2, str, intValue);
        x1Var.setDelegate(this);
        f0Var.addView(x1Var);
        if (z10) {
            p0(x1Var);
            r0(x1Var, true);
        }
        return x1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final y i0(Object obj, TLRPC.Document document, boolean z10) {
        TLRPC.TL_maskCoords tL_maskCoords;
        float f10;
        kh.f6 f6Var;
        double d;
        kh.f6 f6Var2;
        PointF pointF;
        boolean isTextColorEmoji;
        ArrayList arrayList;
        xf.t0 t0Var;
        kh.f6 f6Var3;
        int i9;
        float f11;
        int i10 = 0;
        while (true) {
            if (i10 >= document.attributes.size()) {
                tL_maskCoords = null;
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                tL_maskCoords = documentAttribute.mask_coords;
                break;
            }
            i10++;
        }
        float f12 = 0.75f;
        MediaController.CropState cropState = this.D0;
        if (cropState != null) {
            f10 = -(cropState.transformRotation + cropState.cropRotate);
            f12 = 0.75f / cropState.cropScale;
        } else {
            f10 = 0.0f;
        }
        kh.f6 f6Var4 = new kh.f6(g0(), f12, f10);
        f0 f0Var = this.V0;
        if (tL_maskCoords == null || (arrayList = this.j1) == null || arrayList.size() == 0) {
            f6Var = f6Var4;
            d = 0.5d;
        } else {
            int i11 = tL_maskCoords.n;
            long j10 = document.id;
            if (i11 >= 0 && i11 <= 3 && !this.j1.isEmpty()) {
                int size = this.j1.size();
                int nextInt = Utilities.random.nextInt(size);
                int i12 = size;
                loop1: while (i12 > 0) {
                    xf.t0 t0Var2 = (xf.t0) this.j1.get(nextInt);
                    if (t0Var2.a(i11) != null) {
                        d = 0.5d;
                        float f13 = t0Var2.a * 1.1f;
                        int i13 = 0;
                        while (i13 < f0Var.getChildCount()) {
                            View childAt = f0Var.getChildAt(i13);
                            xf.t0 t0Var3 = t0Var2;
                            if (childAt instanceof n2) {
                                n2 n2Var = (n2) childAt;
                                if (n2Var.getAnchor() == i11) {
                                    PointF position = n2Var.getPosition();
                                    f6Var3 = f6Var4;
                                    i9 = size;
                                    f11 = f13;
                                    float hypot = (float) Math.hypot(position.x - r4.x, position.y - r4.y);
                                    if ((j10 == n2Var.getSticker().id || this.j1.size() > 1) && hypot < f11) {
                                        break;
                                    }
                                    i13++;
                                    t0Var2 = t0Var3;
                                    f6Var4 = f6Var3;
                                    size = i9;
                                    f13 = f11;
                                }
                            }
                            f6Var3 = f6Var4;
                            i9 = size;
                            f11 = f13;
                            i13++;
                            t0Var2 = t0Var3;
                            f6Var4 = f6Var3;
                            size = i9;
                            f13 = f11;
                        }
                        f6Var = f6Var4;
                        t0Var = t0Var2;
                        break loop1;
                    }
                    f6Var3 = f6Var4;
                    i9 = size;
                    nextInt = (nextInt + 1) % i9;
                    i12--;
                    f6Var4 = f6Var3;
                    size = i9;
                }
            }
            f6Var = f6Var4;
            d = 0.5d;
            t0Var = null;
            if (t0Var != null) {
                PointF a2 = t0Var.a(i11);
                float f14 = i11 == 1 ? t0Var.e : t0Var.a;
                float f15 = t0Var.b;
                float floor = (float) ((f14 / ((float) Math.floor(getPaintingSize().a * d))) * tL_maskCoords.zoom);
                double radians = (float) Math.toRadians(f15);
                double d9 = 1.5707963267948966d - radians;
                double d10 = f14;
                float sin = (float) (Math.sin(d9) * d10 * tL_maskCoords.x);
                float cos = (float) (Math.cos(d9) * d10 * tL_maskCoords.x);
                double d11 = radians + 1.5707963267948966d;
                f6Var2 = new kh.f6(new PointF(a2.x + sin + ((float) (Math.cos(d11) * d10 * tL_maskCoords.y)), a2.y + cos + ((float) (Math.sin(d11) * d10 * tL_maskCoords.y))), floor, f15);
                Context context = getContext();
                float floor2 = (float) Math.floor(getPaintingSize().a * d);
                qu0 qu0Var = new qu0(floor2, floor2);
                pointF = f6Var2.a;
                y yVar = new y(this, context, pointF, f6Var2.c, f6Var2.b, qu0Var, document, obj);
                isTextColorEmoji = MessageObject.isTextColorEmoji(document);
                ImageReceiver imageReceiver = yVar.t0;
                if (isTextColorEmoji) {
                    imageReceiver.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                }
                imageReceiver.setLayerNum(12);
                if (pointF.x == f0Var.getMeasuredWidth() / 2.0f) {
                    yVar.setStickyX(2);
                }
                if (pointF.y == f0Var.getMeasuredHeight() / 2.0f) {
                    yVar.setStickyY(2);
                }
                yVar.setDelegate(this);
                f0Var.addView(yVar);
                if (z10) {
                    p0(yVar);
                    r0(yVar, true);
                }
                return yVar;
            }
        }
        f6Var2 = f6Var;
        Context context2 = getContext();
        float floor22 = (float) Math.floor(getPaintingSize().a * d);
        qu0 qu0Var2 = new qu0(floor22, floor22);
        pointF = f6Var2.a;
        y yVar2 = new y(this, context2, pointF, f6Var2.c, f6Var2.b, qu0Var2, document, obj);
        isTextColorEmoji = MessageObject.isTextColorEmoji(document);
        ImageReceiver imageReceiver2 = yVar2.t0;
        if (isTextColorEmoji) {
        }
        imageReceiver2.setLayerNum(12);
        if (pointF.x == f0Var.getMeasuredWidth() / 2.0f) {
        }
        if (pointF.y == f0Var.getMeasuredHeight() / 2.0f) {
        }
        yVar2.setDelegate(this);
        f0Var.addView(yVar2);
        if (z10) {
        }
        return yVar2;
    }

    public final v2 j0(boolean z10) {
        ((xs0) this).k2.c0.isFocusable();
        qu0 paintingSize = getPaintingSize();
        PointF A0 = A0(null);
        v2 v2Var = new v2(getContext(), A0, (int) (paintingSize.a / 9.0f), "", this.G1, this.Q0);
        float f10 = paintingSize.a / 9.0f;
        n nVar = new n(this, 2);
        v2Var.s0 = (int) (0.5f * f10);
        v2Var.t0 = (int) (f10 * 2.0f);
        v2Var.u0 = nVar;
        float f11 = A0.x;
        f0 f0Var = this.V0;
        if (f11 == f0Var.getMeasuredWidth() / 2.0f) {
            v2Var.setStickyX(2);
        }
        if (A0.y == f0Var.getMeasuredHeight() / 2.0f) {
            v2Var.setStickyY(2);
        }
        v2Var.setDelegate(this);
        v2Var.setMaxWidth((int) (paintingSize.a - 20.0f));
        int i9 = this.L1;
        v2Var.setTypeface(xf.s0.e(i9).j);
        v2Var.setType(xf.s0.e(i9).h);
        f0Var.addView(v2Var, e6.c(-2.0f, -2));
        MediaController.CropState cropState = this.D0;
        if (cropState != null) {
            v2Var.j(1.0f / cropState.cropScale);
            v2Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        if (z10) {
            p0(v2Var);
            v2Var.q();
            r0(v2Var, false);
            v2Var.getFocusedView().requestFocus();
            AndroidUtilities.showKeyboard(v2Var.getFocusedView());
            this.P0 = true;
            int i10 = xf.s0.e(i9).g;
            o1 o1Var = this.q1;
            o1Var.d(i10, true);
            o1Var.setOutlineType(xf.s0.e(i9).h);
        }
        return v2Var;
    }

    @Override // yf.h
    public final boolean k(j jVar) {
        return r0(jVar, true);
    }

    public final int[] k0(j jVar) {
        float[] fArr = this.Z1;
        fArr[0] = jVar.getWidth() / 2.0f;
        fArr[1] = jVar.getHeight() / 2.0f;
        jVar.getMatrix().mapPoints(fArr);
        fArr[0] = fArr[0] + jVar.getLeft();
        fArr[1] = fArr[1] + jVar.getTop();
        Object parent = jVar.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            fArr[0] = fArr[0] - view.getScrollX();
            fArr[1] = fArr[1] - view.getScrollY();
            view.getMatrix().mapPoints(fArr);
            fArr[0] = fArr[0] + view.getLeft();
            fArr[1] = fArr[1] + view.getTop();
            parent = view.getParent();
        }
        int round = Math.round(fArr[0]);
        int[] iArr = this.a2;
        iArr[0] = round;
        int round2 = Math.round(fArr[1]);
        iArr[1] = round2;
        float f10 = iArr[0];
        Point point = AndroidUtilities.displaySize;
        float f11 = round2 - (point.y / 2.0f);
        double d = f10 - (point.x / 2.0f);
        double radians = (float) Math.toRadians(-this.V0.getRotation());
        double d9 = f11;
        iArr[0] = (AndroidUtilities.displaySize.x / 2) + ((int) ((Math.cos(radians) * d) - (Math.sin(radians) * d9)));
        iArr[1] = (AndroidUtilities.displaySize.y / 2) + ((int) j3.r0.b(radians, d9, Math.sin(radians) * d));
        return iArr;
    }

    public final void l0(boolean z10) {
        int i9 = 0;
        if (this.c2) {
            x0(0);
        }
        if (z10) {
            wy wyVar = this.b2;
            if (wyVar == null || wyVar.getVisibility() != 0) {
                m0();
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.b2.getMeasuredHeight());
            ofFloat.addUpdateListener(new o(this, i9));
            this.e2 = true;
            ofFloat.addListener(new z(this, 1));
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(org.telegram.ui.ActionBar.q1.w);
            ofFloat.start();
        }
    }

    public final boolean m(MotionEvent motionEvent) {
        if (this.O0 != null) {
            r0(null, true);
        }
        float x10 = motionEvent.getX();
        b0 b0Var = this.S0;
        float translationX = ((x10 - b0Var.getTranslationX()) - (getMeasuredWidth() / 2.0f)) / b0Var.getScaleX();
        float y10 = ((((motionEvent.getY() - b0Var.getTranslationY()) - (getMeasuredHeight() / 2.0f)) + AndroidUtilities.dp(32.0f)) - ((getAdditionalTop() - getAdditionalBottom()) / 2.0f)) / b0Var.getScaleY();
        double d = translationX;
        double radians = (float) Math.toRadians(-b0Var.getRotation());
        double d9 = y10;
        float measuredWidth = (b0Var.getMeasuredWidth() / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d9)));
        float measuredHeight = (b0Var.getMeasuredHeight() / 2.0f) + ((float) j3.r0.b(radians, d9, Math.sin(radians) * d));
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(measuredWidth, measuredHeight);
        b0Var.e(obtain);
        obtain.recycle();
        return true;
    }

    public final void m0() {
        wy wyVar;
        b4 b4Var;
        if (this.f2 > 0 && (b4Var = ((xs0) this).k2.G1) != null) {
            b4Var.a();
        }
        if (!this.c2 && (wyVar = this.b2) != null && wyVar.getVisibility() != 8) {
            this.b2.setVisibility(8);
        }
        this.f2 = 0;
    }

    @Override // yf.q1
    public final void n(xf.m mVar) {
        boolean z10 = mVar instanceof xf.b;
        w1 w1Var = this.h1;
        if (z10 || (mVar instanceof xf.d)) {
            w1Var.b(0.4f, 1.75f);
        } else {
            w1Var.b(0.05f, 1.0f);
        }
        w1Var.setDrawCenter(!(mVar instanceof xf.l));
        b0 b0Var = this.S0;
        if (b0Var.getCurrentBrush() instanceof xf.l) {
            this.g1 = true;
        }
        b0Var.setBrush(mVar);
        xf.q1 q1Var = this.G1;
        int i9 = q1Var.a;
        q1Var.a = xf.s0.e(this.L1).c();
        q1Var.c = this.i1.get();
        s0(q1Var, Integer.valueOf(i9));
        this.T0.invalidate();
    }

    public final void n0(boolean z10) {
        if (this.c1 == 0) {
            this.h1.setLayerType(z10 ? 2 : 0, null);
            this.Y0.setLayerType(z10 ? 2 : 0, null);
            this.X0.setLayerType(z10 ? 2 : 0, null);
        }
    }

    public final boolean o0() {
        if (this.H1) {
            w0(false);
            return true;
        }
        if (this.c2) {
            l0(true);
            return true;
        }
        if (!this.P0) {
            return false;
        }
        r0(null, true);
        return true;
    }

    @Override // org.telegram.ui.Components.xu0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.customTypefacesLoaded);
    }

    @Override // org.telegram.ui.Components.xu0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.customTypefacesLoaded);
    }

    @Override // org.telegram.ui.Components.yu0, org.telegram.ui.Components.xu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        int i13 = i11 - i9;
        int i14 = i12 - i10;
        if (this.b2 != null) {
            int measuredHeight = AndroidUtilities.isTablet() ? i14 - this.b2.getMeasuredHeight() : (R() + i14) - this.b2.getMeasuredHeight();
            wy wyVar = this.b2;
            wyVar.layout(0, measuredHeight, wyVar.getMeasuredWidth(), this.b2.getMeasuredHeight() + measuredHeight);
        }
        int i15 = this.R0 ? 0 : AndroidUtilities.statusBarHeight;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i15;
        b0 b0Var = this.S0;
        int ceil = (int) Math.ceil((i13 - b0Var.getMeasuredWidth()) / 2.0f);
        int additionalTop = ((getAdditionalTop() - getAdditionalBottom()) / 2) + org.telegram.messenger.l0.C(8.0f, (((i14 - currentActionBarHeight) - AndroidUtilities.dp(48.0f)) - b0Var.getMeasuredHeight()) / 2, i15);
        b0Var.layout(ceil, additionalTop, b0Var.getMeasuredWidth() + ceil, b0Var.getMeasuredHeight() + additionalTop);
        d0 d0Var = this.T0;
        d0Var.layout(ceil, additionalTop, d0Var.getMeasuredWidth() + ceil, d0Var.getMeasuredHeight() + additionalTop);
        int measuredWidth = b0Var.getMeasuredWidth();
        f0 f0Var = this.V0;
        int measuredWidth2 = ((measuredWidth - f0Var.getMeasuredWidth()) / 2) + ceil;
        int measuredHeight2 = ((b0Var.getMeasuredHeight() - f0Var.getMeasuredHeight()) / 2) + additionalTop;
        f0Var.layout(measuredWidth2, measuredHeight2, f0Var.getMeasuredWidth() + measuredWidth2, f0Var.getMeasuredHeight() + measuredHeight2);
        d01 d01Var = this.W0;
        if (d01Var != null) {
            d01Var.layout(measuredWidth2, measuredHeight2, f0Var.getMeasuredWidth() + measuredWidth2, f0Var.getMeasuredHeight() + measuredHeight2);
        }
        g0 g0Var = this.U0;
        g0Var.layout(ceil, additionalTop, g0Var.getMeasuredWidth() + ceil, g0Var.getMeasuredHeight() + additionalTop);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        float currentActionBarHeight;
        float f10;
        this.L0 = true;
        int size = View.MeasureSpec.getSize(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        int currentActionBarHeight2 = (((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getAdditionalTop()) - getAdditionalBottom()) - AndroidUtilities.dp(48.0f);
        Bitmap bitmap = this.z0;
        if (bitmap != null) {
            f10 = bitmap.getWidth();
            currentActionBarHeight = bitmap.getHeight();
        } else {
            currentActionBarHeight = (size2 - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(48.0f);
            f10 = size;
        }
        float f11 = size;
        float floor = (float) Math.floor((f11 * currentActionBarHeight) / f10);
        float f12 = currentActionBarHeight2;
        if (floor > f12) {
            f11 = (float) Math.floor((f10 * f12) / currentActionBarHeight);
            floor = f12;
        }
        int i11 = (int) f11;
        int i12 = (int) floor;
        this.S0.measure(View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30));
        this.T0.measure(View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30));
        float f13 = f11 / this.N0.a;
        this.M0 = f13;
        f0 f0Var = this.V0;
        f0Var.setScaleX(f13);
        f0Var.setScaleY(this.M0);
        f0Var.measure(View.MeasureSpec.makeMeasureSpec((int) this.N0.a, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) this.N0.b, TLObject.FLAG_30));
        d01 d01Var = this.W0;
        if (d01Var != null) {
            d01Var.measure(View.MeasureSpec.makeMeasureSpec((int) this.N0.a, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) this.N0.b, TLObject.FLAG_30));
            this.W0.setScaleX(this.M0);
            this.W0.setScaleY(this.M0);
        }
        C0();
        this.U0.measure(View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30));
        measureChild(this.Y0, i9, i10);
        measureChild(this.h1, i9, i10);
        measureChild(this.a1, i9, i10);
        measureChild(this.Z0, i9, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(getPKeyboardHeight(), this.f2), TLObject.FLAG_30));
        FrameLayout frameLayout = this.X0;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), AndroidUtilities.dp(12.0f) + AndroidUtilities.statusBarHeight, frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        measureChild(frameLayout, i9, i10);
        this.L0 = false;
        if (AndroidUtilities.dp(20.0f) >= 0 && !this.c2 && !this.e2) {
            this.L0 = true;
            m0();
            this.L0 = false;
        }
        if (AndroidUtilities.dp(20.0f) < 0) {
            m0();
        }
        wy wyVar = this.b2;
        if (wyVar != null) {
            measureChild(wyVar, i9, i10);
        }
    }

    public final void p0(j jVar) {
        if (jVar == null) {
            return;
        }
        this.B0.b(jVar.getUUID(), new s(this, jVar, 0));
    }

    public final void q0(j jVar) {
        j jVar2 = this.O0;
        if (jVar == jVar2 && jVar2 != null) {
            jVar2.l(jVar2.i0, false);
            this.O0 = null;
            if (jVar instanceof v2) {
                ValueAnimator valueAnimator = this.f1;
                if (valueAnimator != null && this.d1 != 0) {
                    valueAnimator.cancel();
                }
                B0(0);
            }
        }
        this.V0.removeView(jVar);
        if (jVar != null) {
            UUID uuid = jVar.getUUID();
            xf.t1 t1Var = this.B0;
            t1Var.b.remove(uuid);
            t1Var.c.remove(uuid);
            AndroidUtilities.runOnUIThread(new pf.o1(t1Var, 14));
        }
        w1 w1Var = this.h1;
        n5.a0 a0Var = this.i1;
        w1Var.setValueOverride(a0Var);
        w1Var.setShowPreview(true);
        float f10 = a0Var.get();
        xf.q1 q1Var = this.G1;
        q1Var.c = f10;
        s0(q1Var, null);
    }

    @Override // yf.h
    public final /* synthetic */ boolean r() {
        return true;
    }

    public final boolean r0(j jVar, boolean z10) {
        l0 l0Var;
        boolean z11;
        int i9;
        boolean z12 = jVar instanceof v2;
        int i10 = 2;
        if (z12 && (((i9 = this.d1) == -1 && this.c1 != 2) || (i9 != -1 && i9 != 2))) {
            ValueAnimator valueAnimator = this.f1;
            if (valueAnimator != null && i9 != 2) {
                valueAnimator.cancel();
            }
            if (this.H1) {
                w0(false);
            }
            B0(2);
        }
        if (z12 && z10) {
            v2 v2Var = (v2) jVar;
            int gravity = v2Var.getEditText().getGravity();
            if (gravity == 17) {
                i10 = 1;
            } else if (gravity != 21) {
                i10 = 0;
            }
            o1 o1Var = this.q1;
            o1Var.setAlignment(i10);
            o1Var.setTypeface(v2Var.getTypeface().a);
            o1Var.e(v2Var.getType(), true);
            this.Z0.invalidate();
        }
        j jVar2 = this.O0;
        if (jVar2 == null) {
            l0Var = this;
            z11 = false;
        } else {
            if (jVar2 == jVar) {
                if (!this.P0) {
                    int[] k02 = k0(jVar2);
                    y0(new s(this, jVar2, 1), this, 51, k02[0], k02[1] - AndroidUtilities.dp(32.0f));
                    return true;
                }
                if (jVar2 instanceof v2) {
                    AndroidUtilities.showKeyboard(((v2) jVar2).getFocusedView());
                    l0(false);
                }
                return true;
            }
            l0Var = this;
            jVar2.l(jVar2.i0, false);
            j jVar3 = l0Var.O0;
            if (jVar3 instanceof v2) {
                v2 v2Var2 = (v2) jVar3;
                u2 u2Var = v2Var2.m0;
                u2Var.clearFocus();
                u2Var.setEnabled(false);
                u2Var.setClickable(false);
                v2Var2.m();
                if (!z12) {
                    l0Var.P0 = false;
                    AndroidUtilities.hideKeyboard(((v2) l0Var.O0).getFocusedView());
                    l0(false);
                }
            }
            z11 = true;
        }
        j jVar4 = l0Var.O0;
        l0Var.O0 = jVar;
        if ((jVar4 instanceof v2) && TextUtils.isEmpty(((v2) jVar4).getText())) {
            q0(jVar4);
        }
        j jVar5 = l0Var.O0;
        n5.a0 a0Var = l0Var.i1;
        xf.q1 q1Var = l0Var.G1;
        w1 w1Var = l0Var.h1;
        if (jVar5 == null) {
            ValueAnimator valueAnimator2 = l0Var.f1;
            if (valueAnimator2 != null && l0Var.d1 != 0) {
                valueAnimator2.cancel();
            }
            if (l0Var.H1) {
                w0(false);
            }
            B0(0);
            w1Var.setValueOverride(a0Var);
            w1Var.setShowPreview(true);
            q1Var.c = a0Var.get();
            s0(q1Var, null);
            return z11;
        }
        g0 g0Var = l0Var.U0;
        jVar5.i0 = g0Var;
        jVar5.l(g0Var, true);
        l0Var.V0.bringChildToFront(l0Var.O0);
        j jVar6 = l0Var.O0;
        if (!(jVar6 instanceof v2)) {
            w1Var.setValueOverride(a0Var);
            w1Var.setShowPreview(true);
            q1Var.c = a0Var.get();
            s0(q1Var, null);
            return true;
        }
        v2 v2Var3 = (v2) jVar6;
        v2Var3.v0 = false;
        v2Var3.getSwatch().c = q1Var.c;
        s0(v2Var3.getSwatch(), null);
        w1Var.setValueOverride(new kh.k5(v2Var3, (int) (l0Var.N0.a / 9.0f), 1));
        w1Var.setShowPreview(false);
        return true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.L0) {
            return;
        }
        super.requestLayout();
    }

    @Override // yf.h
    public final boolean s() {
        return !this.P0;
    }

    public final void s0(xf.q1 q1Var, Integer num) {
        xf.q1 q1Var2 = this.G1;
        if (q1Var2 != q1Var) {
            q1Var2.a = q1Var.a;
            q1Var2.b = q1Var.b;
            q1Var2.c = q1Var.c;
            int i9 = this.L1;
            xf.s0.e(i9).h(q1Var.a, true);
            xf.s0.e(i9).j(q1Var.c);
        }
        int i10 = q1Var.a;
        b0 b0Var = this.S0;
        b0Var.setColor(i10);
        b0Var.setBrushSize(q1Var.c);
        int i11 = q1Var2.a;
        if (num == null || num.intValue() == i11) {
            j0 j0Var = this.Y0;
            if (j0Var != null) {
                j0Var.invalidate();
            }
        } else {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new p4(this, num, i11, 2));
            duration.start();
        }
        j jVar = this.O0;
        if (jVar instanceof v2) {
            ((v2) jVar).setSwatch(new xf.q1(q1Var.b, q1Var.c, q1Var.a));
        }
    }

    public void setBlurredBackgroundDrawableForTools(kg.d dVar) {
        dVar.o(AndroidUtilities.dp(4.0f));
        this.Y1 = dVar;
    }

    public void setDrawShadow(boolean z10) {
        this.S1 = z10;
        invalidate();
        setClipChildren(!z10);
    }

    public void setOffsetTranslationX(float f10) {
        if (this.c1 == 0) {
            this.h1.setTranslationX(f10);
        }
    }

    public void setOnDoneButtonClickedListener(Runnable runnable) {
        this.Q1 = runnable;
    }

    public final void t0(float f10) {
        this.y0 = f10;
        this.X0.setTranslationY(-f10);
        this.Y0.setTranslationY(f10);
    }

    @Override // yf.m1
    public final void u() {
        b4 b4Var;
        if (!this.d2 && !this.c2) {
            j0(true);
            return;
        }
        boolean z10 = this.c2;
        if (z10 && (b4Var = ((xs0) this).k2.G1) != null) {
            b4Var.e = true;
        }
        x0(!z10 ? 1 : 0);
        if (z10) {
            j jVar = this.O0;
            if (jVar instanceof v2) {
                AndroidUtilities.showKeyboard(((v2) jVar).getEditText());
            }
        }
    }

    @Override // yf.h
    public final void v(float f10, float f11, float[] fArr) {
        Point point = AndroidUtilities.displaySize;
        double d = f10 - (point.x / 2.0f);
        double radians = (float) Math.toRadians(-this.V0.getRotation());
        double d9 = f11 - (point.y / 2.0f);
        fArr[0] = (AndroidUtilities.displaySize.x / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d9)));
        fArr[1] = (AndroidUtilities.displaySize.y / 2.0f) + ((float) j3.r0.b(radians, d9, Math.sin(radians) * d));
    }

    public final void v0(float f10, float f11, float f12, float f13, float f14) {
        float f15;
        float f16;
        float f17;
        float f18;
        this.E0 = f10;
        this.J0 = f13;
        this.K0 = f14;
        this.F0 = f11;
        this.G0 = f12;
        this.H0 = f11;
        float f19 = f12 + 0.0f;
        this.I0 = f19;
        int i9 = 0;
        while (i9 < 4) {
            View view = i9 == 0 ? this.V0 : i9 == 1 ? this.U0 : i9 == 2 ? this.S0 : this.T0;
            MediaController.CropState cropState = this.D0;
            if (cropState != null) {
                float f20 = cropState.cropScale * 1.0f;
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                if (measuredWidth == 0 || measuredHeight == 0) {
                    return;
                }
                int i10 = cropState.transformRotation;
                if (i10 == 90 || i10 == 270) {
                    measuredHeight = measuredWidth;
                    measuredWidth = measuredHeight;
                }
                float max = Math.max(f13 / ((int) (cropState.cropPw * r12)), f14 / ((int) (cropState.cropPh * r13)));
                f15 = f20 * max;
                float C = e2.c.C(cropState.cropPx, measuredWidth, f10, max);
                float f21 = cropState.cropScale;
                f16 = (C * f21) + f11;
                f17 = (cropState.cropPy * measuredHeight * f10 * max * f21) + f19;
                f18 = cropState.cropRotate + i10;
            } else {
                f15 = i9 == 0 ? this.M0 * 1.0f : 1.0f;
                f16 = f11;
                f17 = f19;
                f18 = 0.0f;
            }
            float f22 = ((-this.f2) / 2.0f) + f17;
            float f23 = f10 * f15;
            if (Float.isNaN(f23)) {
                f23 = 1.0f;
            }
            view.setScaleX(f23);
            view.setScaleY(f23);
            view.setTranslationX(f16);
            view.setTranslationY(f22);
            view.setRotation(f18);
            view.invalidate();
            i9++;
        }
        C0();
        invalidate();
    }

    @Override // yf.h
    public final void w(j jVar) {
        int[] k02 = k0(jVar);
        y0(new s(this, jVar, 1), this, 51, k02[0], k02[1] - AndroidUtilities.dp(32.0f));
    }

    public final void w0(final boolean z10) {
        if (this.H1 != z10) {
            this.H1 = z10;
            o1.j jVar = this.I1;
            if (jVar != null) {
                jVar.c();
            }
            o1.j jVar2 = new o1.j(new gb.a(z10 ? 0.0f : 1000.0f));
            this.I1 = jVar2;
            o1.k kVar = new o1.k();
            kVar.i = z10 ? 1000.0f : 0.0f;
            kVar.b(1250.0f);
            kVar.a(1.0f);
            jVar2.u = kVar;
            int i9 = 1;
            final boolean[] zArr = {this.d2 || this.c2};
            final float translationY = this.Y0.getTranslationY();
            final ViewGroup barView = getBarView();
            this.I1.b(new o1.g() { // from class: yf.t
                @Override // o1.g
                public final void a(o1.h hVar, float f10, float f11) {
                    l0 l0Var = l0.this;
                    j0 j0Var = l0Var.Y0;
                    float f12 = f10 / 1000.0f;
                    l0Var.J1 = f12;
                    float f13 = ((1.0f - f12) * 0.4f) + 0.6f;
                    View view = barView;
                    view.setScaleX(f13);
                    view.setScaleY(f13);
                    view.setTranslationY((Math.min(l0Var.J1, 0.25f) * AndroidUtilities.dp(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(l0Var.J1, 0.25f) / 0.25f));
                    i0 i0Var = l0Var.C1;
                    float f14 = l0Var.J1;
                    boolean z11 = z10;
                    i0Var.y1(f14, z11);
                    l0Var.x0.setProgress(l0Var.J1);
                    l0Var.w0.setProgress(l0Var.J1);
                    l0Var.b1.setTranslationY(AndroidUtilities.dp(32.0f) * l0Var.J1);
                    if (zArr[0]) {
                        float f15 = l0Var.J1;
                        if (!z11) {
                            f15 = 1.0f - f15;
                        }
                        j0Var.setTranslationY(translationY - ((AndroidUtilities.dp(40.0f) * f15) * (z11 ? 1 : -1)));
                    }
                    j0Var.invalidate();
                    if (view == l0Var.q1) {
                        l0Var.Z0.invalidate();
                    }
                }
            });
            this.I1.a(new r(this, z10, i9));
            this.I1.f();
            if (z10) {
                i0 i0Var = this.C1;
                i0Var.setVisibility(0);
                i0Var.setSelectedColorIndex(xf.s0.e(this.L1).d());
            }
        }
    }

    @Override // yf.q1
    public final xf.s0 x() {
        return xf.s0.e(this.L1);
    }

    public final void x0(int i9) {
        o1 o1Var = this.q1;
        int i10 = 0;
        int i11 = 1;
        if (i9 != 1) {
            qg emojiButton = o1Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(og.e, true);
            }
            wy wyVar = this.b2;
            if (wyVar != null) {
                this.c2 = false;
                if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    wyVar.setVisibility(8);
                }
            }
            if (i9 == 0) {
                this.f2 = 0;
            }
            b4 b4Var = ((xs0) this).k2.G1;
            if (b4Var != null) {
                b4Var.a();
            }
            requestLayout();
            getHeight();
            return;
        }
        wy wyVar2 = this.b2;
        boolean z10 = wyVar2 != null && wyVar2.getVisibility() == 0;
        wy wyVar3 = this.b2;
        if (wyVar3 != null && wyVar3.Y0 != UserConfig.selectedAccount) {
            removeView(wyVar3);
            this.b2 = null;
        }
        if (this.b2 == null) {
            wy wyVar4 = new wy(null, true, false, false, getContext(), false, null, null, true, this.M1, false, false);
            this.b2 = wyVar4;
            wyVar4.Q0 = true;
            wyVar4.setVisibility(8);
            if (AndroidUtilities.isTablet()) {
                this.b2.setForseMultiwindowLayout(true);
            }
            this.b2.setDelegate(new a0(this));
            addView(this.b2);
        }
        this.b2.setVisibility(0);
        this.c2 = true;
        wy wyVar5 = this.b2;
        if (this.g2 <= 0) {
            if (AndroidUtilities.isTablet()) {
                this.g2 = AndroidUtilities.dp(150.0f);
            } else {
                this.g2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
            }
        }
        if (this.h2 <= 0) {
            if (AndroidUtilities.isTablet()) {
                this.h2 = AndroidUtilities.dp(150.0f);
            } else {
                this.h2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
            }
        }
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x > point.y ? this.h2 : this.g2;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) wyVar5.getLayoutParams();
        layoutParams.height = i12;
        wyVar5.setLayoutParams(layoutParams);
        if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            j jVar = this.O0;
            if (jVar instanceof v2) {
                AndroidUtilities.hideKeyboard(((v2) jVar).getEditText());
            }
        }
        this.f2 = i12;
        requestLayout();
        b4 b4Var2 = ((xs0) this).k2.G1;
        if (b4Var2 != null) {
            b4Var2.a();
        }
        qg emojiButton2 = o1Var.getEmojiButton();
        if (emojiButton2 != null) {
            emojiButton2.j(og.d, true);
        }
        getHeight();
        if (z10 || this.d2) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f2, 0.0f);
        ofFloat.addUpdateListener(new o(this, i11));
        ofFloat.addListener(new z(this, i10));
        ofFloat.start();
    }

    public final void y0(Runnable runnable, l0 l0Var, int i9, int i10, int i11) {
        org.telegram.ui.ActionBar.o1 o1Var = this.N1;
        if (o1Var != null && o1Var.isShowing()) {
            this.N1.d(true);
            return;
        }
        if (this.O1 == null) {
            this.P1 = new Rect();
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(getContext(), this.M1);
            this.O1 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(true);
            this.O1.setBackgroundColor(-14145495);
            this.O1.setOnTouchListener(new y4(this, 1));
            this.O1.setDispatchKeyEventListener(new q(this));
            this.O1.setShownFromBottom(true);
        }
        this.O1.d();
        runnable.run();
        if (this.N1 == null) {
            org.telegram.ui.ActionBar.o1 o1Var2 = new org.telegram.ui.ActionBar.o1(this.O1, -2, -2);
            this.N1 = o1Var2;
            o1Var2.b = true;
            o1Var2.setAnimationStyle(R.style.PopupAnimation);
            this.N1.setOutsideTouchable(true);
            this.N1.setClippingEnabled(true);
            this.N1.setInputMethodMode(2);
            this.N1.setSoftInputMode(0);
            this.N1.getContentView().setFocusableInTouchMode(true);
            this.N1.setOnDismissListener(new a5(this, 1));
        }
        this.O1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
        this.N1.setFocusable(true);
        this.N1.showAtLocation(l0Var, i9, i10 - (this.O1.getMeasuredWidth() / 2), i11 - this.O1.getMeasuredHeight());
        org.telegram.ui.ActionBar.o1.i(this.O1);
    }

    public final void z0(boolean z10) {
        if (this.A1 != z10) {
            this.A1 = z10;
            o1.j jVar = this.B1;
            if (jVar != null) {
                jVar.c();
            }
            o1.j jVar2 = new o1.j(new gb.a(z10 ? 0.0f : 1000.0f));
            this.B1 = jVar2;
            o1.k kVar = new o1.k();
            kVar.i = z10 ? 1000.0f : 0.0f;
            kVar.b(1250.0f);
            kVar.a(1.0f);
            jVar2.u = kVar;
            if (z10) {
                t1 t1Var = this.r1;
                t1Var.setAlpha(0.0f);
                t1Var.setVisibility(0);
            }
            this.B1.b(new x7(3, this));
            this.B1.a(new r(this, z10, 0));
            this.B1.f();
        }
    }

    @Override // yf.h
    public final /* synthetic */ void B(boolean z10) {
    }

    @Override // yf.h
    public final /* synthetic */ void C() {
    }

    @Override // yf.h
    public final /* synthetic */ void g(boolean z10) {
    }

    public View getView() {
        return this;
    }

    @Override // yf.h
    public final /* synthetic */ void h(boolean z10) {
    }

    @Override // yf.h
    public final /* synthetic */ void j() {
    }

    @Override // yf.h
    public final /* synthetic */ void l() {
    }

    @Override // yf.h
    public final /* synthetic */ void o(boolean z10) {
    }

    @Override // yf.h
    public final /* synthetic */ void y() {
    }
}
