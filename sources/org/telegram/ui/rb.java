package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class rb extends k7.d6 {
    public MessageObject a;
    public int b = 0;
    public boolean c = true;
    public int d = 0;
    public int e;
    public final /* synthetic */ sb f;

    public rb(sb sbVar) {
        this.f = sbVar;
    }

    @Override // k7.d6
    public final void a() {
        MessageObject messageObject = this.a;
        sb sbVar = this.f;
        if (messageObject != null) {
            int indexOf = sbVar.p0.indexOf(messageObject) + sbVar.F.f;
            if (indexOf >= 0) {
                sbVar.D.i1(indexOf, this.e, false);
            }
        } else {
            sbVar.D.i1(this.b, this.d, this.c);
        }
        this.a = null;
        sbVar.W = true;
        sbVar.e1();
        AndroidUtilities.runOnUIThread(new yt0(this, 21));
    }

    @Override // k7.d6
    public final void c() {
        sb sbVar = this.f;
        sbVar.L0 = sbVar.getNotificationCenter().setAnimationInProgress(sbVar.L0, sb.V0);
    }

    @Override // k7.d6
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.t1) {
            this.f.v.add((org.telegram.ui.Cells.t1) view);
        }
    }
}
