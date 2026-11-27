// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.ParagraphStyle;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class v94 extends FrameLayout implements eu5 {
    public final zc E;
    public final ArrayList F;
    public final ArrayList G;
    public final ArrayList H;
    public t94 I;
    public r47 J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public int O;
    public boolean P;
    public int Q;
    public float R;
    public float S;
    public float T;
    public int U;
    public int V;
    public int W;
    public final int a;
    public int a0;
    public final vnb b;
    public int b0;
    public final de0 c;
    public int c0;
    public final de0[] d;
    public int[] d0;
    public final TextView[] e;
    public int[] e0;
    public final TextView f;
    public String[] f0;
    public float g0;
    public final TextView h;
    public boolean h0;
    public final Paint i0;
    public final TextPaint j0;
    public Drawable k0;
    public boolean l0;
    public boolean m0;
    public final TextView n;
    public boolean n0;
    public final TextView r;
    public final TextView s;
    public final b6 w;
    public final b21 x;
    public final HorizontalScrollView y;

    /* JADX WARN: Multi-variable type inference failed */
    public v94(int i, vnb vnbVar, Context context) {
        super(context);
        this.d = new de0[3];
        this.e = new TextView[2];
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.T = 1.0f;
        int i2 = 0;
        Object[] objArr = 0;
        this.d0 = new int[0];
        this.e0 = new int[0];
        this.f0 = new String[0];
        byte b = 1;
        this.i0 = new Paint(1);
        this.j0 = new TextPaint(1);
        this.a = i;
        this.b = vnbVar;
        setWillNotDraw(false);
        de0 de0Var = new de0(context);
        this.c = de0Var;
        de0Var.setRoundRadius(hl.L(8.0f));
        addView(de0Var);
        int i3 = aob.G6;
        TextView q = q(context, 15, i3);
        this.f = q;
        jn7.i(q);
        q.setTypeface(hl.o());
        q.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        q.setEllipsize(truncateAt);
        addView(q);
        int i4 = aob.q9;
        TextView q2 = q(context, 13, i4);
        this.h = q2;
        q2.setSingleLine(true);
        addView(q2);
        TextView q3 = q(context, 13, i4);
        this.n = q3;
        q3.setSingleLine(true);
        q3.setCompoundDrawablePadding(hl.L(3.0f));
        Drawable mutate = context.getDrawable(R.drawable.msg_views).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(aob.v0(i4, vnbVar), PorterDuff.Mode.SRC_IN));
        mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
        q3.setCompoundDrawables(mutate, null, null, null);
        addView(q3);
        TextView q4 = q(context, 15, aob.g9);
        this.r = q4;
        jn7.i(q4);
        q4.setMaxLines(3);
        q4.setEllipsize(truncateAt);
        q4.setGravity((ob6.a0 ? 5 : 3) | 48);
        addView(q4);
        b6 b6Var = new b6(context, (byte) 13);
        this.w = b6Var;
        b21 b21Var = new b21(context, vnbVar, (byte) 3);
        this.x = b21Var;
        b21Var.setOnLinkPressListener(new r94(this, objArr == true ? 1 : 0));
        b21Var.setTextSize(16.0f);
        yob.X(b21Var, i3, vnbVar);
        b21Var.setLinkTextColor(aob.v0(aob.J6, vnbVar));
        b21Var.setIncludeFontPadding(false);
        b21Var.setGravity((ob6.a0 ? 5 : 3) | 48);
        jn7.i(b21Var);
        b6Var.addView(b21Var);
        addView(b6Var);
        TextView q5 = q(context, 15, aob.n6);
        this.s = q5;
        q5.setText(ob6.M0(2131745067, null));
        q5.setSingleLine(true);
        addView(q5);
        zc zcVar = new zc((byte) 20, context, this);
        this.E = zcVar;
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.y = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setLayoutDirection(0);
        horizontalScrollView.addView(zcVar, new FrameLayout.LayoutParams(-2, -1));
        horizontalScrollView.setVisibility(4);
        horizontalScrollView.setOnScrollChangeListener(new ev(this, b));
        addView(horizontalScrollView);
        int i5 = 0;
        while (true) {
            de0[] de0VarArr = this.d;
            if (i5 >= de0VarArr.length) {
                break;
            }
            de0 de0Var2 = new de0(context);
            de0VarArr[i5] = de0Var2;
            de0Var2.setRoundRadius(hl.L(8.0f));
            de0Var2.getImageReceiver().l1 = (byte) 1;
            addView(de0Var2);
            i5++;
        }
        while (true) {
            TextView[] textViewArr = this.e;
            if (i2 >= textViewArr.length) {
                this.j0.setTextSize(hl.L(12.0f));
                this.j0.setTypeface(hl.o());
                this.j0.setColor(-1);
                return;
            } else {
                TextView d = d(context);
                textViewArr[i2] = d;
                addView(d);
                i2++;
            }
        }
    }

    public static float b(r47 r47Var) {
        int i;
        int i2;
        TLRPC.WebPage webPage;
        TLRPC.Document F0 = r47Var.F0();
        if (F0 != null) {
            ArrayList<TLRPC.DocumentAttribute> arrayList = F0.attributes;
            int size = arrayList.size();
            i = 0;
            i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i3);
                i3++;
                TLRPC.DocumentAttribute documentAttribute2 = documentAttribute;
                if ((documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo) || (documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize)) {
                    i = documentAttribute2.w;
                    i2 = documentAttribute2.h;
                }
            }
        } else {
            i = 0;
            i2 = 0;
        }
        if (i <= 0 || i2 <= 0) {
            TLRPC.MessageMedia n1 = r47.n1(r47Var.k);
            TLRPC.Photo photo = n1 != null ? n1.photo : null;
            if (photo == null && n1 != null && (webPage = n1.webpage) != null) {
                photo = webPage.photo;
            }
            ArrayList<TLRPC.PhotoSize> arrayList2 = photo != null ? photo.sizes : F0 != null ? F0.thumbs : null;
            TLRPC.PhotoSize w = arrayList2 != null ? xb4.w(arrayList2, hl.Y0(false), false, null, false) : null;
            if (w != null) {
                i = w.w;
                i2 = w.h;
            }
        }
        if (i <= 0 || i2 <= 0) {
            return 1.0f;
        }
        return i / i2;
    }

    public static int g() {
        return hl.L(ob6.a0 ? 14.0f : 60.0f);
    }

    public static boolean h(r47 r47Var) {
        TLRPC.WebPage webPage;
        if (r47Var.I1 != null) {
            return true;
        }
        TLRPC.MessageMedia n1 = r47.n1(r47Var.k);
        TLRPC.Photo photo = n1 != null ? n1.photo : null;
        if (photo == null && n1 != null && (webPage = n1.webpage) != null) {
            photo = webPage.photo;
        }
        if (photo != null) {
            return !photo.sizes.isEmpty();
        }
        TLRPC.Document F0 = r47Var.F0();
        return (F0 == null || F0.thumbs.isEmpty()) ? false : true;
    }

    public static float k(float f, float f2, float f3) {
        return Math.max(0.0f, Math.min(1.0f, (f - f2) / (f3 - f2)));
    }

    public static void l(View view, float f) {
        Shader.TileMode tileMode;
        RenderEffect createBlurEffect;
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        float L = hl.L(10.0f) * f;
        if (L < 1.0f) {
            createBlurEffect = null;
        } else {
            tileMode = Shader.TileMode.DECAL;
            createBlurEffect = RenderEffect.createBlurEffect(L, L, tileMode);
        }
        view.setRenderEffect(createBlurEffect);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean n(de0 de0Var, r47 r47Var, int i, boolean z, String str, boolean z2) {
        BitmapDrawable bitmapDrawable;
        jn5 jn5Var;
        jn5 jn5Var2;
        String str2;
        String o;
        TLRPC.WebPage webPage;
        BitmapDrawable bitmapDrawable2 = r47Var.I1;
        TLRPC.MessageMedia n1 = r47.n1(r47Var.k);
        jn5 jn5Var3 = null;
        TLRPC.Photo photo = n1 != null ? n1.photo : null;
        TLRPC.Document F0 = r47Var.F0();
        if (photo == null && n1 != null && (webPage = n1.webpage) != null) {
            photo = webPage.photo;
        }
        if (photo != null) {
            TLRPC.PhotoSize w = xb4.w(photo.sizes, i, z, null, true);
            jn5Var = w != null ? jn5.i(w, photo) : null;
            if (bitmapDrawable2 == null) {
                bitmapDrawable2 = in5.i(photo.sizes);
            }
            ArrayList<TLRPC.PhotoSize> arrayList = photo.sizes;
            TLRPC.PhotoSize w2 = z2 ? xb4.w(arrayList, hl.L(72.0f), true, null, true) : xb4.w(arrayList, 40, false, null, false);
            if (w2 != null && w2 != w) {
                jn5Var3 = jn5.i(w2, photo);
            }
        } else {
            if (F0 == null) {
                bitmapDrawable = bitmapDrawable2;
                jn5Var = null;
                jn5Var2 = null;
                if (jn5Var != null && bitmapDrawable == null && jn5Var2 == null) {
                    return false;
                }
                if (z2) {
                    str2 = str;
                    o = qd4.o(str2, "_b");
                } else {
                    o = "72_72";
                    str2 = str;
                }
                de0Var.a.Z(jn5Var, str2, jn5Var2, o, bitmapDrawable, 0L, null, r47Var, 1);
                de0Var.e();
                return true;
            }
            TLRPC.PhotoSize w3 = xb4.w(F0.thumbs, i, z, null, true);
            jn5Var = w3 != null ? jn5.c(w3, F0) : null;
            if (bitmapDrawable2 == null) {
                bitmapDrawable2 = in5.i(F0.thumbs);
            }
            ArrayList<TLRPC.PhotoSize> arrayList2 = F0.thumbs;
            TLRPC.PhotoSize w4 = z2 ? xb4.w(arrayList2, hl.L(72.0f), true, null, true) : xb4.w(arrayList2, 40, false, null, false);
            if (w4 != null && w4 != w3) {
                jn5Var3 = jn5.c(w4, F0);
            }
        }
        bitmapDrawable = bitmapDrawable2;
        jn5Var2 = jn5Var3;
        if (jn5Var != null) {
        }
        if (z2) {
        }
        de0Var.a.Z(jn5Var, str2, jn5Var2, o, bitmapDrawable, 0L, null, r47Var, 1);
        de0Var.e();
        return true;
    }

    public static String r(r47 r47Var) {
        TLRPC.Document F0 = r47Var.F0();
        if (r47.K4(r47Var.k) && F0 != null) {
            ArrayList<TLRPC.DocumentAttribute> arrayList = F0.attributes;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i);
                i++;
                TLRPC.DocumentAttribute documentAttribute2 = documentAttribute;
                if (documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo) {
                    return hl.g0((int) documentAttribute2.duration, false, false);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [android.text.Spannable] */
    public static CharSequence s(int i, TextPaint textPaint, CharSequence charSequence) {
        CharSequence charSequence2 = charSequence;
        charSequence2 = charSequence;
        if (charSequence != null && i > 0) {
            SpannableStringBuilder spannableStringBuilder = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableStringBuilder(charSequence);
            spannableStringBuilder.setSpan(new u94(textPaint.getFontMetricsInt(), i), 0, spannableStringBuilder.length(), 18);
            charSequence2 = spannableStringBuilder;
        }
        return charSequence2;
    }

    public final void a(boolean z) {
        int L = hl.L(8.0f);
        de0[] de0VarArr = this.d;
        if (!z) {
            de0VarArr[0].getImageReceiver().r0(L, 0, 0, L);
            de0VarArr[1].getImageReceiver().r0(0, L, 0, 0);
            de0VarArr[2].getImageReceiver().r0(0, 0, L, 0);
        } else {
            for (de0 de0Var : de0VarArr) {
                de0Var.setRoundRadius(L);
            }
        }
    }

    public final void c(Canvas canvas) {
        if (!this.P || this.m0) {
            return;
        }
        float U1 = hl.U1(this.R, hl.L(14.0f), hl.L(60.0f));
        if (ob6.a0) {
            canvas.drawLine(0.0f, getHeight() - 1, getWidth() - U1, getHeight() - 1, aob.j0);
        } else {
            canvas.drawLine(U1, getHeight() - 1, getWidth(), getHeight() - 1, aob.j0);
        }
    }

    public final TextView d(Context context) {
        TextView q = q(context, 12, aob.G6);
        q.setTextColor(-1);
        q.setGravity(17);
        q.setPadding(hl.L(4.0f), 0, hl.L(4.0f), 0);
        q.setBackground(aob.b0(hl.L(4.0f), TLObject.FLAG_31));
        return q;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float L;
        float f4 = this.g0;
        if (f4 == 0.0f) {
            super.dispatchDraw(canvas);
            c(canvas);
            return;
        }
        boolean z = ob6.a0;
        int width = getWidth();
        int height = getHeight();
        if (z) {
            float f5 = width;
            f = f5;
            f2 = f5 - f4;
        } else {
            f = f4;
            f2 = 0.0f;
        }
        int i = aob.Fi;
        vnb vnbVar = this.b;
        int v0 = aob.v0(i, vnbVar);
        Paint paint = this.i0;
        paint.setColor(v0);
        float f6 = height;
        canvas.drawRect(f2, 0.0f, f, f6, paint);
        if (this.k0 == null || this.l0 != this.h0) {
            this.l0 = this.h0;
            Drawable mutate = getContext().getDrawable(this.h0 ? R.drawable.news_expanded : R.drawable.news_compact).mutate();
            this.k0 = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        String M0 = ob6.M0(this.h0 ? 2131747994 : 2131747997, null);
        float min = Math.min(1.0f, f4 / hl.L(88.0f));
        if (z) {
            f3 = 2.0f;
            L = width - (hl.L(88.0f) / 2.0f);
        } else {
            f3 = 2.0f;
            L = hl.L(88.0f) / 2.0f;
        }
        float f7 = f6 / f3;
        canvas.save();
        canvas.clipRect(f2, 0.0f, f, f6);
        float R1 = hl.R1(0.6f, 1.0f, min) * (min >= 1.0f ? 1.1f : 1.0f);
        int L2 = hl.L(24.0f);
        canvas.save();
        canvas.scale(R1, R1, L, f7 - hl.L(8.0f));
        float f8 = L2 / f3;
        this.k0.setBounds((int) (L - f8), (int) ((f7 - hl.L(8.0f)) - f8), (int) (L + f8), (int) ((f7 - hl.L(8.0f)) + f8));
        int i2 = (int) (min * 255.0f);
        this.k0.setAlpha(i2);
        this.k0.draw(canvas);
        canvas.restore();
        TextPaint textPaint = this.j0;
        textPaint.setAlpha(i2);
        canvas.drawText(M0, L - (textPaint.measureText(M0) / f3), f7 + hl.L(18.0f), textPaint);
        canvas.restore();
        canvas.save();
        if (z) {
            f4 = -f4;
        }
        canvas.translate(f4, 0.0f);
        paint.setColor(aob.v0(aob.d6, vnbVar));
        canvas.drawRect(0.0f, 0.0f, width, f6, paint);
        super.dispatchDraw(canvas);
        c(canvas);
        canvas.restore();
    }

    @Override // eu5
    public final void e(RectF rectF) {
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    @Override // eu5
    public final void f(Canvas canvas, float f) {
        this.m0 = true;
        draw(canvas);
        this.m0 = false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    public ArrayList<r47> getMedia() {
        return this.H;
    }

    public r47 getMessage() {
        return this.J;
    }

    public int getMorphHeight() {
        return Math.round(hl.U1(this.R, this.U, this.V));
    }

    public float getProgress() {
        return this.R;
    }

    public final boolean i(int i) {
        if (this.R < 1.0f) {
            return false;
        }
        ArrayList arrayList = this.F;
        return i < arrayList.size() && ((de0) arrayList.get(i)).getImageReceiver().C();
    }

    public final void j(View view, float f, float f2, float f3) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        view.setPivotX(ob6.a0 ? measuredWidth : 0.0f);
        view.setPivotY(0.0f);
        view.setScaleX(f3);
        view.setScaleY(f3);
        if (ob6.a0) {
            f = (getMeasuredWidth() - f) - measuredWidth;
        }
        int round = Math.round(f);
        int round2 = Math.round(f2);
        view.layout(round, round2, measuredWidth + round, measuredHeight + round2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0417 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0516 A[LOOP:10: B:251:0x0508->B:253:0x0516, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0568 A[EDGE_INSN: B:254:0x0568->B:255:0x0568 BREAK  A[LOOP:10: B:251:0x0508->B:253:0x0516], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04a7 A[ADDED_TO_REGION, EDGE_INSN: B:293:0x04a7->B:216:0x04a7 BREAK  A[LOOP:7: B:202:0x0457->B:213:0x04a4], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0223 A[LOOP:2: B:97:0x0221->B:98:0x0223, LOOP_END] */
    /* JADX WARN: Type inference failed for: r5v24, types: [java.lang.CharSequence] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(r47 r47Var, ArrayList arrayList) {
        String str;
        int i;
        int e;
        CharSequence charSequence;
        int i2;
        CharSequence charSequence2;
        int i3;
        int i4;
        int length;
        int i5;
        int i6;
        int i7;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int size;
        int i8;
        CharSequence charSequence3;
        boolean isEmpty;
        boolean z;
        int i9;
        CharSequence charSequence4;
        int i10;
        int size2;
        TextView[] textViewArr;
        de0[] de0VarArr;
        int i11;
        int i12;
        ArrayList arrayList4;
        int size3;
        int size4;
        ArrayList arrayList5;
        int i13;
        t94 t94Var;
        int i14;
        CharSequence v1;
        int indexOf;
        ?? v12;
        boolean z2;
        Object[] objArr;
        TextView textView;
        boolean h;
        this.J = r47Var;
        TLRPC.Message message = r47Var.k;
        long B0 = r47.B0(message);
        int i15 = this.a;
        TLObject M0 = B0 < 0 ? uc7.s1(i15).M0(Long.valueOf(-B0)) : uc7.s1(i15).X1(Long.valueOf(B0));
        rb0 rb0Var = new rb0((vnb) null);
        if (M0 instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) M0;
            rb0Var.p(chat);
            str = chat.title;
            i = xc2.F(chat);
        } else if (M0 instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) M0;
            rb0Var.q(user);
            str = lbc.r(user);
            i = lbc.f(user);
        } else {
            str = "";
            i = 0;
        }
        vnb vnbVar = this.b;
        if (i < 7) {
            e = aob.v0(aob.r8[i], vnbVar);
        } else {
            lc7 lc7Var = uc7.s1(i15).E3;
            kc7 d = lc7Var != null ? lc7Var.d(i) : null;
            e = d != null ? d.e(0, vnbVar) : aob.v0(aob.r8[0], vnbVar);
        }
        this.Q = e;
        this.c.f(M0, rb0Var);
        ArrayList arrayList6 = r47Var.a2;
        if (arrayList6 == null || arrayList6.isEmpty() || (charSequence = hl.v1(str, arrayList6, vnbVar)) == null) {
            charSequence = str;
        }
        TextView textView2 = this.f;
        textView2.setText(pv3.m(charSequence, textView2.getPaint().getFontMetricsInt(), false, null, 0));
        long j = message.date;
        long currentTimeMillis = (System.currentTimeMillis() / 1000) - j;
        String P = (currentTimeMillis < 3600 || currentTimeMillis >= 86400) ? ob6.P(j) : ob6.G((int) (currentTimeMillis / 3600), "ShortHoursAgo", new Object[0]);
        TextView textView3 = this.h;
        textView3.setText(P);
        int i16 = message.views;
        String S = i16 > 0 ? ob6.S(null, i16) : null;
        TextView textView4 = this.n;
        textView4.setText(S);
        textView4.setVisibility(message.views > 0 ? 0 : 8);
        boolean z3 = TextUtils.isEmpty(message.message) && message.rich_message == null;
        if (!z3 || message.media == null || r47Var.F3()) {
            i2 = -1;
        } else {
            TLRPC.MessageMedia messageMedia = r47Var.k.media;
            i2 = ((messageMedia instanceof TLRPC.TL_messageMediaPoll) || (messageMedia instanceof TLRPC.TL_messageMediaToDo) || (messageMedia instanceof TLRPC.TL_messageMediaGame) || (messageMedia instanceof TLRPC.TL_messageMediaInvoice)) ? aob.o9 : (r47Var.D != 14 || (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) || (arrayList != null && arrayList.size() > 1)) ? aob.p9 : aob.o9;
        }
        if (!TextUtils.isEmpty(message.message)) {
            charSequence2 = message.message;
        } else if (arrayList == null || arrayList.size() <= 1) {
            charSequence2 = r47Var.D == 14 ? c00.j("🎧 \u2068", r47Var.w1(true), " - ", r47Var.y1(true), "\u2069") : r47Var.v;
        } else {
            int size5 = arrayList.size();
            int i17 = 0;
            boolean z4 = false;
            while (i17 < size5) {
                Object obj = arrayList.get(i17);
                i17++;
                r47 r47Var2 = (r47) obj;
                z4 |= r47.K4(r47Var2.k) || r47Var2.g4();
            }
            charSequence2 = ob6.G(arrayList.size(), z4 ? "Media" : "Photos", new Object[0]);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence2 != null ? charSequence2 : "");
        if (!z3 && r47Var.z != null) {
            if (arrayList != null && !arrayList.isEmpty()) {
                int size6 = arrayList.size();
                int i18 = 0;
                while (true) {
                    if (i18 >= size6) {
                        h = false;
                        break;
                    }
                    Object obj2 = arrayList.get(i18);
                    i18++;
                    if (h((r47) obj2)) {
                        h = true;
                        break;
                    }
                }
            } else {
                h = h(r47Var);
            }
            if (!h) {
                i3 = 0;
                spannableStringBuilder.insert(0, (CharSequence) (r47.K4(r47Var.k) ? "📹 " : r47.Q4(r47Var.k) ? "🎤 " : r47Var.I3() ? "🎧 " : r47.R3(r47Var.k) ? "🖼 " : "📎 "));
                mv3[] mv3VarArr = (mv3[]) spannableStringBuilder.getSpans(i3, spannableStringBuilder.length(), mv3.class);
                for (mv3 mv3Var : mv3VarArr) {
                    spannableStringBuilder.removeSpan(mv3Var);
                }
                for (i4 = 0; i4 < spannableStringBuilder.length(); i4++) {
                    if (spannableStringBuilder.charAt(i4) == '\n') {
                        spannableStringBuilder.replace(i4, i4 + 1, (CharSequence) " ");
                    }
                }
                if (!TextUtils.isEmpty(message.message)) {
                    r47.b(spannableStringBuilder, message.entities, false, true, false, false, 0);
                }
                Object[] spans = spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), Object.class);
                length = spans.length;
                i5 = 0;
                while (i5 < length) {
                    Object obj3 = spans[i5];
                    if ((obj3 instanceof ClickableSpan) || (obj3 instanceof e8c) || (obj3 instanceof TypefaceSpan) || (obj3 instanceof jk2) || (obj3 instanceof fk2) || (obj3 instanceof q19) || (obj3 instanceof ParagraphStyle)) {
                        z2 = z3;
                        objArr = spans;
                        textView = textView3;
                        spannableStringBuilder.removeSpan(obj3);
                    } else if ((obj3 instanceof y7c) || ((obj3 instanceof StyleSpan) && ((StyleSpan) obj3).getStyle() == 1)) {
                        z2 = z3;
                        objArr = spans;
                        textView = textView3;
                        spannableStringBuilder.removeSpan(obj3);
                    } else {
                        if (obj3 instanceof smb) {
                            rmb rmbVar = ((smb) obj3).b;
                            z2 = z3;
                            if (rmbVar.b() == hl.o()) {
                                int spanStart = spannableStringBuilder.getSpanStart(obj3);
                                int spanEnd = spannableStringBuilder.getSpanEnd(obj3);
                                objArr = spans;
                                int spanFlags = spannableStringBuilder.getSpanFlags(obj3);
                                textView = textView3;
                                rmb rmbVar2 = new rmb(rmbVar);
                                rmbVar2.a &= -2;
                                spannableStringBuilder.removeSpan(obj3);
                                if (rmbVar2.a != 0) {
                                    spannableStringBuilder.setSpan(new smb(rmbVar2, 0), spanStart, spanEnd, spanFlags);
                                }
                            }
                        } else {
                            z2 = z3;
                        }
                        objArr = spans;
                        textView = textView3;
                    }
                    i5++;
                    z3 = z2;
                    spans = objArr;
                    textView3 = textView;
                }
                boolean z5 = z3;
                TextView textView5 = textView3;
                if (i2 < 0) {
                    i6 = 0;
                    spannableStringBuilder.setSpan(new ho4(i2, vnbVar), 0, spannableStringBuilder.length(), 33);
                } else {
                    i6 = 0;
                }
                if (arrayList6 != null && !arrayList6.isEmpty()) {
                    indexOf = spannableStringBuilder.toString().toLowerCase().indexOf((String) arrayList6.get(i6));
                    if (indexOf > 40) {
                        int i19 = indexOf - 20;
                        while (true) {
                            if (i19 >= indexOf) {
                                break;
                            }
                            if (Character.isWhitespace(spannableStringBuilder.charAt(i19))) {
                                spannableStringBuilder.delete(0, i19 + 1);
                                spannableStringBuilder.insert(0, (CharSequence) "…");
                                break;
                            }
                            i19++;
                        }
                    }
                    v12 = hl.v1(spannableStringBuilder, arrayList6, vnbVar);
                    if (v12 != 0) {
                        spannableStringBuilder = v12;
                    }
                }
                TextView textView6 = this.r;
                textView6.setText(s((int) (hl.L(19.0f) - textView6.getPaint().getFontSpacing()), textView6.getPaint(), pv3.m(spannableStringBuilder, textView6.getPaint().getFontMetricsInt(), false, null, 0)));
                this.T = 1.0f;
                if (arrayList == null) {
                    i7 = 1;
                    if (arrayList.size() > 1) {
                        arrayList2 = arrayList;
                        arrayList3 = this.H;
                        arrayList3.clear();
                        size = arrayList2.size();
                        i8 = 0;
                        while (i8 < size) {
                            Object obj4 = arrayList2.get(i8);
                            i8++;
                            r47 r47Var3 = (r47) obj4;
                            if (h(r47Var3)) {
                                arrayList3.add(r47Var3);
                            }
                        }
                        if (!TextUtils.isEmpty(message.message)) {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(message.message);
                            r47.b(spannableStringBuilder2, message.entities, false, true, false, false, 0);
                            charSequence3 = spannableStringBuilder2;
                        } else if (!z5 || arrayList3.isEmpty()) {
                            charSequence3 = r47Var.v;
                            if (i2 >= 0 && !TextUtils.isEmpty(charSequence3)) {
                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(charSequence3);
                                spannableStringBuilder3.setSpan(new ho4(i2, vnbVar), 0, spannableStringBuilder3.length(), 33);
                                charSequence3 = spannableStringBuilder3;
                            }
                        } else {
                            charSequence3 = null;
                        }
                        isEmpty = TextUtils.isEmpty(charSequence3);
                        this.L = !isEmpty;
                        if (!isEmpty && arrayList6 != null && !arrayList6.isEmpty() && (v1 = hl.v1(charSequence3, arrayList6, vnbVar)) != null) {
                            charSequence3 = v1;
                        }
                        z = this.L;
                        b21 b21Var = this.x;
                        if (z) {
                            i9 = 0;
                            charSequence4 = s(hl.L(1.0f), b21Var.getPaint(), new SpannableStringBuilder(pv3.m(charSequence3, b21Var.getPaint().getFontMetricsInt(), false, null, 0)));
                        } else {
                            i9 = 0;
                            charSequence4 = null;
                        }
                        b21Var.setText(charSequence4);
                        b21Var.setAlpha(1.0f);
                        this.O = i9;
                        i10 = 0;
                        while (true) {
                            size2 = arrayList2.size();
                            textViewArr = this.e;
                            de0VarArr = this.d;
                            if (i10 >= size2 || (i14 = this.O) >= de0VarArr.length) {
                                break;
                            }
                            de0 de0Var = de0VarArr[i14];
                            de0Var.setImageDrawable(null);
                            if (n(de0Var, (r47) arrayList2.get(i10), hl.L(72.0f), true, "72_72", false)) {
                                int i20 = this.O;
                                if (i20 < textViewArr.length) {
                                    textViewArr[i20].setText(r((r47) arrayList2.get(i10)));
                                }
                                this.O++;
                            }
                            i10++;
                        }
                        this.K = this.O > 0;
                        i11 = 0;
                        while (i11 < de0VarArr.length) {
                            de0VarArr[i11].setVisibility(i11 < this.O ? 0 : 8);
                            if (i11 >= this.O) {
                                de0VarArr[i11].setImageDrawable(null);
                            }
                            i11++;
                        }
                        boolean z6 = this.O < 3;
                        this.N = z6;
                        a(z6);
                        i12 = 0;
                        while (i12 < textViewArr.length) {
                            TextView textView7 = textViewArr[i12];
                            int i21 = this.O;
                            textView7.setVisibility((i12 >= i21 || i21 > 2 || TextUtils.isEmpty(textView7.getText())) ? 8 : 0);
                            i12++;
                        }
                        this.M = false;
                        this.y.scrollTo(0, 0);
                        while (true) {
                            arrayList4 = this.F;
                            size3 = arrayList4.size();
                            size4 = arrayList3.size();
                            arrayList5 = this.G;
                            if (size3 >= size4) {
                                break;
                            }
                            de0 de0Var2 = new de0(getContext());
                            de0Var2.setRoundRadius(hl.L(10.0f));
                            de0Var2.getImageReceiver().l1 = (byte) 2;
                            de0Var2.getImageReceiver().h1 = new lu3(this, (byte) 16);
                            de0Var2.setTag(Integer.valueOf(arrayList4.size()));
                            arrayList4.add(de0Var2);
                            zc zcVar = this.E;
                            zcVar.addView(de0Var2);
                            TextView d2 = d(getContext());
                            d2.setTag(Integer.valueOf(arrayList5.size()));
                            arrayList5.add(d2);
                            zcVar.addView(d2);
                        }
                        i13 = 0;
                        while (i13 < arrayList4.size()) {
                            de0 de0Var3 = (de0) arrayList4.get(i13);
                            TextView textView8 = (TextView) arrayList5.get(i13);
                            de0Var3.setImageDrawable(null);
                            boolean z7 = i13 < arrayList3.size();
                            de0Var3.setVisibility(z7 ? 0 : 8);
                            String r = z7 ? r((r47) arrayList3.get(i13)) : null;
                            textView8.setText(r);
                            textView8.setVisibility(TextUtils.isEmpty(r) ? 8 : 0);
                            i13++;
                        }
                        setContentDescription(str + ", " + ((Object) textView5.getText()) + ", " + ((Object) textView6.getText()));
                        t94Var = this.I;
                        if (t94Var != null) {
                            im7 im7Var = (im7) t94Var;
                            lm7 lm7Var = im7Var.z3;
                            km7 km7Var = (km7) lm7Var.V.get(lm7.B0(im7Var.n3, r47Var));
                            if (km7Var == null) {
                                km7Var = lm7Var.U;
                            }
                            this.R = Math.max(0.0f, Math.min(1.0f, km7Var.a));
                            im7 im7Var2 = (im7) this.I;
                            km7 km7Var2 = (km7) im7Var2.z3.W.get(lm7.B0(im7Var2.n3, r47Var));
                            this.S = Math.max(0.0f, Math.min(1.0f, km7Var2 != null ? km7Var2.a : 0.0f));
                        }
                        requestLayout();
                    }
                } else {
                    i7 = 1;
                }
                arrayList2 = new ArrayList(i7);
                arrayList2.add(r47Var);
                arrayList3 = this.H;
                arrayList3.clear();
                size = arrayList2.size();
                i8 = 0;
                while (i8 < size) {
                }
                if (!TextUtils.isEmpty(message.message)) {
                }
                isEmpty = TextUtils.isEmpty(charSequence3);
                this.L = !isEmpty;
                if (!isEmpty) {
                    charSequence3 = v1;
                }
                z = this.L;
                b21 b21Var2 = this.x;
                if (z) {
                }
                b21Var2.setText(charSequence4);
                b21Var2.setAlpha(1.0f);
                this.O = i9;
                i10 = 0;
                while (true) {
                    size2 = arrayList2.size();
                    textViewArr = this.e;
                    de0VarArr = this.d;
                    if (i10 >= size2) {
                        break;
                    } else {
                        break;
                    }
                    i10++;
                }
                this.K = this.O > 0;
                i11 = 0;
                while (i11 < de0VarArr.length) {
                }
                if (this.O < 3) {
                }
                this.N = z6;
                a(z6);
                i12 = 0;
                while (i12 < textViewArr.length) {
                }
                this.M = false;
                this.y.scrollTo(0, 0);
                while (true) {
                    arrayList4 = this.F;
                    size3 = arrayList4.size();
                    size4 = arrayList3.size();
                    arrayList5 = this.G;
                    if (size3 >= size4) {
                    }
                    de0 de0Var22 = new de0(getContext());
                    de0Var22.setRoundRadius(hl.L(10.0f));
                    de0Var22.getImageReceiver().l1 = (byte) 2;
                    de0Var22.getImageReceiver().h1 = new lu3(this, (byte) 16);
                    de0Var22.setTag(Integer.valueOf(arrayList4.size()));
                    arrayList4.add(de0Var22);
                    zc zcVar2 = this.E;
                    zcVar2.addView(de0Var22);
                    TextView d22 = d(getContext());
                    d22.setTag(Integer.valueOf(arrayList5.size()));
                    arrayList5.add(d22);
                    zcVar2.addView(d22);
                }
                i13 = 0;
                while (i13 < arrayList4.size()) {
                }
                setContentDescription(str + ", " + ((Object) textView5.getText()) + ", " + ((Object) textView6.getText()));
                t94Var = this.I;
                if (t94Var != null) {
                }
                requestLayout();
            }
        }
        i3 = 0;
        mv3[] mv3VarArr2 = (mv3[]) spannableStringBuilder.getSpans(i3, spannableStringBuilder.length(), mv3.class);
        while (r10 < r9) {
        }
        while (i4 < spannableStringBuilder.length()) {
        }
        if (!TextUtils.isEmpty(message.message)) {
        }
        Object[] spans2 = spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), Object.class);
        length = spans2.length;
        i5 = 0;
        while (i5 < length) {
        }
        boolean z52 = z3;
        TextView textView52 = textView3;
        if (i2 < 0) {
        }
        if (arrayList6 != null) {
            indexOf = spannableStringBuilder.toString().toLowerCase().indexOf((String) arrayList6.get(i6));
            if (indexOf > 40) {
            }
            v12 = hl.v1(spannableStringBuilder, arrayList6, vnbVar);
            if (v12 != 0) {
            }
        }
        TextView textView62 = this.r;
        textView62.setText(s((int) (hl.L(19.0f) - textView62.getPaint().getFontSpacing()), textView62.getPaint(), pv3.m(spannableStringBuilder, textView62.getPaint().getFontMetricsInt(), false, null, 0)));
        this.T = 1.0f;
        if (arrayList == null) {
        }
        arrayList2 = new ArrayList(i7);
        arrayList2.add(r47Var);
        arrayList3 = this.H;
        arrayList3.clear();
        size = arrayList2.size();
        i8 = 0;
        while (i8 < size) {
        }
        if (!TextUtils.isEmpty(message.message)) {
        }
        isEmpty = TextUtils.isEmpty(charSequence3);
        this.L = !isEmpty;
        if (!isEmpty) {
        }
        z = this.L;
        b21 b21Var22 = this.x;
        if (z) {
        }
        b21Var22.setText(charSequence4);
        b21Var22.setAlpha(1.0f);
        this.O = i9;
        i10 = 0;
        while (true) {
            size2 = arrayList2.size();
            textViewArr = this.e;
            de0VarArr = this.d;
            if (i10 >= size2) {
            }
            i10++;
        }
        this.K = this.O > 0;
        i11 = 0;
        while (i11 < de0VarArr.length) {
        }
        if (this.O < 3) {
        }
        this.N = z6;
        a(z6);
        i12 = 0;
        while (i12 < textViewArr.length) {
        }
        this.M = false;
        this.y.scrollTo(0, 0);
        while (true) {
            arrayList4 = this.F;
            size3 = arrayList4.size();
            size4 = arrayList3.size();
            arrayList5 = this.G;
            if (size3 >= size4) {
            }
            de0 de0Var222 = new de0(getContext());
            de0Var222.setRoundRadius(hl.L(10.0f));
            de0Var222.getImageReceiver().l1 = (byte) 2;
            de0Var222.getImageReceiver().h1 = new lu3(this, (byte) 16);
            de0Var222.setTag(Integer.valueOf(arrayList4.size()));
            arrayList4.add(de0Var222);
            zc zcVar22 = this.E;
            zcVar22.addView(de0Var222);
            TextView d222 = d(getContext());
            d222.setTag(Integer.valueOf(arrayList5.size()));
            arrayList5.add(d222);
            zcVar22.addView(d222);
        }
        i13 = 0;
        while (i13 < arrayList4.size()) {
        }
        setContentDescription(str + ", " + ((Object) textView52.getText()) + ", " + ((Object) textView62.getText()));
        t94Var = this.I;
        if (t94Var != null) {
        }
        requestLayout();
    }

    public final void o(boolean z, float f) {
        if (this.g0 == f && this.h0 == z) {
            return;
        }
        this.g0 = f;
        this.h0 = z;
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        boolean z2;
        HorizontalScrollView horizontalScrollView;
        de0[] de0VarArr;
        int i6;
        boolean z3;
        float y;
        int i7;
        boolean z4;
        HorizontalScrollView horizontalScrollView2;
        float f;
        de0[] de0VarArr2;
        boolean z5;
        int measuredWidth = getMeasuredWidth();
        float f2 = this.R;
        boolean z6 = ob6.a0;
        de0 de0Var = this.c;
        de0Var.setRoundRadius((int) (de0Var.getMeasuredWidth() / 2.0f));
        j(de0Var, hl.L(14.0f), hl.U1(f2, hl.L(10.0f), hl.L(12.0f)), 1.0f);
        float R1 = hl.R1(0.8666667f, 1.0f, this.R);
        TextView textView = this.f;
        textView.setTextColor(vm2.f(f2, aob.v0(aob.G6, this.b), this.Q));
        j(textView, hl.U1(f2, hl.L(36.0f), hl.L(60.0f)), hl.U1(f2, hl.L(18.0f), hl.L(22.0f)) - ((textView.getMeasuredHeight() * R1) / 2.0f), R1);
        float L = hl.L(36.0f) + (textView.getMeasuredWidth() * R1) + hl.L(6.0f);
        int L2 = measuredWidth - hl.L(14.0f);
        View view = this.h;
        float R12 = hl.R1(L, L2 - view.getMeasuredWidth(), f2);
        j(view, R12, hl.U1(f2, hl.L(18.0f), hl.L(22.0f)) - (view.getMeasuredHeight() / 2.0f), 1.0f);
        float R13 = hl.R1(0.7f, 1.0f, f2);
        float L3 = R12 - hl.L(10.0f);
        View view2 = this.n;
        j(view2, L3 - view2.getMeasuredWidth(), ((view.getMeasuredHeight() - view2.getMeasuredHeight()) / 2.0f) + (hl.U1(f2, hl.L(18.0f), hl.L(22.0f)) - (view.getMeasuredHeight() / 2.0f)), 1.0f);
        view2.setPivotX(ob6.a0 ? 0.0f : view2.getMeasuredWidth());
        view2.setPivotY(view2.getMeasuredHeight() / 2.0f);
        view2.setScaleX(R13);
        view2.setScaleY(R13);
        view2.setAlpha(f2);
        float U1 = hl.U1(f2, hl.L(14.0f), hl.L(60.0f));
        float U12 = hl.U1(f2, hl.L(31.0f), hl.L(36.0f));
        float k = k(f2, 0.0f, 0.6f);
        float k2 = k(f2, 0.3f, 1.0f);
        float R14 = hl.R1(1.0f, 1.0666667f, f2);
        View view3 = this.r;
        j(view3, U1, U12, R14);
        boolean z7 = false;
        view3.setVisibility(k < 1.0f ? 0 : 4);
        view3.setAlpha(this.T * (1.0f - k));
        l(view3, k);
        float R15 = hl.R1(0.875f, 1.0f, f2);
        View view4 = this.w;
        j(view4, U1, U12, R15);
        b21 b21Var = this.x;
        b21Var.layout(0, 0, b21Var.getMeasuredWidth(), b21Var.getMeasuredHeight());
        view4.setAlpha(k2);
        view4.setVisibility((!this.L || k2 <= 0.0f) ? 4 : 0);
        l(view4, 1.0f - k2);
        boolean z8 = true;
        boolean z9 = this.b0 < this.a0;
        float L4 = ((hl.L(4.0f) + view4.getMeasuredHeight()) * R15) + U12;
        View view5 = this.s;
        j(view5, U1, L4, 1.0f);
        float f3 = z9 ? (1.0f - this.S) * k2 : 0.0f;
        view5.setAlpha(f3);
        view5.setVisibility(f3 > 0.0f ? 0 : 4);
        int L5 = this.L ? hl.L(8.0f) + hl.L(36.0f) + view4.getMeasuredHeight() + (z9 ? Math.round((1.0f - this.S) * hl.L(24.0f)) : 0) : hl.L(40.0f);
        HorizontalScrollView horizontalScrollView3 = this.y;
        horizontalScrollView3.layout(0, L5, measuredWidth, horizontalScrollView3.getMeasuredHeight() + L5);
        ArrayList arrayList = this.H;
        boolean z10 = f2 > 0.0f && !arrayList.isEmpty();
        horizontalScrollView3.setVisibility(z10 ? 0 : 4);
        ArrayList arrayList2 = this.F;
        de0[] de0VarArr3 = this.d;
        if (z10 && !this.M && this.e0.length == arrayList.size()) {
            this.M = true;
            float f4 = hl.p;
            if (this.f0.length != arrayList.size()) {
                this.f0 = new String[arrayList.size()];
            }
            int i8 = 0;
            while (i8 < arrayList.size()) {
                String[] strArr = this.f0;
                StringBuilder sb = new StringBuilder();
                boolean z11 = z7;
                sb.append((int) (this.e0[i8] / f4));
                sb.append("_");
                sb.append((int) (this.c0 / f4));
                strArr[i8] = sb.toString();
                r47 r47Var = (r47) arrayList.get(i8);
                if (r47.K4(r47Var.k) && !r47Var.g4()) {
                    boolean z12 = xea.a;
                    if (i86.e(1024) && !r47Var.x3() && !r47Var.t2() && (r47Var.z0 || r47Var.y0 || (r47Var.B() && lq3.q(this.a).d(r47Var)))) {
                        de0 de0Var2 = (de0) arrayList2.get(i8);
                        String str = this.f0[i8];
                        TLRPC.Document F0 = r47Var.F0();
                        i7 = measuredWidth;
                        z4 = z6;
                        horizontalScrollView2 = horizontalScrollView3;
                        jn5 jn5Var = null;
                        f = f4;
                        de0VarArr2 = de0VarArr3;
                        TLRPC.PhotoSize w = xb4.w(F0.thumbs, hl.Y0(z11), z11, null, true);
                        TLRPC.PhotoSize w2 = xb4.w(F0.thumbs, 40, z11, null, z11);
                        ImageReceiver imageReceiver = de0Var2.getImageReceiver();
                        z5 = true;
                        imageReceiver.x0 = true;
                        imageReceiver.u0 = true;
                        imageReceiver.M(1);
                        jn5 b = jn5.b(F0);
                        jn5 c = jn5.c(w, F0);
                        if (w2 != null && w2 != w) {
                            jn5Var = jn5.c(w2, F0);
                        }
                        imageReceiver.Y(b, "g", c, str, jn5Var, qd4.o(str, "_b"), r47Var.I1, F0.size, null, r47Var, 0);
                        imageReceiver.w0(false);
                        i8++;
                        z8 = z5;
                        de0VarArr3 = de0VarArr2;
                        measuredWidth = i7;
                        z6 = z4;
                        horizontalScrollView3 = horizontalScrollView2;
                        f4 = f;
                        z7 = false;
                    }
                }
                i7 = measuredWidth;
                z4 = z6;
                horizontalScrollView2 = horizontalScrollView3;
                f = f4;
                de0VarArr2 = de0VarArr3;
                z5 = z8;
                n((de0) arrayList2.get(i8), r47Var, hl.Y0(z11), false, this.f0[i8], false);
                i8++;
                z8 = z5;
                de0VarArr3 = de0VarArr2;
                measuredWidth = i7;
                z6 = z4;
                horizontalScrollView3 = horizontalScrollView2;
                f4 = f;
                z7 = false;
            }
            i5 = measuredWidth;
            z2 = z6;
            horizontalScrollView = horizontalScrollView3;
            de0VarArr = de0VarArr3;
            z3 = z8;
            for (int i9 = 0; i9 < this.O && i9 < arrayList.size(); i9++) {
                n(de0VarArr[i9], (r47) arrayList.get(i9), hl.Y0(false), false, this.f0[i9], true);
            }
            i6 = 0;
        } else {
            i5 = measuredWidth;
            z2 = z6;
            horizontalScrollView = horizontalScrollView3;
            de0VarArr = de0VarArr3;
            i6 = 0;
            z3 = true;
        }
        int i10 = i6;
        while (i10 < arrayList2.size()) {
            ((de0) arrayList2.get(i10)).setAlpha(i10 < this.O ? i(i10) ? 1.0f : 0.0f : f2);
            ((TextView) this.G.get(i10)).setAlpha(i10 < this.O ? k(f2, 0.6f, 1.0f) : f2);
            i10++;
        }
        boolean z13 = (f2 > 0.0f || this.O < 3) ? z3 : i6;
        if (z13 != this.N) {
            this.N = z13;
            a(z13);
        }
        if (f2 > 0.0f) {
            for (int i11 = i6; i11 < this.O; i11++) {
                de0VarArr[i11].setRoundRadius(Math.round(hl.U1(f2, hl.L(8.0f), hl.L(10.0f))));
            }
        }
        int L6 = hl.L(11.0f);
        if (!z2) {
            L6 = (i5 - L6) - (this.O == 2 ? hl.L(100.0f) : hl.L(72.0f));
        }
        int L7 = hl.L(10.0f);
        int L8 = hl.L(72.0f);
        int D = ik8.D(2.0f, hl.L(72.0f), 2);
        int i12 = i6;
        while (true) {
            int i13 = this.O;
            if (i12 >= i13) {
                break;
            }
            float f5 = L7;
            if (i13 >= 3) {
                y = i12 == 0 ? L6 : (L6 + L8) - D;
                if (i12 == 2) {
                    f5 = (L7 + L8) - D;
                }
            } else {
                y = uh9.y(52.0f, i12, L6);
            }
            if (f2 > 0.0f && i12 < this.d0.length) {
                y = hl.R1(y, (g() + this.d0[i12]) - horizontalScrollView.getScrollX(), f2);
                f5 = hl.R1(f5, L5, f2);
            }
            de0 de0Var3 = de0VarArr[i12];
            int round = Math.round(y);
            int round2 = Math.round(f5);
            de0Var3.layout(round, round2, de0Var3.getMeasuredWidth() + round, de0Var3.getMeasuredHeight() + round2);
            de0Var3.setAlpha(i(i12) ? 0.0f : 1.0f);
            i12++;
        }
        int i14 = i6;
        while (true) {
            TextView[] textViewArr = this.e;
            if (i14 >= textViewArr.length) {
                return;
            }
            TextView textView2 = textViewArr[i14];
            de0 de0Var4 = de0VarArr[i14];
            int right = de0Var4.getRight() - hl.L(4.0f);
            int bottom = de0Var4.getBottom() - hl.L(4.0f);
            textView2.layout(right - textView2.getMeasuredWidth(), bottom - hl.L(16.0f), right, bottom);
            textView2.setAlpha(1.0f - k(f2, 0.0f, 0.4f));
            i14++;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        float f = this.R;
        int L = size - (this.K ? (this.O == 2 ? hl.L(100.0f) : hl.L(72.0f)) + hl.L(40.0f) : hl.L(25.0f));
        TextView textView = this.h;
        int ceil = (int) Math.ceil(textView.getPaint().measureText(textView.getText().toString()));
        int i4 = TLObject.FLAG_30;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(hl.L(57.0f), TLObject.FLAG_31);
        TextView textView2 = this.r;
        textView2.measure(makeMeasureSpec, makeMeasureSpec2);
        this.W = Math.max(1, Math.min(3, textView2.getLineCount()));
        textView2.measure(View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(this.W * 19), TLObject.FLAG_30));
        int D = ik8.D(2.0f, hl.L(72.0f), 2);
        this.U = Math.max(hl.L((this.W * 19) + 42), this.K ? hl.L(94.0f) : 0);
        int L2 = size - hl.L(74.0f);
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(L2, TLObject.FLAG_30);
        b21 b21Var = this.x;
        b21Var.measure(makeMeasureSpec3, 0);
        this.a0 = this.L ? b21Var.getMeasuredHeight() : 0;
        Layout layout = b21Var.getLayout();
        int lineBottom = (layout == null || layout.getLineCount() <= 10) ? this.a0 : layout.getLineBottom(9);
        this.b0 = lineBottom;
        boolean z = lineBottom < this.a0;
        int round = Math.round(hl.U1(this.S, lineBottom, r6));
        this.w.measure(View.MeasureSpec.makeMeasureSpec(L2, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(round, TLObject.FLAG_30));
        this.s.measure(0, View.MeasureSpec.makeMeasureSpec(hl.L(20.0f), TLObject.FLAG_30));
        int round2 = z ? Math.round((1.0f - this.S) * hl.L(24.0f)) : 0;
        ArrayList arrayList = this.H;
        int size2 = arrayList.size();
        if (this.d0.length != size2) {
            this.d0 = new int[size2];
            this.e0 = new int[size2];
        }
        if (size2 == 0) {
            this.c0 = 0;
            i3 = 0;
        } else if (size2 == 1) {
            float b = b((r47) arrayList.get(0));
            float f2 = L2;
            i3 = 0;
            float min = Math.min(f2 / b, Math.min(hl.L(420.0f), f2 * 1.25f));
            this.e0[0] = (int) Math.min(f2, b * min);
            this.c0 = (int) Math.max(min, hl.L(120.0f));
        } else {
            i3 = 0;
            float f3 = L2;
            this.c0 = (int) Math.min(hl.L(220.0f), 0.75f * f3);
            int i5 = 0;
            int i6 = 0;
            while (i5 < size2) {
                float b2 = b((r47) arrayList.get(i5));
                this.d0[i5] = i6;
                int[] iArr = this.e0;
                int i7 = i5;
                float f4 = this.c0;
                iArr[i7] = (int) Math.min(f3, Math.max(f4 * 0.5f, Math.min(f4 * 1.6f, f4 * b2)));
                i6 = uh9.w(4.0f, this.e0[i7], i6);
                i5 = i7 + 1;
                size2 = size2;
                round = round;
                i4 = TLObject.FLAG_30;
            }
        }
        int i8 = round;
        int i9 = i4;
        this.y.measure(View.MeasureSpec.makeMeasureSpec(size, i9), View.MeasureSpec.makeMeasureSpec(this.c0, i9));
        int L3 = hl.L(36.0f);
        boolean z2 = this.L;
        int i10 = L3 + (z2 ? i8 + round2 : i3);
        if (this.c0 > 0) {
            i10 = (z2 ? hl.L(8.0f) + hl.L(36.0f) + i8 + round2 : hl.L(40.0f)) + this.c0;
        }
        this.V = qu6.e(12.0f, i10, hl.L(60.0f));
        int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(hl.L(18.0f), TLObject.FLAG_30);
        TextView textView3 = this.n;
        int i11 = i3;
        textView3.measure(i11, makeMeasureSpec4);
        textView.measure(i11, View.MeasureSpec.makeMeasureSpec(hl.L(18.0f), TLObject.FLAG_30));
        this.f.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (hl.U1(f, qu6.x(28.0f, L, ceil), ((L2 - ceil) - (textView3.getVisibility() == 8 ? 0 : hl.L(10.0f) + textView3.getMeasuredWidth())) - hl.L(8.0f)) / hl.R1(0.8666667f, 1.0f, this.R))), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(hl.L(20.0f), TLObject.FLAG_30));
        int round3 = Math.round(hl.U1(f, hl.L(16.0f), hl.L(36.0f)));
        this.c.measure(View.MeasureSpec.makeMeasureSpec(round3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(round3, TLObject.FLAG_30));
        int i12 = 0;
        while (true) {
            de0[] de0VarArr = this.d;
            if (i12 >= de0VarArr.length) {
                break;
            }
            int i13 = this.O;
            int L4 = i13 >= 3 ? D : i13 == 2 ? hl.L(48.0f) : hl.L(72.0f);
            int L5 = (this.O < 3 || i12 <= 0) ? hl.L(72.0f) : D;
            if (i12 < this.O) {
                if (i12 < this.e0.length && f > 0.0f) {
                    L4 = Math.round(hl.U1(f, L4, r9[i12]));
                    L5 = Math.round(hl.U1(f, L5, this.c0));
                }
            }
            de0VarArr[i12].measure(View.MeasureSpec.makeMeasureSpec(L4, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(L5, TLObject.FLAG_30));
            i12++;
        }
        for (TextView textView4 : this.e) {
            textView4.measure(View.MeasureSpec.makeMeasureSpec(this.O == 2 ? hl.L(40.0f) : hl.L(64.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(hl.L(16.0f), TLObject.FLAG_30));
        }
        setMeasuredDimension(size, Math.round(hl.U1(f, this.U, this.V)));
    }

    public final void p() {
        r47 r47Var;
        t94 t94Var = this.I;
        if (t94Var == null || (r47Var = this.J) == null) {
            return;
        }
        im7 im7Var = (im7) t94Var;
        lm7 lm7Var = im7Var.z3;
        km7 km7Var = (km7) lm7Var.V.get(lm7.B0(im7Var.n3, r47Var));
        if (km7Var == null) {
            km7Var = lm7Var.U;
        }
        float f = km7Var.a;
        im7 im7Var2 = (im7) this.I;
        km7 km7Var2 = (km7) im7Var2.z3.W.get(lm7.B0(im7Var2.n3, this.J));
        float f2 = km7Var2 != null ? km7Var2.a : 0.0f;
        float max = Math.max(0.0f, Math.min(1.0f, f));
        float max2 = Math.max(0.0f, Math.min(1.0f, f2));
        if (this.R == max && this.S == max2) {
            return;
        }
        this.R = max;
        this.S = max2;
        requestLayout();
        invalidate();
    }

    public final TextView q(Context context, int i, int i2) {
        TextView textView = new TextView(context);
        textView.setTextSize(i);
        yob.X(textView, i2, this.b);
        textView.setIncludeFontPadding(false);
        textView.setElegantTextHeight(false);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            textView.setFallbackLineSpacing(false);
        }
        if (i3 >= 35) {
            textView.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        textView.setGravity(16);
        return textView;
    }

    public void setHost(t94 t94Var) {
        this.I = t94Var;
    }

    public void setMessage(r47 r47Var) {
        m(r47Var, null);
    }

    @Override // eu5
    public void setScrimHidden(boolean z) {
        if (this.n0 != z) {
            this.n0 = z;
            if (getParent() instanceof View) {
                ((View) getParent()).invalidate();
            }
        }
    }
}
