// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class pl2 extends FrameLayout implements snb {
    public final vnb a;
    public final de0 b;
    public final TextView c;
    public final TextView d;
    public boolean e;
    public boolean f;
    public Drawable h;
    public ShapeDrawable n;
    public int r;

    public pl2(Context context, vnb vnbVar) {
        super(context);
        this.a = vnbVar;
        setWillNotDraw(false);
        de0 de0Var = new de0(context);
        this.b = de0Var;
        de0Var.setRoundRadius(hl.L(8.0f));
        addView(de0Var, tre.d(46, 46.0f, 19, 15.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(16);
        addView(linearLayout, tre.d(-1, -1.0f, jn7.D1, 71.0f, 0.0f, 20.0f, 0.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setIncludeFontPadding(false);
        textView.setGravity(16);
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(hl.n1("fonts/rmedium.ttf"));
        linearLayout.addView(textView, tre.o(-1, 20));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        textView2.setIncludeFontPadding(false);
        textView2.setGravity(16);
        textView2.setTextSize(1, 14.0f);
        linearLayout.addView(textView2, tre.k(0.0f, 2.0f, 0.0f, 0.0f, -1, 18));
        updateColors();
    }

    public static String b(TL_wallet.nftItem nftitem, String str) {
        ArrayList<TL_wallet.nftAttribute> arrayList = nftitem.attributes;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            TL_wallet.nftAttribute nftattribute = arrayList.get(i);
            i++;
            TL_wallet.nftAttribute nftattribute2 = nftattribute;
            if (TextUtils.equals(nftattribute2.trait_type, str)) {
                return nftattribute2.value;
            }
        }
        return null;
    }

    public static jn5 c(TL_wallet.nftItem nftitem, boolean z) {
        TLRPC.WebDocument webDocument;
        if ((!z || (webDocument = nftitem.image_small) == null) && (webDocument = nftitem.image) == null) {
            webDocument = nftitem.image_small;
        }
        if (webDocument == null) {
            return null;
        }
        return jn5.p(jxc.c(webDocument));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGrid(boolean z) {
        if (this.f == z) {
            return;
        }
        this.f = z;
        FrameLayout.LayoutParams d = z ? tre.d(-1, -1.0f, jn7.D1, 3.33f, 4.0f, 3.33f, 4.0f) : tre.d(46, 46.0f, 19, 15.0f, 0.0f, 0.0f, 0.0f);
        de0 de0Var = this.b;
        de0Var.setLayoutParams(d);
        de0Var.setRoundRadius(hl.L(z ? 11.0f : 8.0f));
        ((View) this.c.getParent()).setVisibility(z ? 8 : 0);
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.z6));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int v0;
        super.onDraw(canvas);
        if (this.h != null && this.n != null && (v0 = aob.v0(aob.y6, this.a)) != this.r) {
            this.r = v0;
            this.h.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
            aob.A1(aob.p1(0.1f, v0), this.n);
            de0 de0Var = this.b;
            if (de0Var != null) {
                de0Var.invalidate();
            }
        }
        if (this.e) {
            canvas.drawRect(ob6.a0 ? 0.0f : hl.L(71.0f), getHeight() - 1, getWidth() - (ob6.a0 ? hl.L(71.0f) : 0), getHeight(), aob.j0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(this.f ? 112.0f : 58.0f), TLObject.FLAG_30));
    }

    @Override // snb
    public final void updateColors() {
        setBackgroundColor(0);
        int i = aob.G6;
        vnb vnbVar = this.a;
        this.c.setTextColor(aob.v0(i, vnbVar));
        this.d.setTextColor(aob.v0(aob.z6, vnbVar));
    }
}
