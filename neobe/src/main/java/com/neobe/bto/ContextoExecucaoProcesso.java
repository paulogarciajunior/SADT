package com.neobe.bto;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
@javax.persistence.Table(name = "ContextoExecucaoProcesso")
public class ContextoExecucaoProcesso implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "CONTEXTOEXECUCAOPROCESSO_ID_GENERATOR")
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(sequenceName = "CONTEXTOEXECUCAOPROCESSO_ID_SEQ", name = "CONTEXTOEXECUCAOPROCESSO_ID_GENERATOR")
	private java.lang.Long id;

	@org.kie.api.definition.type.Label("Guia de solicitação")
	@javax.persistence.ManyToOne(fetch = javax.persistence.FetchType.EAGER, cascade = {javax.persistence.CascadeType.ALL})
	private com.neobe.bto.GuiaSolicitacao guiaSolicitacao;

	@org.kie.api.definition.type.Label("negada?")
	private java.lang.Boolean negada;

	@org.kie.api.definition.type.Label("internação?")
	private java.lang.Boolean internacao;

	@org.kie.api.definition.type.Label("Possui NIP ou liminar?")
	private boolean nip_liminar;

	@org.kie.api.definition.type.Label("Operadora procede com atendimento (NIP/liminar)")
	private boolean nip_liminar_operadora_procede;

	@org.kie.api.definition.type.Label("Contato médico?")
	private boolean acao_contato_medico;

	@org.kie.api.definition.type.Label("Necessário documentação adicional?")
	private boolean acao_documentacao_adicional;

	@org.kie.api.definition.type.Label("Análise técnica especializada?")
	private boolean acao_analise_tecnica_especializada;

	@org.kie.api.definition.type.Label("DUT/ROL?")
	private boolean acao_dut_rol;

	@org.kie.api.definition.type.Label("Operadora possui junta médica?")
	private boolean operadorapossuijuntamedica;

	@org.kie.api.definition.type.Label("Url do serviço de fila")
	private java.lang.String urlServicoFila;

	@org.kie.api.definition.type.Label("Tipo")
	private java.lang.String tipo;

	@org.kie.api.definition.type.Label("Ultrapassou o limite?")
	private java.lang.Boolean ultrapassoulimite;

	@org.kie.api.definition.type.Label("Possui negação de beneficiário?")
	private java.lang.Boolean possuinegacaobeneficiario;

	@org.kie.api.definition.type.Label("Possui negação de prestador?")
	private java.lang.Boolean possuinegacaoprestador;

	@org.kie.api.definition.type.Label("Possui negação de evento?")
	private java.lang.Boolean possuinegacaoevento;

	@org.kie.api.definition.type.Label("Autorizado no processo de regulação?")
	private java.lang.Boolean autorizadoprocessoregulacao;

	@org.kie.api.definition.type.Label("Selecione o tipo do SADT")
	private java.lang.String SADT_tipo;

	@org.kie.api.definition.type.Label("Selecione o subtipo do SADT")
	private java.lang.String SADT_subtipo;

	@org.kie.api.definition.type.Label("Paracer médico")
	private java.lang.String parecermedico;

	@org.kie.api.definition.type.Label("Documentação ok?")
	private java.lang.Boolean documentacao_ok;

	@org.kie.api.definition.type.Label("Relação dos documentos necessários")
	private java.lang.String descricao_documentacao_necessaria;

	@org.kie.api.definition.type.Label(value = "Operadora")
	private java.lang.String operadora;

	public ContextoExecucaoProcesso() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public com.neobe.bto.GuiaSolicitacao getGuiaSolicitacao() {
		return this.guiaSolicitacao;
	}

	public void setGuiaSolicitacao(com.neobe.bto.GuiaSolicitacao guiaSolicitacao) {
		this.guiaSolicitacao = guiaSolicitacao;
	}

	public java.lang.Boolean getNegada() {
		return this.guiaSolicitacao.getNegativas().size() > 0;
	}

	public void setNegada(java.lang.Boolean negada) {
		this.negada = negada;
	}

	public java.lang.Boolean getInternacao() {
		return this.internacao;
	}

	public void setInternacao(java.lang.Boolean internacao) {
		this.internacao = internacao;
	}

	public java.lang.String getUrlServicoFila() {
		return this.urlServicoFila;
	}

	public void setUrlServicoFila(java.lang.String urlServicoFila) {
		this.urlServicoFila = urlServicoFila;
	}

	public boolean isNip_liminar() {
		return this.nip_liminar;
	}

	public void setNip_liminar(boolean nip_liminar) {
		this.nip_liminar = nip_liminar;
	}

	public boolean isNip_liminar_operadora_procede() {
		return this.nip_liminar_operadora_procede;
	}

	public void setNip_liminar_operadora_procede(
			boolean nip_liminar_operadora_procede) {
		this.nip_liminar_operadora_procede = nip_liminar_operadora_procede;
	}

	public boolean isAcao_contato_medico() {
		return this.acao_contato_medico;
	}

	public void setAcao_contato_medico(boolean acao_contato_medico) {
		this.acao_contato_medico = acao_contato_medico;
	}

	public boolean isAcao_documentacao_adicional() {
		return this.acao_documentacao_adicional;
	}

	public void setAcao_documentacao_adicional(
			boolean acao_documentacao_adicional) {
		this.acao_documentacao_adicional = acao_documentacao_adicional;
	}

	public boolean isAcao_analise_tecnica_especializada() {
		return this.acao_analise_tecnica_especializada;
	}

	public void setAcao_analise_tecnica_especializada(
			boolean acao_analise_tecnica_especializada) {
		this.acao_analise_tecnica_especializada = acao_analise_tecnica_especializada;
	}

	public boolean isAcao_dut_rol() {
		return this.acao_dut_rol;
	}

	public void setAcao_dut_rol(boolean acao_dut_rol) {
		this.acao_dut_rol = acao_dut_rol;
	}

	public boolean isOperadorapossuijuntamedica() {
		return this.operadorapossuijuntamedica;
	}

	public void setOperadorapossuijuntamedica(boolean operadorapossuijuntamedica) {
		this.operadorapossuijuntamedica = operadorapossuijuntamedica;
	}

	public java.lang.String getTipo() {
		return this.tipo;
	}

	public void setTipo(java.lang.String tipo) {
		this.tipo = tipo;
	}

	public java.lang.Boolean getUltrapassoulimite() {
		return this.ultrapassoulimite;
	}

	public void setUltrapassoulimite(java.lang.Boolean ultrapassoulimite) {
		this.ultrapassoulimite = ultrapassoulimite;
	}

	public java.lang.Boolean getPossuinegacaobeneficiario() {
		return this.possuinegacaobeneficiario;
	}

	public void setPossuinegacaobeneficiario(
			java.lang.Boolean possuinegacaobeneficiario) {
		this.possuinegacaobeneficiario = possuinegacaobeneficiario;
	}

	public java.lang.Boolean getPossuinegacaoprestador() {
		return this.possuinegacaoprestador;
	}

	public void setPossuinegacaoprestador(
			java.lang.Boolean possuinegacaoprestador) {
		this.possuinegacaoprestador = possuinegacaoprestador;
	}

	public java.lang.Boolean getPossuinegacaoevento() {
		return this.possuinegacaoevento;
	}

	public void setPossuinegacaoevento(java.lang.Boolean possuinegacaoevento) {
		this.possuinegacaoevento = possuinegacaoevento;
	}

	public java.lang.Boolean getAutorizadoprocessoregulacao() {
		return this.autorizadoprocessoregulacao;
	}

	public void setAutorizadoprocessoregulacao(
			java.lang.Boolean autorizadoprocessoregulacao) {
		this.autorizadoprocessoregulacao = autorizadoprocessoregulacao;
	}

	public java.lang.String getSADT_tipo() {
		return this.SADT_tipo;
	}

	public void setSADT_tipo(java.lang.String SADT_tipo) {
		this.SADT_tipo = SADT_tipo;
	}

	public java.lang.String getSADT_subtipo() {
		return this.SADT_subtipo;
	}

	public void setSADT_subtipo(java.lang.String SADT_subtipo) {
		this.SADT_subtipo = SADT_subtipo;
	}

	public java.lang.String getParecermedico() {
		return this.parecermedico;
	}

	public void setParecermedico(java.lang.String parecermedico) {
		this.parecermedico = parecermedico;
	}

	public java.lang.Boolean getDocumentacao_ok() {
		return this.documentacao_ok;
	}

	public void setDocumentacao_ok(java.lang.Boolean documentacao_ok) {
		this.documentacao_ok = documentacao_ok;
	}

	public java.lang.String getDescricao_documentacao_necessaria() {
		return this.descricao_documentacao_necessaria;
	}

	public void setDescricao_documentacao_necessaria(
			java.lang.String descricao_documentacao_necessaria) {
		this.descricao_documentacao_necessaria = descricao_documentacao_necessaria;
	}

	public java.lang.String getOperadora() {
		return this.operadora;
	}

	public void setOperadora(java.lang.String operadora) {
		this.operadora = operadora;
	}

	public ContextoExecucaoProcesso(java.lang.Long id,
			com.neobe.bto.GuiaSolicitacao guiaSolicitacao,
			java.lang.Boolean negada, java.lang.Boolean internacao,
			boolean nip_liminar, boolean nip_liminar_operadora_procede,
			boolean acao_contato_medico, boolean acao_documentacao_adicional,
			boolean acao_analise_tecnica_especializada, boolean acao_dut_rol,
			boolean operadorapossuijuntamedica,
			java.lang.String urlServicoFila, java.lang.String tipo,
			java.lang.Boolean ultrapassoulimite,
			java.lang.Boolean possuinegacaobeneficiario,
			java.lang.Boolean possuinegacaoprestador,
			java.lang.Boolean possuinegacaoevento,
			java.lang.Boolean autorizadoprocessoregulacao,
			java.lang.String SADT_tipo, java.lang.String SADT_subtipo,
			java.lang.String parecermedico, java.lang.Boolean documentacao_ok,
			java.lang.String descricao_documentacao_necessaria,
			java.lang.String operadora) {
		this.id = id;
		this.guiaSolicitacao = guiaSolicitacao;
		this.negada = negada;
		this.internacao = internacao;
		this.nip_liminar = nip_liminar;
		this.nip_liminar_operadora_procede = nip_liminar_operadora_procede;
		this.acao_contato_medico = acao_contato_medico;
		this.acao_documentacao_adicional = acao_documentacao_adicional;
		this.acao_analise_tecnica_especializada = acao_analise_tecnica_especializada;
		this.acao_dut_rol = acao_dut_rol;
		this.operadorapossuijuntamedica = operadorapossuijuntamedica;
		this.urlServicoFila = urlServicoFila;
		this.tipo = tipo;
		this.ultrapassoulimite = ultrapassoulimite;
		this.possuinegacaobeneficiario = possuinegacaobeneficiario;
		this.possuinegacaoprestador = possuinegacaoprestador;
		this.possuinegacaoevento = possuinegacaoevento;
		this.autorizadoprocessoregulacao = autorizadoprocessoregulacao;
		this.SADT_tipo = SADT_tipo;
		this.SADT_subtipo = SADT_subtipo;
		this.parecermedico = parecermedico;
		this.documentacao_ok = documentacao_ok;
		this.descricao_documentacao_necessaria = descricao_documentacao_necessaria;
		this.operadora = operadora;
	}

}