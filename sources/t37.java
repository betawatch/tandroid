// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class t37 extends FrameLayout implements tjb {
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;
    public final hc0 d;
    public final jia e;
    public final int f;
    public final boolean h;
    public final pi4 n;
    public boolean r;
    public rkb s;
    public int w;

    public t37(Context context, int i, k27 k27Var, TLRPC.Chat chat) {
        super(context);
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.f = i;
        boolean z = k27Var.g4() || k27.Q4(k27Var.k);
        this.h = z;
        pi4 pi4Var = new pi4(context, null);
        this.n = pi4Var;
        pi4Var.e(bkb.F8, bkb.h6, -1);
        pi4Var.setViewType(13);
        pi4Var.setIsSingleCell(false);
        addView(pi4Var, nme.c(-1.0f, -2));
        jia jiaVar = new jia(context);
        this.e = jiaVar;
        jiaVar.setTextSize(16);
        jiaVar.setEllipsizeByGradient(true);
        jiaVar.setRightPadding(gl.L(62.0f));
        addView(jiaVar, nme.d(0, -2.0f, 19, 40.0f, 0.0f, 0.0f, 0.0f));
        hc0 hc0Var = new hc0(context, false);
        this.d = hc0Var;
        hc0Var.setStyle(11);
        hc0Var.setAvatarsTextSize(gl.L(22.0f));
        addView(hc0Var, nme.d(56, -1.0f, 21, 0.0f, 0.0f, 0.0f, 0.0f));
        zkb.W(jiaVar, bkb.D8, null);
        TLRPC.TL_messages_getMessageReadParticipants tL_messages_getMessageReadParticipants = new TLRPC.TL_messages_getMessageReadParticipants();
        tL_messages_getMessageReadParticipants.msg_id = k27Var.e1();
        tL_messages_getMessageReadParticipants.peer = na7.q1(i).h1(k27.B0(k27Var.k));
        ImageView imageView = new ImageView(context);
        addView(imageView, nme.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        Drawable mutate = context.getDrawable(z ? R.drawable.msg_played : R.drawable.msg_seen).mutate();
        zkb.x(this, mutate, bkb.E8, null, PorterDuff.Mode.MULTIPLY);
        imageView.setImageDrawable(mutate);
        hc0Var.setAlpha(0.0f);
        jiaVar.setAlpha(0.0f);
        TLRPC.Peer peer = k27Var.k.from_id;
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_getMessageReadParticipants, new tg(this, peer != null ? peer.user_id : 0L, i, chat));
        int w0 = bkb.w0(null, bkb.H5, false);
        this.w = w0;
        setBackground(bkb.Y(w0, 6, 0));
        setEnabled(false);
    }

    public final o39 a() {
        rkb rkbVar = this.s;
        if (rkbVar != null) {
            return rkbVar;
        }
        rkb rkbVar2 = new rkb(getContext(), null, (byte) 9);
        this.s = rkbVar2;
        getContext();
        rkbVar2.setLayoutManager(new t26());
        this.s.i(new kr(this, (byte) 6));
        this.s.setAdapter(new gx0(this, (byte) 4));
        return this.s;
    }

    public final void b() {
        hc0 hc0Var;
        ArrayList arrayList = this.c;
        setEnabled(arrayList.size() > 0);
        int i = 0;
        while (true) {
            hc0Var = this.d;
            if (i >= 3) {
                break;
            }
            int size = arrayList.size();
            int i2 = this.f;
            if (i < size) {
                hc0Var.b(i, i2, (TLObject) arrayList.get(i));
            } else {
                hc0Var.b(i, i2, null);
            }
            i++;
        }
        if (arrayList.size() == 1) {
            hc0Var.setTranslationX(gl.L(24.0f));
        } else if (arrayList.size() == 2) {
            hc0Var.setTranslationX(gl.L(12.0f));
        } else {
            hc0Var.setTranslationX(0.0f);
        }
        int L = gl.L((Math.min(2, arrayList.size() - 1) * 12) + 38);
        jia jiaVar = this.e;
        jiaVar.setRightPadding(L);
        hc0Var.a(false);
        ArrayList arrayList2 = this.a;
        if (arrayList2.size() == 1 && arrayList.get(0) != null) {
            jiaVar.l(qu2.o((TLObject) arrayList.get(0)), false);
        } else if (arrayList2.size() == 0) {
            jiaVar.l(k96.M0(2131747932, null), false);
        } else {
            jiaVar.l(k96.G(arrayList2.size(), this.h ? "MessagePlayed" : "MessageSeen", new Object[0]), false);
        }
        jiaVar.animate().alpha(1.0f).setDuration(220L).start();
        hc0Var.animate().alpha(1.0f).setDuration(220L).start();
        pi4 pi4Var = this.n;
        pi4Var.animate().alpha(0.0f).setDuration(220L).setListener(new id4(pi4Var)).start();
        rkb rkbVar = this.s;
        if (rkbVar != null) {
            rkbVar.getAdapter();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i = View.MeasureSpec.makeMeasureSpec(view.getWidth(), TLObject.FLAG_30);
        }
        this.r = true;
        pi4 pi4Var = this.n;
        boolean z = pi4Var.getVisibility() == 0;
        jia jiaVar = this.e;
        jiaVar.setVisibility(8);
        if (z) {
            pi4Var.setVisibility(8);
        }
        super.onMeasure(i, i2);
        if (z) {
            pi4Var.getLayoutParams().width = getMeasuredWidth();
            pi4Var.setVisibility(0);
        }
        jiaVar.setVisibility(0);
        jiaVar.getLayoutParams().width = getMeasuredWidth() - gl.L(40.0f);
        this.r = false;
        super.onMeasure(i, i2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.r) {
            return;
        }
        super.requestLayout();
    }

    @Override // tjb
    public final void updateColors() {
        try {
            int w0 = bkb.w0(null, bkb.H5, false);
            if (getBackground() != null && w0 != this.w) {
                this.w = w0;
                bkb.F1(getBackground(), w0, true);
            }
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
