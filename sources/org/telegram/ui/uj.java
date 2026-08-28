package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class uj implements ft {
    public final /* synthetic */ qn a;

    public uj(qn qnVar) {
        this.a = qnVar;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean C() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean D(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ String G(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean I() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean J() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        if (inputStickerSet != null) {
            qn qnVar = this.a;
            if (qnVar.getParentActivity() == null) {
                return;
            }
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_inputStickerSetID.access_hash = inputStickerSet.access_hash;
            tL_inputStickerSetID.id = inputStickerSet.id;
            org.telegram.ui.Components.cx0 cx0Var = new org.telegram.ui.Components.cx0(qnVar.getParentActivity(), qnVar, tL_inputStickerSetID, null, qnVar.U, qnVar.aa);
            cx0Var.setCalcMandatoryInsets(qnVar.x9());
            cx0Var.e0 = z10;
            qnVar.showDialog(cx0Var);
        }
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean N(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ Boolean P(TLRPC.Document document) {
        return null;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean Q() {
        return true;
    }

    @Override // org.telegram.ui.ft
    public final long a() {
        return this.a.P5;
    }

    @Override // org.telegram.ui.ft
    public final boolean b() {
        return this.a.D6();
    }

    @Override // org.telegram.ui.ft
    public final boolean c() {
        return this.a.N3 == 1;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ TLRPC.PollAnswer g() {
        return null;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final boolean k(int i9) {
        return true;
    }

    @Override // org.telegram.ui.ft
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i9, int i10) {
        this.a.U.a(document, str, obj, null, true, z10, i9, i10);
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ org.telegram.ui.Components.x60 r(fh.v vVar) {
        return null;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ boolean x() {
        return true;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ MessageObject z() {
        return null;
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void B(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void E(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void H(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void L() {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void O(String str) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void i(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void m(String str) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void n(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void p(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void t() {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void u(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void y(String str) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void v(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void w(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void F(CharSequence charSequence, String str, df dfVar) {
    }

    @Override // org.telegram.ui.ft
    public final /* synthetic */ void s(int i9, int i10, Object obj, TLObject tLObject, boolean z10) {
    }
}
