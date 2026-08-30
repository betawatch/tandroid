package tf;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.c9;
import vh.v2;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class x0 extends FrameLayout {
    public final f6 a;
    public final c9 b;
    public final TextView[] c;
    public final TextView[] d;
    public float e;
    public ValueAnimator f;

    public x0(Context context, f6 f6Var) {
        super(context);
        this.c = new TextView[2];
        this.d = new TextView[2];
        this.a = f6Var;
        setWillNotDraw(false);
        c9 c9Var = new c9(this, false);
        this.b = c9Var;
        c9Var.l = true;
        c9Var.p = AndroidUtilities.dp(75.0f);
        c9Var.o = AndroidUtilities.dp(48.0f);
        c9Var.x = true;
        c9Var.s = AndroidUtilities.dp(22.0f);
        int i10 = 0;
        while (i10 < 2) {
            this.c[i10] = new TextView(context);
            this.c[i10].setTextColor(j6.v0(j6.G6, f6Var));
            this.c[i10].setTypeface(AndroidUtilities.bold());
            this.c[i10].setTextSize(1, 14.0f);
            int i11 = 8;
            this.c[i10].setVisibility(i10 == 0 ? 0 : 8);
            addView(this.c[i10], b6.d(-1, -2.0f, 48, 76.0f, 7.0f, 40.0f, 0.0f));
            this.d[i10] = new TextView(context);
            this.d[i10].setTextColor(j6.v0(j6.z6, f6Var));
            this.d[i10].setTextSize(1, 12.0f);
            TextView textView = this.d[i10];
            if (i10 == 0) {
                i11 = 0;
            }
            textView.setVisibility(i11);
            addView(this.d[i10], b6.d(-1, -2.0f, 48, 76.0f, 26.33f, 40.0f, 0.0f));
            i10++;
        }
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_arrowright);
        imageView.setColorFilter(new PorterDuffColorFilter(j6.v0(j6.P5, f6Var), PorterDuff.Mode.SRC_IN));
        addView(imageView, b6.d(24, 24.0f, 21, 0.0f, 0.0f, 8.66f, 0.0f));
    }

    public final boolean a(nh.f6 f6Var) {
        String str;
        c9 c9Var;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = f6Var.i;
            str = f6Var.D;
            int size = arrayList.size();
            c9Var = this.b;
            if (i10 >= size || i11 >= 3) {
                break;
            }
            MessageObject messageObject = (MessageObject) f6Var.i.get(i10);
            long j10 = messageObject.storyItem.dialogId;
            TextUtils.isEmpty(str);
            c9Var.l(i11, messageObject.storyItem, f6Var.c);
            i11++;
            i10++;
        }
        c9Var.k(i11);
        c9Var.b(false, true);
        boolean isEmpty = TextUtils.isEmpty(str);
        TextView[] textViewArr = this.c;
        if (isEmpty) {
            textViewArr[0].setText(LocaleController.formatPluralStringSpaced("HashtagStoriesFound", f6Var.J));
        } else {
            textViewArr[0].setText(AndroidUtilities.replaceSingleLink(LocaleController.formatPluralStringSpaced("HashtagStoriesFoundChannel", f6Var.J, "@" + str), j6.v0(j6.Oh, this.a), null));
        }
        this.d[0].setText(LocaleController.formatString(R.string.HashtagStoriesFoundSubtitle, f6Var.C));
        return i11 > 0;
    }

    public final void b(int i10, String str, String str2) {
        boolean isEmpty = TextUtils.isEmpty(str2);
        TextView[] textViewArr = this.c;
        if (isEmpty) {
            textViewArr[1].setText(LocaleController.formatPluralStringSpaced("HashtagMessagesFound", i10));
        } else {
            textViewArr[1].setText(AndroidUtilities.replaceSingleLink(LocaleController.formatPluralStringSpaced("HashtagMessagesFoundChannel", i10, v2.e("@", str2)), j6.v0(j6.Oh, this.a), null));
        }
        this.d[1].setText(LocaleController.formatString(R.string.HashtagMessagesFoundSubtitle, str));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.e > 0.0f) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.e) * 255.0f), 31);
        } else {
            canvas.save();
        }
        canvas.translate(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), this.e), 0.0f);
        this.b.i(canvas);
        canvas.restore();
        super.onDraw(canvas);
        Paint T0 = j6.T0("paintDivider", this.a);
        if (T0 == null) {
            T0 = j6.k0;
        }
        canvas.drawRect(0.0f, getHeight() - 1, getWidth(), getHeight(), T0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
    }
}
