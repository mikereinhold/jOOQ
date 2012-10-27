/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "t_language", schema = "public")
public class TLanguageRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.postgres.generatedclasses.tables.records.TLanguageRecord> {

	private static final long serialVersionUID = -839249139;

	/**
	 * The table column <code>public.t_language.cd</code>
	 */
	public void setCd(java.lang.String value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TLanguage.T_LANGUAGE.CD, value);
	}

	/**
	 * The table column <code>public.t_language.cd</code>
	 */
	@javax.persistence.Column(name = "cd", nullable = false, length = 2)
	public java.lang.String getCd() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TLanguage.T_LANGUAGE.CD);
	}

	/**
	 * The table column <code>public.t_language.description</code>
	 */
	public void setDescription(java.lang.String value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TLanguage.T_LANGUAGE.DESCRIPTION, value);
	}

	/**
	 * The table column <code>public.t_language.description</code>
	 */
	@javax.persistence.Column(name = "description", length = 50)
	public java.lang.String getDescription() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TLanguage.T_LANGUAGE.DESCRIPTION);
	}

	/**
	 * The table column <code>public.t_language.description_english</code>
	 */
	public void setDescriptionEnglish(java.lang.String value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TLanguage.T_LANGUAGE.DESCRIPTION_ENGLISH, value);
	}

	/**
	 * The table column <code>public.t_language.description_english</code>
	 */
	@javax.persistence.Column(name = "description_english", length = 50)
	public java.lang.String getDescriptionEnglish() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TLanguage.T_LANGUAGE.DESCRIPTION_ENGLISH);
	}

	/**
	 * The table column <code>public.t_language.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TLanguage.T_LANGUAGE.ID, value);
	}

	/**
	 * The table column <code>public.t_language.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 32)
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TLanguage.T_LANGUAGE.ID);
	}

	/**
	 * The table column <code>public.t_language.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.util.List<org.jooq.test.postgres.generatedclasses.tables.records.TBookRecord> fetchTBookList() {
		return create()
			.selectFrom(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK)
			.where(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK.LANGUAGE_ID.equal(getValue(org.jooq.test.postgres.generatedclasses.tables.TLanguage.T_LANGUAGE.ID)))
			.fetch();
	}

	/**
	 * Create a detached TLanguageRecord
	 */
	public TLanguageRecord() {
		super(org.jooq.test.postgres.generatedclasses.tables.TLanguage.T_LANGUAGE);
	}
}