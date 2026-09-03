package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sf implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Serializable h;
    public final /* synthetic */ TLRPC.InputPeer n;
    public final /* synthetic */ int[] r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ rf v;
    public final /* synthetic */ Object w;

    public /* synthetic */ sf(zn znVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z4, rf rfVar, int i11) {
        this.a = i11;
        this.b = znVar;
        this.c = i10;
        this.d = arrayList;
        this.e = str;
        this.f = str2;
        this.h = str3;
        this.n = inputPeer;
        this.r = iArr;
        this.w = obj;
        this.s = z4;
        this.v = rfVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                zn.U0(this.b, this.c, this.d, this.e, this.f, (String) this.h, this.n, this.r, (TL_iv.RichMessage) this.w, this.s, this.v);
                break;
            case 1:
                zn.c0(this.b, this.c, this.d, this.e, this.f, (String) this.h, this.n, this.r, (CharSequence) this.w, this.s, this.v);
                break;
            default:
                zn.x0(this.b, this.c, this.d, (String[]) this.h, this.e, this.f, this.n, this.r, (CharSequence) this.w, this.s, this.v);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ sf(zn znVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z4, rf rfVar) {
        this.a = 2;
        this.b = znVar;
        this.c = i10;
        this.d = arrayList;
        this.h = strArr;
        this.e = str;
        this.f = str2;
        this.n = inputPeer;
        this.r = iArr;
        this.w = charSequence;
        this.s = z4;
        this.v = rfVar;
    }
}
