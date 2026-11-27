// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class z0 extends FrameLayout implements snb {
    public final int a;
    public final vnb b;
    public int c;
    public boolean d;
    public TL_aicompose.AiComposeTone e;
    public boolean f;
    public final de0 h;
    public final TextView n;
    public float r;

    public z0(int i, vnb vnbVar, Context context) {
        super(context);
        this.d = true;
        this.a = i;
        this.b = vnbVar;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        addView(linearLayout, tre.d(-2, -2.0f, 17, 0.0f, 2.0f, 0.0f, 2.0f));
        de0 de0Var = new de0(context);
        this.h = de0Var;
        jn7.i(de0Var);
        linearLayout.addView(de0Var, tre.t(24, 24, 49, 0, 4, 0, 0));
        TextView textView = new TextView(context);
        this.n = textView;
        textView.setTypeface(hl.o());
        textView.setTextSize(1, 12.0f);
        textView.setGravity(17);
        textView.setSingleLine();
        linearLayout.addView(textView, tre.t(-2, -2, 49, 0, 2, 0, 0));
        iye.b(this, 0.05f, 1.5f);
        b(true, 0.0f);
    }

    public final void a(String str, CharSequence charSequence, Long l) {
        int i;
        this.f = true;
        de0 de0Var = this.h;
        de0Var.setColorFilter(null);
        de0Var.setImageDrawable(pv3.g(str));
        this.n.setText(charSequence);
        int i2 = this.a;
        byte b = 0;
        if (ConnectionsManager.getInstance(i2).isTestBackend()) {
            i = 0;
            while (i < 4) {
                if (yac.h(i).o() && !ConnectionsManager.getInstance(i).isTestBackend()) {
                    break;
                } else {
                    i++;
                }
            }
        }
        i = i2;
        if (l != null) {
            de0Var.setAnimatedEmojiDrawable(new wl(9, i2, l.longValue()));
        } else {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
            ls6.d0(i).m0(tL_inputStickerSetShortName, null, false, false, new y0(this, str, b));
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.Fi));
        hashSet.add(Integer.valueOf(aob.i6));
    }

    public final void b(boolean z, float f) {
        if (z || Math.abs(f - this.r) >= 0.01f) {
            this.r = f;
            int i = aob.G6;
            vnb vnbVar = this.b;
            int v0 = aob.v0(i, vnbVar);
            int i2 = aob.Fi;
            int f2 = vm2.f(f, v0, aob.v0(i2, vnbVar));
            int f3 = vm2.f(f, aob.v0(i, vnbVar), aob.v0(i2, vnbVar));
            PorterDuffColorFilter porterDuffColorFilter = !this.f ? new PorterDuffColorFilter(f2, PorterDuff.Mode.SRC_IN) : null;
            de0 de0Var = this.h;
            de0Var.setColorFilter(porterDuffColorFilter);
            de0Var.setEmojiColorFilter(new PorterDuffColorFilter(f2, PorterDuff.Mode.SRC_IN));
            de0Var.invalidate();
            this.n.setTextColor(f3);
        }
    }

    @Override // snb
    public final void updateColors() {
        b(true, this.r);
        boolean z = this.d;
        vnb vnbVar = this.b;
        int p1 = z ? aob.p1(0.1f, aob.v0(aob.Fi, vnbVar)) : aob.v0(aob.i6, vnbVar);
        int i = this.c;
        setBackground(aob.Y(p1, i, i));
    }
}
