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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class vk2 extends FrameLayout implements tjb {
    public final wjb a;
    public final be0 b;
    public final TextView c;
    public final TextView d;
    public boolean e;
    public boolean f;
    public Drawable h;
    public ShapeDrawable n;
    public int r;

    public vk2(Context context, wjb wjbVar) {
        super(context);
        this.a = wjbVar;
        setWillNotDraw(false);
        be0 be0Var = new be0(context);
        this.b = be0Var;
        be0Var.setRoundRadius(gl.L(8.0f));
        addView(be0Var, nme.d(46, 46.0f, 19, 15.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(16);
        addView(linearLayout, nme.d(-1, -1.0f, kk7.D1, 71.0f, 0.0f, 20.0f, 0.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setIncludeFontPadding(false);
        textView.setGravity(16);
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(gl.n1("fonts/rmedium.ttf"));
        linearLayout.addView(textView, nme.o(-1, 20));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        textView2.setIncludeFontPadding(false);
        textView2.setGravity(16);
        textView2.setTextSize(1, 14.0f);
        linearLayout.addView(textView2, nme.k(0.0f, 2.0f, 0.0f, 0.0f, -1, 18));
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

    public static gl5 c(TL_wallet.nftItem nftitem, boolean z) {
        TLRPC.WebDocument webDocument;
        if ((!z || (webDocument = nftitem.image_small) == null) && (webDocument = nftitem.image) == null) {
            webDocument = nftitem.image_small;
        }
        if (webDocument == null) {
            return null;
        }
        return gl5.p(usc.c(webDocument));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGrid(boolean z) {
        if (this.f == z) {
            return;
        }
        this.f = z;
        FrameLayout.LayoutParams d = z ? nme.d(-1, -1.0f, kk7.D1, 3.33f, 4.0f, 3.33f, 4.0f) : nme.d(46, 46.0f, 19, 15.0f, 0.0f, 0.0f, 0.0f);
        be0 be0Var = this.b;
        be0Var.setLayoutParams(d);
        be0Var.setRoundRadius(gl.L(z ? 11.0f : 8.0f));
        ((View) this.c.getParent()).setVisibility(z ? 8 : 0);
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.y6));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int v0;
        super.onDraw(canvas);
        if (this.h != null && this.n != null && (v0 = bkb.v0(bkb.x6, this.a)) != this.r) {
            this.r = v0;
            this.h.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
            bkb.A1(bkb.p1(0.1f, v0), this.n);
            be0 be0Var = this.b;
            if (be0Var != null) {
                be0Var.invalidate();
            }
        }
        if (this.e) {
            canvas.drawRect(k96.a0 ? 0.0f : gl.L(71.0f), getHeight() - 1, getWidth() - (k96.a0 ? gl.L(71.0f) : 0), getHeight(), bkb.j0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(this.f ? 112.0f : 58.0f), TLObject.FLAG_30));
    }

    @Override // tjb
    public final void updateColors() {
        setBackgroundColor(0);
        int i = bkb.F6;
        wjb wjbVar = this.a;
        this.c.setTextColor(bkb.v0(i, wjbVar));
        this.d.setTextColor(bkb.v0(bkb.y6, wjbVar));
    }
}
