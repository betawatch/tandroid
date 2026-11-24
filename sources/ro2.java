// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ro2 extends FrameLayout implements vlb {
    public final ylb a;
    public final bf0 b;
    public final TextView c;
    public final TextView d;
    public final ImageView e;

    public ro2(Context context, ylb ylbVar) {
        super(context);
        this.a = ylbVar;
        bf0 bf0Var = new bf0(context);
        this.b = bf0Var;
        bf0Var.setRoundRadius(gm.L(7.3125f));
        addView(bf0Var, qoe.d(26, 26.0f, 19, 16.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 16.0f);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, qoe.o(-1, -2));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, qoe.k(0.0f, 2.0f, 0.0f, 0.0f, -1, -2));
        addView(linearLayout, qoe.d(-1, -2.0f, 19, 58.0f, 0.0f, 48.0f, 1.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(R.drawable.msg_inputarrow);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, qoe.d(24, 24.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        updateColors();
    }

    public final void a(int i, TLRPC.Chat chat) {
        if (chat == null) {
            return;
        }
        TLRPC.ChatFull M0 = oc7.r1(i).M0(chat.id);
        setTitle(pg3.t(chat));
        setSubtitle(jb6.G(M0 != null ? M0.linked_peers.size() : 0, "CommunityWithChats", new Object[0]));
        this.b.f(chat, new pc0(chat));
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.y6));
        hashSet.add(Integer.valueOf(cmb.F6));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable drawable = cmb.R0;
        bf0 bf0Var = this.b;
        ur3.a(canvas, drawable, (bf0Var.getWidth() / 2.0f) + bf0Var.getLeft(), (bf0Var.getHeight() / 2.0f) + bf0Var.getTop(), bf0Var.getHeight());
        super.dispatchDraw(canvas);
        ylb ylbVar = this.a;
        Paint d = ylbVar != null ? ylbVar.d("paintDivider") : null;
        if (d == null) {
            d = cmb.j0;
        }
        canvas.drawLine(gm.L(58.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, d);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(56.0f), TLObject.FLAG_30));
    }

    public void setSubtitle(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.c.setText(charSequence);
    }

    @Override // vlb
    public final void updateColors() {
        int i = cmb.y6;
        ylb ylbVar = this.a;
        this.e.setColorFilter(cmb.v0(i, ylbVar));
        this.c.setTextColor(cmb.v0(cmb.F6, ylbVar));
        this.d.setTextColor(cmb.v0(i, ylbVar));
    }
}
